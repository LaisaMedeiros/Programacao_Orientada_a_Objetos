package PadroesDeProjeto.Criacional.FactoryMethods.SistemaDeVeiculos;

public class CriarCarro extends CriadorDeVeiculos {
    @Override
    public Veiculos criarVeiculo() {
        return new Carro();
    }
    
}
