package PadroesDeProjeto.Comportamental.Decorator.SistemaDeProcessamentoDeDadosComFiltros;
import java.util.List;
public class ProcessadorBase implements ProcessadorDeDados{

    private String descricao;

    @Override
    public List<Integer> processarDados(List<Integer> dados){
        // retorna os dados sem nenhuma modificação
        return dados;
    }

    @Override
    public String getDescricao(){
        return descricao;
    }

    
}
