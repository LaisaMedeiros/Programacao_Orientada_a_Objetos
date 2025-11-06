package Excecoes.ExercicioSistemaDeBiblioetca;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Principal {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Livro> ListaDeLivros = new ArrayList<>();
    private static ArrayList<String> historicoErros = new ArrayList<>();

    public static String pedirTitulo() {
        while (true) {
            try {
                System.out.println("Insira o titulo do livro:");
                String titulo = scanner.nextLine();

                if (titulo.isEmpty()) {
                    throw new IllegalArgumentException("Titulo naõ pode ser vazio");
                }
                return titulo;
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Insira um titulo válido.");
            }
        }
    }

    public static int pedirCodigo() {
        while (true) {
            try {
                System.out.println("Insira o codigo do livro:");
                int codigo = scanner.nextInt();

                if (codigo < 0) {
                    throw new IllegalArgumentException("Codigo naõ pode ser vazio");
                }
                return codigo;
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Insira um codigo válido.");
            }
        }
    }

    public static Livro buscaLivroPorCodigo(int codigo) {
        for (Livro livro : ListaDeLivros) {
            if (livro.getCodigo() == codigo) {
                return livro;
            }
        }
        return null;
    }

    public static Livro buscaLivroPorTitulo(String titulo) {
        for (Livro livro : ListaDeLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public static void main (String[] args){

        // 5 livros pre-cadastrados 
        Livro livro1 = new Livro("O Senhor dos Anéis", 101);
        Livro livro2 = new Livro("1984", 102);
        Livro livro3 = new Livro("A Revolução dos Bichos", 103);
        Livro livro4 = new Livro("Dom Quixote", 104);
        Livro livro5 = new Livro("O Pequeno Príncipe", 105);

        ListaDeLivros.add(livro1);
        ListaDeLivros.add(livro2);
        ListaDeLivros.add(livro3);
        ListaDeLivros.add(livro4);
        ListaDeLivros.add(livro5);

        Livro livro = null;
        int codigo = 0;
        String titulo = "";
        int opcao = 0;
        
        System.out.println("Bem-vindo ao Sistema de Biblioteca!");

        while (opcao != 5){
            try{
                String msg = "Escolha uma opção:\n"+
                    "1. Empréstimo de Livro\n"+
                    "2. Devolução de Livro\n"+
                    "3. Transferência de Livro\n"+
                    "4. Consulta de Status do Livro\n"+
                    "5. Sair\n"+
                    "6. Ver Histórico de Erros"; // ADICIONEI OPÇÃO 6

                System.out.println(msg);
                opcao = scanner.nextInt(); 
                
                if (opcao < 1 || opcao > 6) {
                    throw new IllegalArgumentException("Opção deve ser entre 1 e 6");
                }
                
                scanner.nextLine(); // Limpar o buffer

                if (opcao >= 1 && opcao <= 4) { 
                    System.out.println("Digite 1 para inserir o código e 2 para inserir o título do livro:");
                    int escolha = scanner.nextInt();
                    
                    if (escolha < 1 || escolha > 2) {
                        throw new IllegalArgumentException("Escolha deve ser 1 ou 2");
                    }
                    scanner.nextLine(); // limpar buffer depois do nextInt()

                    if (escolha == 1){
                        codigo = pedirCodigo();
                        livro = buscaLivroPorCodigo(codigo);
                    }
                    if (escolha == 2){
                        titulo = pedirTitulo();
                        livro = buscaLivroPorTitulo(titulo);
                    }
                    
                    if (livro == null) {
                        System.out.println("Livro não encontrado!");
                        continue;
                    }
                }

                switch (opcao){
                    case 1:
                        livro.emprestimo(livro.getCodigo());
                        System.out.println("Livro emprestado com sucesso!");
                        break;
                    case 2:
                        livro.devolucao();
                        System.out.println("Livro devolvido com sucesso!");
                        break;
                    case 3:
                        System.out.println("Digite o nome do novo usuário:");
                        String novoUsuario = scanner.nextLine();
                        livro.transferencia(novoUsuario);
                        System.out.println("Transferência realizada com sucesso!");
                        break;
                    case 4:
                        livro.consultaDeStatus();
                        break;
                    case 6:
                        System.out.println("=== HISTÓRICO DE ERROS ===");
                        if (historicoErros.isEmpty()) {
                            System.out.println("Nenhum erro registrado.");
                        } else {
                            for (String erro : historicoErros) {
                                System.out.println("- " + erro);
                            }
                        }
                        break;
                }
                
            } catch(InputMismatchException e){
                System.out.println("Erro: Tipo de entrada inválido! Era esperado um número inteiro.");
                scanner.nextLine(); // limpar buffer
            } catch(LivroJaEstaDisponivel e){
                System.out.println("Erro: " + e.getMessage());
                historicoErros.add("Devolução falhou - " + e.getMessage());
            } catch(LivroJaEmprestado e) { // ADICIONE ESTE CATCH
                System.out.println("Erro: " + e.getMessage());
                historicoErros.add("Empréstimo falhou - " + e.getMessage());
            } catch(LivroNaoEstaEmprestadoException e) {
                System.out.println("Erro na transferência: " + e.getMessage());
                historicoErros.add("Transferência falhou - " + e.getMessage());
            } catch(IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
                historicoErros.add("Operação inválida - " + e.getMessage());
                scanner.nextLine(); // limpar buffer
            } catch(Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
                historicoErros.add("Erro inesperado - " + e.getMessage());
            }
        }
        
        System.out.println("Sistema encerrado!");
        scanner.close();
    }
}
