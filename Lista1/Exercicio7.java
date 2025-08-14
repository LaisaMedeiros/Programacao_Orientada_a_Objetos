import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o nome do cliente: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o valor gasto: ");
		float gasto  = entrada.nextFloat();
		
		Restaurante info = new Restaurante(nome, gasto);
		System.out.println("O nome do cliente é " + info.getNome());
		System.out.printf("O valor final da conta é %.2f \n", info.ValorTotal());
		System.out.printf("O valor pago ao garçom é %.2f \n", info.ValorGarcom());
		
		entrada.close();
	}

}
