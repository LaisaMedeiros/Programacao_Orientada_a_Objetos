//Thiago Barbosa da Silva
// Laísa Medeiros


package Exercicios.Trabalho4;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Descompressao {

    private static final int CHUNK_SIZE = 21;

    public void lerArquivoBinario(String arqEntrada, String arqSaida) {
        try (FileInputStream fis = new FileInputStream(arqEntrada);
             BufferedWriter bw = new BufferedWriter(new FileWriter(arqSaida))) {

            byte[] bloco = new byte[CHUNK_SIZE];
            int lidos;

            while ((lidos = fis.read(bloco)) != -1) {
                if (lidos != CHUNK_SIZE) break;
                bw.write(decodificarBloco(bloco));
                bw.newLine();
            }

        } catch (IOException e) {}
    }

    private String decodificarBloco(byte[] bloco) {
        long cpfLong = 0;

        for (int i = 0; i < 8; i++) {
            cpfLong = (cpfLong << 8) | (bloco[i] & 0xFF);
        }

        String cpf = String.format("%011d", cpfLong);
        cpf = cpf.substring(0,3)+"."+cpf.substring(3,6)+"."+cpf.substring(6,9)+"-"+cpf.substring(9);

        StringBuilder sb = new StringBuilder();
        sb.append(cpf).append(" ");

        int bitPos = 0;

        for (int i = 0; i < 50; i++) {
            int byteIndex = 8 + bitPos / 8;
            int bitOffset = bitPos % 8;

            int shift = 6 - bitOffset;
            int v = (bloco[byteIndex] >> shift) & 0b11;

            char r = switch (v) {
                case 0 -> 'A';
                case 1 -> 'B';
                case 2 -> 'C';
                default -> 'D';
            };

            sb.append(r);
            if (i < 49) sb.append(" ");

            bitPos += 2;
        }

        return sb.toString();
    }
}
