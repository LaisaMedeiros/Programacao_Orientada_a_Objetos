public class Moto extends Veiculo{
	private int cilindradas;
	
	public Moto(String modelo, int ano, int cilindradas){
		super(modelo, ano);
		System.out.println("Fabricar moto");
	}	
}
