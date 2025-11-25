package PadroesDeProjeto.Criacional.FactoryMethods.SistemaDeVeiculos;

public class Caminhao implements Veiculos {
    private String modelo;
    private String fabricante;

    @Override
    public void acelerar() {
        System.out.println("O caminhão está acelerando.");
    }
    @Override
    public void frear() {
        System.out.println("O caminhão está freando.");
    }
    @Override
    public void exibirInfo() {
        System.out.println("Este é um caminhão do modelo"+ this.modelo+ "fabricado por"+this.fabricante);
    }
    
}
