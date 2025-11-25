package PadroesDeProjeto.Comportamental.Decorator.SistemaDeImpressoras;

// essa classe vai servir como base para os decorators de impressora
public class ImpressoraDecorator implements Impressora {
    protected Impressora impressora;

    public ImpressoraDecorator(Impressora impressora){
        this.impressora = impressora;
    }

    @Override
    public void imprimir(String documento){
        impressora.imprimir(documento);
    }
}
