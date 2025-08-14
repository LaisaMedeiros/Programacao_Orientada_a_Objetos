import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		float n1 = entrada.nextFloat();

		System.out.print("Digite a segunda nota: ");
		float n2 = entrada.nextFloat();
		
		System.out.print("Digite a terceira nota: ");
		float n3 = entrada.nextFloat();
		
		Notas notas = new Notas(n1, n2, n3); 
		float resultado = notas.Media();
		
		System.out.println("A média é: " + resultado);
		
		entrada.close();
	}

}
