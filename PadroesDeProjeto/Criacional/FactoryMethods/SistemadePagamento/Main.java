package PadroesDeProjeto.Criacional.FactoryMethods.SistemadePagamento;

public class Main {
    public static void main (String args[]){
        // retorna um objeto do tipo ProcessadorCrataoCredito
        ProcessadorDePagamento cartaoCredito = new ProcessadorCartaoCredito();
        //com esse objeto iremos usar o metodo criar pagamento que é um factory method
        // para criar um objeto do tipo CartaoCredito
        Pagamento pagamentoCartao = cartaoCredito.processarPagamento();
        
    }
}
