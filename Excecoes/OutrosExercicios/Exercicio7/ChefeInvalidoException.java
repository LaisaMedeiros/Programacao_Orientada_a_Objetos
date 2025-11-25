package Excecoes.OutrosExercicios.Exercicio7;

public class ChefeInvalidoException extends Exception {
    public ChefeInvalidoException(String message){
        super(message); // a mensagem fica disponivel atraves do metodo getMessage()
    }
    
}
