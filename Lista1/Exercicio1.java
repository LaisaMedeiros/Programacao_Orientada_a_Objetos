//Lê tudo o que o usuário digita no teclado
// Isso “importa” a classe Scanner para o seu código.
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		//Cria um objeto Scanner chamado entrada
		//System.in significa entrada do teclado
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		
		//O objeto é entrada e chama o método nextLine qe é do tipo Scanner
		//que lê ltudo o que o usuário digita até apertar Enter
		//Guarda o conteudo lido por entrada em nome 
		//nextLine() retorna uma String então não pode ser atribuido a
		//entrada e sim a uma nova variável chamada String
		String nome = entrada.nextLine();
		System.out.println("Olá " + nome + "!");
		
		//Deve fechcar, ppis usa recusrso externos como memória, teclado, ...
		entrada.close(); 

	}

}
