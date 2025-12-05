public class ClasseB implements InterfaceABC {

	private int identificador;
	
	public ClasseB( int i ){
		this.identificador = i;
	}
	@Override
	public void print() {
		System.out.print( identificador + " " );
	}
	@Override
	public int getIdentificador() {
		return this.identificador;
	}	
}
