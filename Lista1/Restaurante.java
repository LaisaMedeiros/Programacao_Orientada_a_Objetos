
public class Restaurante {

	private String n;
	private float v_gasto;

	//construct
	public Restaurante (String nome, float gasto) {
		this.n = nome;
		this.v_gasto = gasto; 
	}
	
	public String getNome() {
		return n; 
	}
	
	public float ValorTotal() {
		return 1.1f * v_gasto; 
	}
	
	public float ValorGarcom() {
		return 0.1f * v_gasto; 
	}
}
