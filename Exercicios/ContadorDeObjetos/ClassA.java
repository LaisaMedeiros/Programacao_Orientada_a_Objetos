package Exercicios.ContadorDeObjetos;

public class ClassA {
    private static int contador = 0;

    public ClassA() {
        contador++;
    }

    public static int getContador(){
        return contador;
    }
}