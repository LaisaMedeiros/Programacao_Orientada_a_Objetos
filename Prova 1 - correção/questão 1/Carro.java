public abstract class Carro {

	protected int volume;
	protected int tamTanque;	

	protected Carro( int vol, int tan ){
		this.volume = vol;
		this.tamTanque = tan;
	}
	
	public void setTanque( int novoTanque ){
		if( novoTanque < this.volume / 2 )
			this.tamTanque = novoTanque;
	}
}
