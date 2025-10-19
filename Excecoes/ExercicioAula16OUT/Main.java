package Excecoes.ExercicioAula16OUT;
import java.util.Scanner;
//Cadastra contas que guardam pontos

public class Main {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite seu identificador:");
    int identificador = scanner.nextInt();

    try {
        Conta conta = new Conta(identificador);
        System.out.println("Conta criada com sucesso!");
    } catch (){
    }
}
