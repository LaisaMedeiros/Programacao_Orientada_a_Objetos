public class ClasseC implements InterfaceABC {

	private int identificador;
	
	public ClasseC( int i ){
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
