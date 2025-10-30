package Excecoes.ExercicioSistemaDeBiblioetca;

public class LivroJaEmprestado extends RuntimeException {
    public LivroJaEmprestado( String msg){
        super(msg);
    }
}
