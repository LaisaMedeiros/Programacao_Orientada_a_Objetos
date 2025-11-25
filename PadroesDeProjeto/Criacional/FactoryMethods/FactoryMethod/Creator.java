package PadroesDeProjeto.Criacional.FactoryMethods.FactoryMethod;

public abstract class Creator {
    // esse é o metodo factory, ele retorna um objeto do tipo Product
    // ele vai ser implementado pelas classes concretas que estendem essa classe
    public abstract Product factoryMethod();

    // método que utiliza o produto criado pelo factory method
    public void createAndShow(){
        //Chama o factory method para criar o produto
        Product product = this.factoryMethod()

    }
}
