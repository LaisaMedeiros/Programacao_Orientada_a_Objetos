public class Carro extends Veiculo{
	private int num_portas;
	
	public Carro(String modelo, int ano, int num_portas){
		// tem de chamar o construtor da classe mae na primeira linha
		// a nao ser que ele não tenha parâmetros
		
		Veiculo carro = new super(chassi, modelo, ano, tam_tanque);
		System.out.println("Fabricar carro" + carro.imprimir_dados());

	}	
}
