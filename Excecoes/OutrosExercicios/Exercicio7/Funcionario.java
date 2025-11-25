package Excecoes.OutrosExercicios.Exercicio7;

public class Funcionario {
    private String nome;
    private String cargo;
    private int matricula;
    private int idade;
    private Funcionario chefe;
    private double salario;

    public Funcionario(String nome, String cargo, int matricula, int idade, Funcionario chefe, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.matricula = matricula;
        this.idade = idade;
        this.chefe = chefe;
        this.salario = salario;
    }
    // verifica se dois funcionarios possuem o mesmo chefe
    public boolean mesmaChefia(Funcionario f){
        if (this.chefe.equals(f.chefe)){
            return true;
        } else {
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Funcionario getChefe() {
        return chefe;
    }

    public void setChefe(Funcionario chefe) throws ChefeInvalidoException {
        // this é a referencia para o proprio objeto
        // se o funcionario passado como objeto é o proprio funcionario dá erro
        if (chefe == this){
            throw new ChefeInvalidoException("Erro: um funcionário não pode ser chefe de si mesmo.");
        }
        this.chefe = chefe;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
