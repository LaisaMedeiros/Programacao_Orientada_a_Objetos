package PadroesDeProjeto.ExemplosAula04NOV.Exemplo2;

// Decorator: extends Bebida e cont´me uma referência ao objeto
// que está sendo decorado
public abstract class Adicional extends Bebida{
    
    // Referência ao componente que está sendo envolvido/decorado
    protected Bebida bebida;
    
    // O construtor é crucial: ele exige um objeto Bebida para ser decorado
    public Adicional (String descricao, Bebida beb){
        super(descricao);
        this.bebida = beb;
    }
    public abstract String getDescricao();
}
