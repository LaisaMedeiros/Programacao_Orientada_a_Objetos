import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		//entrada é um objeto da classe Scanner
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite sua primeira nota: ");
		float n1 = entrada.nextFloat();
		
		System.out.print("Digite sua segunda nota: ");
		float n2 = entrada.nextFloat();
		
		// info é um objeto da classe NomeNotas
		// Cria um objeto da classe NomeNotas, passando nome e notas para o construtor
		//O construtor da classe  é chamado e já guarda esses valores nos atributos privados this
		NomeNotas info = new NomeNotas(nome, n1, n2);
		
		// Mostra o resultado
        System.out.println("Aluno: " + info.getNome());
        System.out.println("Média: " + info.Media());
		
		entrada.close();
	}
}

// Os atributos pertencem ao objeto info e ninguém de fora da classe pode acessar ou alterar;
// Como são private, ninguém de fora da classe pode alterar ou acessar diretamente.
// Acesso controlado por métodos públicos
// - Para ler o nome: aluno.getNome().
// - Para calcular a média: aluno.calcularMedia().
// - Assim, o acesso aos dados é controlado pela própria classe, o que deixa seu código mais seguro e organizado.

// Você recebe os valores do usuário, cria um objeto da classe para salvar esses valores usando um construtor, e 
// como os atributos estão privados, eles só podem ser acessados por meio de métodos públicos como getNome() e 
// calcularMedia().
