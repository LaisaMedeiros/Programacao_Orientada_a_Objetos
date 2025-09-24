class Aluno extends Pessoa{
  int matricula;

  @Override
  void apresentar() {
      System.out.println("Olá, sou o aluno " + nome + ", tenho " + idade + " anos e minha matrícula é " + matricula + ".");
  }

  void estudar() {
      System.out.println("O aluno " + nome + " está estudando.");
  }
}
