package PadroesDeProjeto.Comportamental.Decorator.SistemaDeImpressoras;

public class FuncScanner extends ImpressoraDecorator {
    private boolean ativo = false;

    public FuncScanner(Impressora impressora, boolean ativo) {
        super(impressora);
        this.ativo = ativo;
    }

    @Override
    public void imprimir(String documento) {
        if (ativo) {
            System.out.println("Escaneando documento: " + documento);
        }
    }
} 
