package Interface.Pagamento;

public interface PagamentoFsico extends Pagamento {
    public abstract void inserirCartao ();
    public abstract void digitarSenha ();
}