package PadroesDeProjeto.Criacional.FactoryMethods.SistemaDeVeiculos;

public abstract class CriadorDeVeiculos {
    // as subclasses concretas implementam este metodo para criar diferentes tipos de veículos
    public abstract Veiculos criarVeiculo();

    // metodo que utiliza o veículo criado
    public void entregarVeiculo(){
        Veiculos veiculo = criarVeiculo();
        // chamando os métodos do veículo criado
        veiculo.acelerar();
        veiculo.frear();
        veiculo.exibirInfo();
    }

}
