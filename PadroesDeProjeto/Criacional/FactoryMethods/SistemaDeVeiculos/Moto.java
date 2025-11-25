package PadroesDeProjeto.Criacional.FactoryMethods.SistemaDeVeiculos;

public class Moto implements Veiculos{
    private String modelo;
    private String fabricante;

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando.");
    }
    public void frear() {
        System.out.println("A moto está freando.");
    }

    public void exibirInfo() {
        System.out.println("Esta é uma moto do modelo"+ this.modelo+ "fabricada por"+this.fabricante);
    }
    
}
