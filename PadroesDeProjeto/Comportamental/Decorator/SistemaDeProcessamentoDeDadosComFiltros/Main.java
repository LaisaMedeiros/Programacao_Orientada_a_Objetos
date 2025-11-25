package PadroesDeProjeto.Comportamental.Decorator.SistemaDeProcessamentoDeDadosComFiltros;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main (String args[]){
        List<Integer> lista1 = new ArrayList<>(Arrays.asList(2, 3, 4, 6, 9));
        ProcessadorBase processadorBase = new ProcessadorBase();
        processadorBase.getDescricao();

        FiltroPar listaComFiltroPar = new FiltroPar(processadorBase, true);
        listaComFiltroPar.processarDados(lista1);

        FiltroOrdenacao listaComFiltroParEOrdenacao = new FiltroOrdenacao(processadorBase, true, "crescente");
        listaComFiltroParEOrdenacao.processarDados(lista1);


    }   
}
