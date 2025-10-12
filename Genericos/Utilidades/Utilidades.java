package Genericos.Utilidades;

public class Utilidades {

    // Declaração do método genérico: <T> ANTES do tipo de retorno (void)
    public static <T> void trocar(T[] array, int indice1, int indice2) {
        if (array == null || indice1 < 0 || indice2 < 0 || indice1 >= array.length || indice2 >= array.length) {
            System.err.println("Erro: Índice inválido ou array nulo.");
            return;
        }
        
        // Operação de troca, que funciona para qualquer tipo T
        T temp = array[indice1];
        array[indice1] = array[indice2];
        array[indice2] = temp;
    }
    
    // Método auxiliar para imprimir um array (também genérico)
    public static <T> void imprimirArray(String descricao, T[] array) {
        System.out.print(descricao + ": ");
        for (T elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}