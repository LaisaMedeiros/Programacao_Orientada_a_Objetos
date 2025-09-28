package Interface.Pagamento;

public class Boleto implements Pagamento, Comprovante {
    @Override
    public void pagar(double valor){
        System.out.println("Pagando R$" + valor + " via Boleto...");
    }
    
}
