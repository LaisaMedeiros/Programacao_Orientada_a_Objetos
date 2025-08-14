import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro nome: ");
		String nome1 = entrada.nextLine();
		
		System.out.print("Digite o segundo nome: ");
		String nome2 = entrada.nextLine();
		
		System.out.println("Alo " + nome1 + " e " + nome2);
		
		entrada.close();
		
	}

}
