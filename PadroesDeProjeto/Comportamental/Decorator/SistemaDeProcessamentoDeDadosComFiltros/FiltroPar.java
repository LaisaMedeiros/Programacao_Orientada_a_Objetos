package PadroesDeProjeto.Comportamental.Decorator.SistemaDeProcessamentoDeDadosComFiltros;

import java.util.ArrayList;
import java.util.List;

public class FiltroPar extends ProcessadorDecorator{
    private List<Integer> lista_par = new ArrayList<>();
    private boolean ativo = false;
    public FiltroPar(ProcessadorDeDados processadorDeDados, boolean ativo){
        super(processadorDeDados);
        this.ativo = ativo;
    }

    @Override
    public List<Integer> processarDados(List<Integer> dados){
        if (ativo){
            for (int i = 0; i< dados.size(); i++){
                if (dados.get(i) % 2 == 0){
                    lista_par.add(dados.get(i));
                }
            }
        }
        return processadorDeDados.processarDados(dados);
    }

    @Override 
    public String getDescricao(){
        if (ativo){
            return processadorDeDados.getDescricao() + ", Filtro Par";
        } else {
            return processadorDeDados.getDescricao();
        }
    }
} 
