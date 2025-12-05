public class ClasseA implements InterfaceABC {

	private int identificador;
	
	public ClasseA( int i ){
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
