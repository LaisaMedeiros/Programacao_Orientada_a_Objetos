package PadroesDeProjeto.Criacional.FactoryMethods.SistemadePagamento;

// o objetivo desta classe é implementar o factory method para criar objetos do tipo CartaoCredito 
// é uma fabrica concreta que cria objetos do tipo CartaoCredito
public class ProcessadorCartaoCredito extends ProcessadorDePagamento {
    @Override
    public Pagamento criarPagamento(){
        return new CartaoCredito("4111111111111111", "João Silva", "12/25", "123");
    }
}
