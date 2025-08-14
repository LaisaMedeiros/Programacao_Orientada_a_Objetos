public class Soma {
	
	private int num1;
	private int num2;
	
	 // construtor para inicializar os números
	public Soma(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// método público que calcula e retorna a soma
    public int calcularSoma() {
        return num1 + num2;
    }
}
