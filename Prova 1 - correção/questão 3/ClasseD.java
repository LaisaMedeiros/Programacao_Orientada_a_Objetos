import java.util.ArrayList;

public class ClasseD <T extends InterfaceABC> {

	private ArrayList<T> conjunto = new ArrayList<T>();

	public ClasseD( ){
	}

	public void add( T obj ){
		this.conjunto.add( 0, obj );
	}
	
	public void print() {
		System.out.print("\nConjunto ordenado: ");
		for( T t : this.conjunto )
			t.print();
	}
	
	public void remove( int id ) {
		for( T t : this.conjunto ) {
			if( t.getIdentificador() == id) {
				this.conjunto.remove( t );
			}
		}
	}	
}
