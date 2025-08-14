import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n1 = entrada.nextInt();
		
		System.out.print("Digite um número inteiro: ");
		int n2 = entrada.nextInt();
		
		Soma soma = new Soma(n1, n2);
		
		int resultado = soma.calcularSoma();
		
		System.out.println("A soma é: " + resultado);
        
        entrada.close();
	}

}
