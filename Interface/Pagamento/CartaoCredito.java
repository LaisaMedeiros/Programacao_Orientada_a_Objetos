package Interface.Pagamento;

public class CartaoCredito implements PagamentoFsico {
    @Override
    public void inserirCartao(){
        System.out.println("Inserindo cartão de crédito...");
    }

    @Override
    public void digitarSenha(){
        System.out.println("Digitando senha do cartão de crédito...");
    }

    @Override
    public void pagar(double valor){
        System.out.println("Pagando R$" + valor + " com cartão de crédito...");
    }
}