package Excecoes.ExercicioSistemaDeBiblioetca;
// Criar exceção personalizada
public class LivroNaoEstaEmprestadoException extends RuntimeException {
    public LivroNaoEstaEmprestadoException(String mensagem) {
        super(mensagem);
    }
}
