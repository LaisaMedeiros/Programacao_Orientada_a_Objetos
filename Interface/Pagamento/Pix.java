package Interface.Pagamento;

//é uma implementação da interface PagamentoDigital
public class Pix implements PagamentoDigital {
    @Override
    public void autenticar(){
        System.out.println("Autenticando via Pix...");
    }

    @Override
    public void pagar(double valor){
        System.out.println("Pagando R$" + valor + " via Pix...");
    }

}
