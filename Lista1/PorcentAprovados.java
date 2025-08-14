
public class PorcentAprovados {
	
	private int q; 
	private float ap;
	
	//construct
	public PorcentAprovados(int Q, float AP) {
		this.q = Q;
		this.ap = AP;
	}
	
	public float Porcent() {
		return (ap/q)*100.0f;
	}
}
