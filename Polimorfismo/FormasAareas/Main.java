public class Main {
    public static void main(String[] args) {
        // Polimorfismo de referência
        Forma c = new Circulo(3);
        Forma r = new Retangulo(4, 5);
        Forma t = new Triangulo(6, 2);
        
        // OVERLOAD - métodos com mesmo nome mas parâmetros diferentes
        c.exibirArea();                    // Sem parâmetros
        c.exibirArea("cm²");               // Com unidade de medida
        c.exibirArea("Círculo", "vermelho"); // Com nome e cor
        
        r.exibirArea();
        r.exibirArea("m²");
        
        t.exibirArea();
        t.exibirArea("Triângulo", "azul");

        // Polimorfismo de método
        exibirInformacoes(c);
        exibirInformacoes(r);
        exibirInformacoes(t);
        
        // OVERLOAD de método estático
        exibirDetalhes(c);
        exibirDetalhes(r, "Detalhes do Retângulo:");
    }
    
    // OVERLOAD - métodos com mesmo nome mas assinaturas diferentes
    public static void exibirInformacoes(Forma forma) {
        System.out.println("=== Informações da Forma ===");
        forma.exibirArea();
    }
    
    public static void exibirDetalhes(Forma forma) {
        System.out.println("\n--- Detalhes ---");
        forma.exibirArea();
    }
    
    public static void exibirDetalhes(Forma forma, String titulo) {
        System.out.println("\n" + titulo);
        forma.exibirArea();
    }
}