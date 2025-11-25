package PadroesDeProjeto.Criacional.FactoryMethods.SistemaDeVeiculos;

public class Carro implements Veiculos {
    private String modelo;
    private String fabricante;

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }
    public void frear() {
        System.out.println("O carro está freando.");
    }

    public void exibirInfo() {
        System.out.println("Este é um carro do modelo"+ this.modelo+ "fabricado por"+this.fabricante);
    }
}
