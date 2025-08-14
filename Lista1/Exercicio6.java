import java.util.Scanner; 

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a quantidade de alunos da turma: ");
		int quant = entrada.nextInt();
		
		System.out.print("Insira a quantidade de alunos aprovados: ");
		int aprov = entrada.nextInt();
		
		PorcentAprovados prct = new PorcentAprovados(quant, aprov); 
		System.out.printf("A porcentagem é: %.2f%%\n", prct.Porcent());
		
		entrada.close();
	}

}
