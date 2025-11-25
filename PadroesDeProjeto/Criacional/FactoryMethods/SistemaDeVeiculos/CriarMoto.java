package PadroesDeProjeto.Criacional.FactoryMethods.SistemaDeVeiculos;

public class CriarMoto extends CriadorDeVeiculos {
    @Override
    public Veiculos criarVeiculo() {
        return new Moto();
    }
}
