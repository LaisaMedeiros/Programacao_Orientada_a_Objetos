package PadroesDeProjeto.Comportamental.Decorator.SistemaDeImpressoras;

public class ImpressoraBasica implements Impressora{
    @Override 
    public void imprimir (String documento){
        System.out.println("Imprimindo documento: " + documento);
    }
}
