package Excecoes.OutrosExercicios.Exercicio1;

import java.util.Scanner;
import java.util.InputMismatchException;

//A lógica é:
//cria as duas variáveis inteiras como 0
// cria uma variável booleana que guarda se a entrada é válida ou não. Usa essa variável no loop
// dentro do loop tenta ler as duas variáveis inteiras
// Se alguma das leituras não é um número vai direto para o catch
// se as leituras são válidas, seta a variável booleana para true para sair do loop
// em seguida continua dentro do loop para fazet a divisão, se um dos valores for zero, lança a exceção ArithmeticException
// que é capturada no catch específico, se não for zero faz a divisão e imprime o resultado
// ao tentar dar loop novamente, a variável booleana já está true, então sai do loop e termina o programa
// se a variável estiver falso o loop continua pedindo a entrada dos números

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean entradaValida = false;

        while (!entradaValida){
            try{
                System.out.print("digite o primeiro número inteiro: ");
                num1 = scanner.nextInt();
                System.out.print("digite o segundo número inteiro: ");
                num2 = scanner.nextInt();
                entradaValida = true;
                int resultado = num1 / num2;
            } catch(InputMismatchException e){
                // Trata a exceção de entrada inválida
                System.out.println("Entrada inválida! Por favor, digite números inteiros.");
                scanner.nextLine(); // Limpa o buffer do scanner
            } catch(ArithmeticException e){
                //Trata a exceção de divisão por zero
                System.out.println("Erro: Divisão por zero não é permitida. Tente novamente.");
            } catch(Exception e){
                // Trata qualquer outra exceção inesperada
                // getMessage() fornece detalhes sobre a exceção
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
