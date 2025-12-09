package Provas.P2_252.Questao3;

public abstract class TrajeDecorator extends Traje {
    protected Traje traje;

    // isso aqui serve para guardar o tipo de composição e pegar o a descrição e valor dela
    public TrajeDecorator (double preco, Traje traje, String composicao){
        super(composicao, preco);
        this.traje = traje;
    }

    // esse getPreco pega o preco do acessorio + traje, pois
    // é acessado por todos os acessorios por serem filhos dessa classe.
    @Override
	public double getPreco(){
		return traje.getPreco() + this.preco;
	}
	// ja tem um preco por causa do atributo preco definido na classe abstract 
    // so que esse getPreco é chamdo pelos acessorios, então o valor passado como
    // parametro é o preco do acessorio;


	@Override
	public String getComposicao(){
		return traje.getComposicao() + ", " + this.composicao;
	}


}
