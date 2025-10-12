package Genericos.Caixa;

public class Principal {
    public static void main(String[] args) {
        // 1. Instanciando uma Caixa para guardar um Integer (T = Integer)
        System.out.println("--- Caixa de Números Inteiros ---");
        Caixa<Integer> caixaDeNumero = new Caixa<>(42);

        // Chamando o método para mostrar o conteúdo
        caixaDeNumero.mostrarConteudo();

        // Recuperando o valor: NÃO precisa de casting (conversão)
        // O compilador garante que o retorno é um Integer.
        int valor = caixaDeNumero.getConteudo();
        System.out.println("Valor recuperado: " + valor);

        // EXPLICANDO A SEGURANÇA DE TIPO:
        // A linha abaixo causaria um erro de COMPILAÇÃO (em tempo de desenvolvimento):
        // caixaDeNumero = new Caixa<>("Isso é um texto");
        
        System.out.println("\n--- Caixa de Textos (String) ---");
        // 2. Instanciando uma Caixa para guardar uma String (T = String)
        Caixa<String> caixaDeTexto = new Caixa<>("Olá, Genéricos!");

        caixaDeTexto.mostrarConteudo();

        // Recuperando o valor: o compilador garante que o retorno é uma String.
        String texto = caixaDeTexto.getConteudo();
        System.out.println("Texto recuperado: " + texto);
    }
}

