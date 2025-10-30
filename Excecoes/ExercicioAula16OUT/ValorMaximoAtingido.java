package Excecoes.ExercicioAula16OUT;

// essa execção é um extends de Exception, pois é uma exceção verificada (checked)
// Por ser checked, quem chama o método que a lança é obrigado a tratar a exceção
public class ValorMaximoAtingido extends Exception{  
    public ValorMaximoAtingido(){
        super("Saldo + depósito/tranferência ultrapassa o limite de 1000,00.");
    } 
}
