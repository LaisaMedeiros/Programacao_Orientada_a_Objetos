package PadroesDeProjeto.Comportamental.Decorator.SistemaDeProcessamentoDeDadosComFiltros;
import java.util.List;
public class ProcessadorDecorator implements ProcessadorDeDados{
    protected ProcessadorDeDados processadorDeDados;

    public ProcessadorDecorator(ProcessadorDeDados processadorDeDados){
        this.processadorDeDados = processadorDeDados;
    }

    @Override
    public List<Integer> processarDados(List <Integer> dados){
        return processadorDeDados.processarDados(dados);
    }

    @Override
    public String getDescricao(){
        return processadorDeDados.getDescricao();
    }
}
