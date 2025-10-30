package Excecoes.ExercicioAula16OUT;

import java.util.ArrayList;

//por ser uma exceção não verificada (unchecked), ela estende RuntimeException
public class SaldoMinimoAtingido extends RuntimeException{
    public SaldoMinimoAtingido(){
        super("Saldo insuficiente para realizar a retirada.");
    }
    
}
