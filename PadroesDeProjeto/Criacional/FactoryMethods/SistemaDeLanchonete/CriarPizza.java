package PadroesDeProjeto.Criacional.FactoryMethods.SistemaDeLanchonete;

public class CriarPizza extends CriadorDeLanches {
    @Override
    public Lanche criarLanche(){
        return new Pizza(); 
    }
    
}
