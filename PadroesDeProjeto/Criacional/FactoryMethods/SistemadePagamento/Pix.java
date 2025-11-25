package PadroesDeProjeto.Criacional.FactoryMethods.SistemadePagamento;

public class Pix implements Pagamento{
    private String chavePix;
    private boolean validado = false;
    private String idTransacao;

    public Pix(String chavePix, String idTransacao) {
        this.chavePix = chavePix;
        this.idTransacao = idTransacao;
    }

    @Override 
    public boolean validar(){
        if (chavePix == null || chavePix.isEmpty()){
            validado = false;
            return validado;
        }
        validado = true;
        return validado;
    }

    @Override
    public boolean processar(double valor){
        if (validado == true){
            System.out.println("Processando pagamento via Pix...");
            return true;
        }
        return false;
    }

    @Override 
    public double calcularTaxa(double valor){
        float taxa = 0; // Pix geralmente não tem taxa
        System.out.println("Calculando taxa para Pix: ");
        return taxa;
    }

    @Override
    public boolean reembolsar(String idTransacao){
        if (idTransacao == this.idTransacao){
            System.out.println("Reembolsando pagamento via Pix para a transação: " + idTransacao);
            return true;
        }
        return false;
    }
}
