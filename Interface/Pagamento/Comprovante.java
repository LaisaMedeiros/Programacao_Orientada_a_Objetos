package Interface.Pagamento;

public interface Comprovante {
    public default void gerarComprovante(double valor) {
        System.out.println("Comprovante: Pagamento de R$" + valor + " via");
    }

    public static void imprimirAvisoLegal(){
        System.out.println("Aviso Legal: Este é um comprovante eletrônico. Guarde-o para futuras referências.");
    }
}
