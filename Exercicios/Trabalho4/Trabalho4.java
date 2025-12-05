//Thiago Barbosa da Silva
// Laísa Medeiros

package Exercicios.Trabalho4;

import java.io.FileOutputStream;
import java.io.IOException;

public class Trabalho4 {

    private static final String TXT_IN = "respostas_originais.txt";
    private static final String BIN_OUT = "dados_comprimidos.bin";
    private static final String TXT_OUT = "respostas_restauradas.txt";

    public static void main(String[] args) {

        criarArquivoSimulado(TXT_IN);

        Compressao c = new Compressao();
        byte[] dados = c.comprimirEObterBytes(TXT_IN);
        c.criarArquivoBinario(BIN_OUT, dados);

        Descompressao d = new Descompressao();
        d.lerArquivoBinario(BIN_OUT, TXT_OUT);

        System.out.println("Finalizado.");
    }

    private static void criarArquivoSimulado(String nome) {
        try (FileOutputStream fos = new FileOutputStream(nome)) {
            String dados =
                "123.456.789-01 A B C D A B C D A B C D A B C D A B C D A B C D A B C D A B C D A B C D A B C D A B C D A B C D A B C D\n" +
                "987.654.321-00 D C B A D C B A D C B A D C B A D C B A D C B A D C B A D C B A D C B A D C B A D C B A D C B A D C B A\n";
            fos.write(dados.getBytes());
        } catch (IOException e) {}
    }
}
