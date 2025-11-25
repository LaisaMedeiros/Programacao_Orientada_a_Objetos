package PadroesDeProjeto.Comportamental.Decorator.SistemaDeProcessamentoDeDadosComFiltros;

import java.util.List;

// por ser interface não tem atributos ou métodos implementados
public interface ProcessadorDeDados {
    // esse metodo deve receber um array de inteiros e retornar um array de inteiros 
    public List<Integer> processarDados(List<Integer> dados);

    // Este método retorna uma descrição do processador de dados
    public String getDescricao();
}
