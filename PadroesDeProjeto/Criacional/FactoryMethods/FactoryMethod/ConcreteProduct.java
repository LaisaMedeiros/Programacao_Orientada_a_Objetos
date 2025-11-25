package PadroesDeProjeto.Criacional.FactoryMethods.FactoryMethod;

// classe concreta que implementa a interface Product
public class ConcreteProduct implements Product {
    @Override
    public void sayHi() {
        System.out.println("Hi! I'm a Concrete Product.");
    }
    
}
