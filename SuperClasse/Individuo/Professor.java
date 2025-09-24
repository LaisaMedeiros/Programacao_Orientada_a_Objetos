class Professor extends Pessoa {
    String disciplina;

    @Override
    void apresentar() {
        System.out.println("Olá, sou o professor " + nome + ", tenho " + idade + " anos e ensino " + disciplina + ".");
    }

    void ensinar() {
        System.out.println("O professor " + nome + " está ensinando " + disciplina + ".");
    }
}
