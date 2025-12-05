//Thiago Barbosa da Silva
// Laísa Medeiros

package Exercicios.Trabalho4;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.FileOutputStream;
import java.io.IOException;

public class Compressao {

    private static final int CHUNK_SIZE = 21;

    public byte[] comprimirEObterBytes(String nomeArquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            String linha;
            while ((linha = br.readLine()) != null) {
                if (!linha.isBlank()) baos.write(codificarLinha(linha));
            }
            return baos.toByteArray();
        } catch (IOException e) {
            return null;
        }
    }

    public void criarArquivoBinario(String nomeArquivo, byte[] dados) {
        try (FileOutputStream fos = new FileOutputStream(nomeArquivo)) {
            fos.write(dados);
        } catch (IOException e) {}
    }

    private byte[] codificarLinha(String linha) {
        String[] partes = linha.split(" +");
        String cpfStr = partes[0].replace(".", "").replace("-", "");
        long cpfLong = Long.parseLong(cpfStr);

        byte[] out = new byte[CHUNK_SIZE];

        for (int i = 7; i >= 0; i--) {
            out[i] = (byte)(cpfLong & 0xFF);
            cpfLong >>= 8;
        }

        int bitPos = 0;

        for (int i = 1; i <= 50; i++) {
            int v = switch (partes[i].charAt(0)) {
                case 'A' -> 0;
                case 'B' -> 1;
                case 'C' -> 2;
                default -> 3;
            };

            int byteIndex = 8 + bitPos / 8;
            int bitOffset = bitPos % 8;

            int shift = 6 - bitOffset;
            out[byteIndex] |= (v << shift) & 0xFF;

            bitPos += 2;
        }

        return out;
    }
}
