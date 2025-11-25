package PadroesDeProjeto.Criacional.FactoryMethods.SistemaDeVeiculos;

public class Main {
    public static void main (String args[]){
        CriadorDeVeiculos FabDeCarro = new CriarCarro();
        Veiculos meuCarro = FabDeCarro.criarVeiculo();
    }
}
