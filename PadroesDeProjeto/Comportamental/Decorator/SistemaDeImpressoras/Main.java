package PadroesDeProjeto.Comportamental.Decorator.SistemaDeImpressoras;

public class Main {
    public static void main (String args[]){
        System.out.println("Impressora Básica:");
        
        ImpressoraBasica impressorabasica = new ImpressoraBasica();
        impressorabasica.imprimir("Relatório Anual");

        System.out.println("\nImpressora com Scanner Ativado:");
        FuncScanner impressoraComScanner = new FuncScanner(impressorabasica, true);
        impressoraComScanner.imprimir("Relatório Anual");

        // Chamando a classe scanner sem ter instanciado um objeto de impressorabasica antes
        System.out.println("\nImpressora com Scanner Desativado:");
        FuncScanner impressoraComScannerDesativado = new FuncScanner(new ImpressoraBasica(), false);
        impressoraComScannerDesativado.imprimir("Relatório Anual");

        // Impressora com copiadora e scanner ativados
        System.out.println("\nImpressora com Scanner e Copiadora Ativados:");
        // Basta chamar a classe FuncCopiadora passando o objeto impressoraComScanner como parâmetro
        FuncCopiadora impressoraComScannerECopiadora = new FuncCopiadora(impressoraComScanner, true);
        impressoraComScannerECopiadora.imprimir("Relatório Anual");

    }
}
