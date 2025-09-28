package Interface.Pagamento;
public class Main {
    public static void main(String[] args) {
        // usando interface como tipo
        PagamentoDigital pix = new Pix();
        pix.autenticar();
        pix.pagar(150.0);

        PagamentoFsico cartao = new CartaoCredito();
        cartao.inserirCartao();
        cartao.digitarSenha();
        cartao.pagar(500.0);

        // usando interface com default + static
        Boleto boleto = new Boleto();
        boleto.pagar(200.0);
        boleto.gerarComprovante(200.0); // default method
        Comprovante.imprimirAvisoLegal(); // static method da interface
    }
}

