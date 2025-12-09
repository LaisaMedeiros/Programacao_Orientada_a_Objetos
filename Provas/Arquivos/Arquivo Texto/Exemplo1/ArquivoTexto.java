package Provas.Arquivos.Arquivo Texto;

import java.io.*;

public class ArquivoTexto {
    public static void main(String[] args) {

        // escrever
        try (PrintWriter pw = new PrintWriter("exemplo.txt")) {
            pw.println("Laisa");
            pw.println("Aprendendo arquivos texto em Java!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever: " + e.getMessage());
        }

        // ler
        try (BufferedReader br = new BufferedReader(new FileReader("exemplo.txt"))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                System.out.println("Li: " + linha);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        } catch (IOException e) {
            System.out.println("Erro ao ler: " + e.getMessage());
        }
    }
}

