package PadroesDeProjeto.Criacional.FactoryMethods.SistemaDeLanchonete;

public class Sanduiche implements Lanche {
    @Override
    public void preparar() {
        System.out.println("Preparando sanduíche...");
    }

    @Override
    public void entregar() {
        System.out.println("Entregando sanduíche...");
    }
}
