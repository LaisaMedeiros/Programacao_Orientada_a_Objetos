class Aluno extends Pessoa{
  long matricula;

  public void estudar(){
    System.out.println("O aluno", super.nome, "está estudando");
  }

  @Override
  public apresentar(){
    System.out.println("Olá, meu nome é", super.nome, "minha matricula é", this.matricula, " e tenho", super.idade, "anos.") 
  }



}
