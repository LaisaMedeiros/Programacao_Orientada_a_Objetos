package PadroesDeProjeto.Criacional.FactoryMethods.SistemadePagamento;

public interface Pagamento {
    boolean validar();
    boolean processar(double valor); //Processa o pagamento
    boolean reembolsar(String idTransacao); //Reembolsa o pagamento
    double calcularTaxa(double valor); //Calcula a taxa do pagamento
}
