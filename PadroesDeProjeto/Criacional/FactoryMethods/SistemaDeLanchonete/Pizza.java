package PadroesDeProjeto.Criacional.FactoryMethods.SistemaDeLanchonete;

public class Pizza implements Lanche {
    @Override
    public void preparar() {
        System.out.println("Preparando pizza...");
    }

    @Override
    public void entregar() {
        System.out.println("Entregando pizza...");
    }
    
}
