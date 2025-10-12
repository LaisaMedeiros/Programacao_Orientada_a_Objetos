package Exercicios.ReceitaFederal;

// Classe Main para testar
public class Main {
    public static void main(String[] args) {
        // Criando contribuintes
        Contribuinte<PessoaFisica> joao = new Contribuinte<>("João", new PessoaFisica(), 100);
        Contribuinte<PessoaFisica> maria = new Contribuinte<>("Maria", new PessoaFisica(), 150);
        
        Contribuinte<Fabrica> industriaA = new Contribuinte<>("Indústria A", new Fabrica(), 500);
        Contribuinte<Fabrica> industriaB = new Contribuinte<>("Indústria B", new Fabrica(), 450);
        
        Contribuinte<LojaComercial> loja = new Contribuinte<>("Loja", new LojaComercial(), 200);
        
        System.out.println("=== COMPARAÇÕES VÁLIDAS ===");
        
        // ✅ Chama direto - não precisa instanciar classe
        System.out.println(ComparadorContribuintes.comparar(joao, maria));
        System.out.println(ComparadorContribuintes.comparar(industriaA, industriaB));
        
        System.out.println("\n=== TENTATIVAS INVÁLIDAS ===");
        
    }
}