
public class NomeNotas {
	//São os três atributos
	private String nome;
	private float nota1;
	private float nota2; 

	//Construtor
	public NomeNotas(String nome, float n_1, float n_2) {
		this.nome = nome;
		this.nota1 = n_1;
		this.nota2 = n_2;
	}

	 // Método para calcular média
	public float Media() {
		return (nota1 + nota2) / 2.0f;
	}
	
	// Getter para nome
    public String getNome() {
        return nome;
    }
}
