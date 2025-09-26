class Cachorro extends Animal {
    Cachorro(String nome) {
        super(nome); // chama o construtor da classe abstrata
    }

    @Override
    void emitirSom() {
        System.out.println(nome + " faz: Au au!");
    }
}
