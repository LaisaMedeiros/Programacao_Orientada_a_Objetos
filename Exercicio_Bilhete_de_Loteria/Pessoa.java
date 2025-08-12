//Representa um comparador de bilhete

public class Pessoa {
    private int id;       // Identificador único da pessoa
    private int bilhete;  // Número do bilhete comprado

    // Construtor: inicializa o ID da pessoa
    public Pessoa(int id) {
        this.id = id; // O 'this' indica que é o atributo da própria classe
    }

    // Getter para o ID
    public int getId() {
        return this.id;
    }

    // Define (seta) o número do bilhete
    public void setBilhete(int num) {
        this.bilhete = num;
    }

    // Getter para o número do bilhete
    public int getBilhete() {
        return this.bilhete;
    }
}
