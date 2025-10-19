package Excecoes.OutrosExercicios.Exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        int[] numeros = new int[10]; // Inicialização do array com tamanho 10
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (true){
            try{
                System.out.print("Digite o número: ");
                int entrada = scanner.nextInt();
                numeros[i] = entrada;
                i++;
                if (entrada == 0) break; // Sai do loop se o número for zero
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Erro: Tentativa de acessar uma posição inválida do array.");
                break; // Sai do loop em caso de erro de índice
            } catch(InputMismatchException e){
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }

        scanner.close();
        System.out.println("Números digitados:");
        // o loop vai até i, que é o número de entradas válidas feitas
        for (int j = 0; j < i; j++){
            System.out.println(numeros[j]);
        }
    }
}
