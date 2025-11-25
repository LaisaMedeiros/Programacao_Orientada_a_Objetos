public class ConcreteCreator extends Creator {
    @Override
    public Product factoryMethod() {
        // retorna uma nova instancia de ConcreteProduct
        return new ConcreteProduct();
    }
}



