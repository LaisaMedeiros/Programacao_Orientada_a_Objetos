package PadroesDeProjeto.Criacional.FactoryMethods.SistemadePagamento;

public abstract class ProcessadorDePagamento {
    // factory method, pois cria objetos do tipo Pagamento
    public abstract Pagamento criarPagamento();

    public Pagamento processarPagamento(){
        Pagamento pagamento = criarPagamento();
        pagamento.validar();
        return pagamento;
    }
}
