public class Veiculo {
	private String chassi;
	private String modelo;
	private int ano;
	private int tam_tanque;	

	protected Veiculo(String modelo, int ano, String chassi, int tam_tanque){
		this.chassi = chassi;
		this.modelo = modelo;
		this.ano = ano;
		this.tam_tanque = tam_tanque;
		System.out.println("Fabricar veículo");
	}
	
	protected void imprimir_dados(){
		System.out.println("Informações do carro: ");
		System.out.println("Chassi: ", + chassi);
		System.out.println("Modelo: ", + modelo);
		System.out.println("Ano: ", + ano);
		System.out.println("Tamannho do tanque: " + tam_tanque);
	}
}
