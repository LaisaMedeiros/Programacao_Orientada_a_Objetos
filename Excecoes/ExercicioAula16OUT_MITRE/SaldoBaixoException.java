package Excecoes.ExercicioAula16OUT_MITRE;

import java.util.ArrayList;

public class SaldoBaixoException extends RuntimeException{
    private static ArrayList<String> historico = new ArrayList<String>();
    
    public SaldoBaixoException(Integer id, Integer valor){
        String evento = toString() + " " + valor.toString();
        historico.add(evento);
    }
    public static void print(){
        for (String evento: historico){
            System.out.print(evento);
        }
    }
}
