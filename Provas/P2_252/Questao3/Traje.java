package Provas.P2_252.Questao3;

public abstract class Traje {
    protected double preco;
    protected String composicao;

    // por que esse composição ta aqui?
    // pra retornar a descrição do traje quando chamar o get
    public Traje(String composicao, double preco){
        this.preco = preco;
        this.composicao = composicao;
    }

    public double getPreco(){
        return this.preco;
    }

    public String getComposicao(){
        return this.composicao;
    }
}
