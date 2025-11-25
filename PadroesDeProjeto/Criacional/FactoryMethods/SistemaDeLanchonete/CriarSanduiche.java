package PadroesDeProjeto.Criacional.FactoryMethods.SistemaDeLanchonete;

public class CriarSanduiche extends CriadorDeLanches {
    @Override
    public Lanche criarLanche(){
        return new Sanduiche(); 
    }
}
