package Genericos.Utilidades;

public class TesteMetodos {
    public static void main(String[] args) {
        
        // Cenário 1: Trocar Integers
        Integer[] numeros = {10, 20, 30, 40};
        Utilidades.imprimirArray("Array original (int)", numeros); // 10 20 30 40

        // Chamamos o método genérico, onde T = Integer
        Utilidades.trocar(numeros, 0, 3);

        Utilidades.imprimirArray("Array após troca", numeros);   // 40 20 30 10

        // ---
        
        // Cenário 2: Trocar Strings
        String[] nomes = {"Alice", "Bob", "Charlie", "David"};
        Utilidades.imprimirArray("\nArray original (String)", nomes); // Alice Bob Charlie David
        
        // Chamamos o MESMO método genérico, onde T = String
        Utilidades.trocar(nomes, 1, 2); 

        Utilidades.imprimirArray("Array após troca", nomes);      // Alice Charlie Bob David
    }
}

