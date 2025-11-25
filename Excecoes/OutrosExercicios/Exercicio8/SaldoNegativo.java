package Excecoes.OutrosExercicios.Exercicio8;

public class SaldoNegativo extends RuntimeException {
    public SaldoNegativo(String message){
        super(message);
    }
}
