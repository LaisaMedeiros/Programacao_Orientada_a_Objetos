import java.util.ArrayList;

public class Jogador {

	private int numero;
	
	private static ArrayList<Jogador> lJogadores = new ArrayList<Jogador>();
	private static int max;

	public Jogador( int num ){
		for( Jogador jog1 : Jogador.lJogadores ) {
			if( jog1.getNumero() == num ) {
				jog1.setNumero( Jogador.max ++ );
			}
		}
		this.numero = num;		
		Jogador.lJogadores.add( this );
	}

	public void setNumero( int num ){
		this.numero = num;
	}
	
	public int getNumero(){
		return this.numero;
	}
}
