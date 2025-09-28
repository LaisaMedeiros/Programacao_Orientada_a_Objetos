package Interface.Pagamento;

//herda da interface Pagamento o método pagar
public interface PagamentoDigital extends Pagamento{
    public abstract void autenticar ();
}
