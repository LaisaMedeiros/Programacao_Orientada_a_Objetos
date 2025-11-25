package PadroesDeProjeto.Criacional.FactoryMethods.SistemaDeLanchonete;

public abstract class CriadorDeLanches {
    public abstract Lanche criarLanche();

    public void entregarLanche(){
        Lanche lanche = criarLanche();
        lanche.preparar();
        lanche.entregar();
    }

}
