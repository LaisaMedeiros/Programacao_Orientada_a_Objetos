package PadroesDeProjeto.Criacional.FactoryMethods.FactoryMethod;

public class Main {
    public static void main (String args[]){
        // cria a instancia do criador concreto
        Creator creator = new ConcreteCreator();
        creator.createAndShow();

        Product product = creator.factoryMethod();
        product.sayHi();

        
    }
}
