package PadroesDeProjeto.Criacional.FactoryMethods.SistemaDeVeiculos;

public class CriarCaminhao extends CriadorDeVeiculos {
    @Override
    public Veiculos criarVeiculo() {
        return new Caminhao();
    }
}
