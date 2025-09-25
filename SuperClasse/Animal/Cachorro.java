//Herda todas as informações da classe Animal
public class Cachorro extends Animal {
    private int ossosComidos; 
	public Cachorro(String nome) {
		super(nome);
		this.ossosComidos = 10; 
	}
	
    public void latir(){
        System.out.printf("%s latiu\n", getNome()); 
    }

    public void lamber(){
        System.out.printf("%s lambeu\n", getNome()); 
    }
}