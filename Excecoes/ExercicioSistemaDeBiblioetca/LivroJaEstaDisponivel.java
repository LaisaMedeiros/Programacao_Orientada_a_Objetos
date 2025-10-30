package Excecoes.ExercicioSistemaDeBiblioetca;

public class LivroJaEstaDisponivel extends Exception {
    public LivroJaEstaDisponivel(String msg){
        super(msg);
    }
}
