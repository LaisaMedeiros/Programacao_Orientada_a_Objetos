package PadroesDeProjeto.Criacional.FactoryMethods.SistemadePagamento;

public class ProcessorPix extends ProcessadorDePagamento {
    public Pagamento criarPagamento(){
        return new Pix("169.123.456-00", "TX123456789");
    }
}
