abstract class Animal {
    String nome;

    // Construtor da classe abstrata
    Animal(String nome) {
        this.nome = nome;
        System.out.println("Construtor de Animal chamado");
    }
    //metodo abstrato 
    abstract void emitirSom();
}
