package Excecoes.CheckedExceptions;

import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

public class CheckedExample {

    //Capturar usando try-catch
    public static void leArquivo(String nomeArquivo) {
        try{
            //tenta abrir o arquivo se ele não for encontrado lança a exceção FileNotFoundException
            FileReader file = new FileReader(String nomeArquivo);
            System.out.println("Arquivo aberto com sucesso!");
            file.read(); // Se não conseguir ler, lança IOException 
            file.close(); // Se não conseguir fechar, lança IOException  
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        } catch (IOException e) {
            System.out.println("Erro ao fechar o arquivo!");
        }
    }

    // Ao declarar usando throws o mpetodo main é obruigado a tratar a exceção que este método pode lançar
    public static void leArquivoComThrows(String nomeArquivo) throws FileNotFoundException, IOException {
        //Se o arquivo não existir , esse método joga a responsabilidade de tratamento da execção para quem o chamou
        FileReader file = new FileReader(String nomeArquivo);
        System.out.println("Arquivo aberto com sucesso!");
        file.read(); // Se não conseguir ler, lança IOException (Checked, por isso deve ser declarada no throws)
        file.close(); // Se não conseguir fechar, lança IOException (Checked, por isso deve ser declarada no throws)
    }

    public static void main(String[] args) {
        //Usando try-catch
        leArquivo("arquivo.txt");

        //Usando throws - o método main deve tratar a exceção
        try {
            leArquivoComThrows("arquivo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        } catch (IOException e) {
            System.out.println("Erro ao fechar o arquivo!");
        }
    }
}
