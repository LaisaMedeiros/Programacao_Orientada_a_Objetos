public class Teste{
  public static void main(String[] args) {
    Individuo I = new Indiviuo();
    I.nome = "Carlos";
    I.idade = 40;
    I.apresentar();

    Aluno a = new Aluno();
    a.nome = "Laísa";
    a.idade = 20;
    a.matricula = 1234;
    a.apresentar();
    a.estudar();

    Professor prof = new Professor();
    prof.nome = "Mariana";
    prof.idade = 35;
    prof.disciplina = "Matemática";
    prof.apresentar();
    prof.ensinar()
    
  }
}
