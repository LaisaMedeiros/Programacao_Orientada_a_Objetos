//Subclasse de Pessoa 
class Estudante extends Pessoa {
    int matricula;

    Estudante(String nome, int matricula) {
        super(nome);  // chama o construtor da superclasse
        this.matricula = matricula;
        System.out.println("Construtor de Estudante chamado");
    }
}
