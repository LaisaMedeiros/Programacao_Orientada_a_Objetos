package Provas.P3_252.Questao3;

public class LojaVirtual {
    private int contadorVendasParciais;
    public void venda(String codigo, int qtdeDesejada) {
    int estoqueAtual = estoque(codigo);
    
    try {
        if (estoqueAtual < qtdeDesejada) {
            throw new EstoqueInsuficienteException("Estoque insuficiente");
        }
        // Venda normal
        estoque(codigo, estoqueAtual - qtdeDesejada);
        
    } catch (EstoqueInsuficienteException e) {
        // TRATAMENTO: vende todo estoque disponível
        estoque(codigo, 0);
        this.contadorVendasParciais++;  // Incrementa contador
    }
}

    // retorna a quantidade disponivel em estqoue
    // o foreach para achar o produto ocorre aqui dentro
    public int estoque(String codigo);

    // define a quantidde em estqoue
    public void estoque (String codigo, int qtde);
}
