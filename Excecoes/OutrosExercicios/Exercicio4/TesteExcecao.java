package Excecoes.OutrosExercicios.Exercicio4;

public class TesteExcecao {
    // metodo que lança a excecao
    // como o metodo lança a excecao, quem o chama deve tratar ou repassar
    // a unica coisa que esse método faz é lançar a excecao
    public static void teste() throws MinhaExcecao {
		throw new MinhaExcecao(); // cria o objeto da exceção e o lança
	}
    //Classe main que chama o método teste e trata a exceção
	public static void main(String[] args) {
        // declara objeto do tipo exceção inicializado como null
		MinhaExcecao me = null;
        // bloco try-catch-finally
		try {
			System.out.println("try ");
            teste();
        // bloco catch que captura a exceção lançada pelo método teste
		} catch (MinhaExcecao e) {
			System.out.println("catch ");
			me = e; // atribui a exceção capturada ao objeto me
		// bloco finally que sempre será executado
        } finally {
			System.out.println("finally ");
			throw me; // relança a exceção armazenada em me
		}

		System.out.println("fim");
	}
}

//FLUXO: "try " → Lança exceção → "catch " → "finally " → RELANÇA EXCEÇÃO → PROGRAMA QUEBRA

