class Cachorro extends Animal {
    String nome = "Cachorro";

    void som() {
        System.out.println("O cachorro late");
    }

    void mostrarNomes() {
        System.out.println(nome);        // atributo da subclasse
        System.out.println(super.nome);  // atributo da superclasse
    }

    void emitirSom() {
        som();           // método da subclasse
        super.som();     // método da superclasse
    }
}
