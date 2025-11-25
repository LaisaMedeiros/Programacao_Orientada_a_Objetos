package PadroesDeProjeto.Criacional.FactoryMethods.SistemadePagamento;

public class CartaoCredito implements Pagamento {
    private String numeroCartao;
    private String nomeTitular;
    private String dataValidade;
    private String cvv;
    private boolean validado = false;

    public CartaoCredito(String numeroCartao, String nomeTitular, String dataValidade, String cvv) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.dataValidade = dataValidade;
        this.cvv = cvv;
    }

    @Override
    public boolean validar() {
        // validar se o número tem 16 d´gitos e o cvv tem 3 digitos
        System.out.println("Validando cartão de crédito...");
        if (numeroCartao.length() == 16 && cvv.length ()== 3){
            return true;
        }
        return false;
    }

    @Override
    public double calcularTaxa(double valor) {
        double taxa = valor * 0.05; // Exemplo: 5% de taxa para cartão de crédito
        System.out.println("Calculando taxa para cartão de crédito: " + taxa);
        return taxa;
    }

    @Override
    public boolean processar(double valor) {
        // Só processa se estiver validado e valor <= 2000
        if (validado == true && valor <= 2000.0){
            System.out.println("Processando pagamento com cartão de crédito no valor de: " + valor);
            return true;
        }
        return false;
        
    }

    @Override
    public boolean reembolsar(String idTransacao) {
        // Reembolsar apenas transaçõs do mesmo id
        if (idTransacao.isEmpty() || idTransacao == null){
            return false;
        }
        System.out.println("Reembolsando pagamento com cartão de crédito para a transação: " + idTransacao);
        return true;
    }
}
