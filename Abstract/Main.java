public class Main {
    public static void main(String[] args) {
        // Animal a = new Animal("Genérico"); ❌ ERRO, não pode instanciar

        Cachorro c = new Cachorro("Rex"); // aqui o construtor de Animal é chamado
        c.emitirSom(); // Rex faz: Au au!
    }
}
