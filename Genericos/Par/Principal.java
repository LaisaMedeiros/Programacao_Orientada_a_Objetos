package Genericos.Par;

public class Principal {
    public static void main(String[] args) {
        
        // Exemplo 1: Par de String e Integer
        System.out.println("--- Par: Nome do Aluno e Nota ---");
        // T1 = String, T2 = Integer
        Par<String, Integer> alunoNota = new Par<>("Maria", 95);
        alunoNota.imprimirPar();

        // O compilador sabe o tipo: não precisa de casting!
        String nome = alunoNota.getPrimeiro(); // Retorna String
        int nota = alunoNota.getSegundo();     // Retorna Integer
        System.out.println("Nota de " + nome + ": " + nota);

        // ---

        // Exemplo 2: Par de Boolean e Double
        System.out.println("\n--- Par: Status do Pedido e Valor Total ---");
        // T1 = Boolean, T2 = Double
        Par<Boolean, Double> pedidoStatus = new Par<>(true, 159.99);
        pedidoStatus.imprimirPar();

        // Segurança de Tipo:
        // A linha abaixo causaria um ERRO DE COMPILAÇÃO,
        // pois o segundo elemento foi definido como Double, e não String.
        // pedidoStatus = new Par<>(false, "texto"); 
        
        // ---

        // Exemplo 3: Par de tipos iguais (se necessário)
        System.out.println("\n--- Par: Coordenadas (Integer, Integer) ---");
        // T1 = Integer, T2 = Integer
        Par<Integer, Integer> coordenadas = new Par<>(10, 20);
        coordenadas.imprimirPar();
    }
}
