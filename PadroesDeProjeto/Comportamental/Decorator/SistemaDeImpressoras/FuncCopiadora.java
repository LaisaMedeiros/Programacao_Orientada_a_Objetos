package PadroesDeProjeto.Comportamental.Decorator.SistemaDeImpressoras;

public class FuncCopiadora extends ImpressoraDecorator{
    private boolean ativo = false;

    public FuncCopiadora(Impressora impressora, boolean ativo){
        super(impressora);
        this.ativo = ativo;
    }

    @Override 
    public void imprimir (String documento){
        if (ativo){
            System.out.println("Copiando o documento: " + documento);   
        }
    }
}
