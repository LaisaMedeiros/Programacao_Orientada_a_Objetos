public class Notas {
	private float num1;
	private float num2;
	private float num3;
	
	//construtor
	public Notas (float n_1, float n_2, float n_3) {
		this.num1 = n_1;
		this.num2 = n_2;
		this.num3 = n_3;
	}
	
	public float Media() {
		return (num1 + num2 + num3) / 3.0f;
	}

}
