package PadroesDeProjeto.Comportamental.Decorator.SistemaDeProcessamentoDeDadosComFiltros;

import java.util.List;
import java.util.ArrayList;

public class FiltroOrdenacao extends ProcessadorDecorator {
    private boolean ativo = false;
    private String ordem;
    
    public FiltroOrdenacao(ProcessadorDeDados processadorDeDados, boolean ativo, String ordem){
        super(processadorDeDados);
        this.ativo = ativo;
        this.ordem = ordem;
    }

   @Override
    public String getDescricao(){
        if (!ativo) {
            return super.getDescricao();
        }
        
        if (ordem.equals("crescente")){
            return super.getDescricao() + " → Ordem Crescente";
        } else if (ordem.equals("decrescente")){
            return super.getDescricao() + " → Ordem Decrescente";
        } else {
            return super.getDescricao() + " → Ordem Inválida";
        }
    }

    @Override
    public List<Integer> processarDados(List<Integer> dados){
        // precisa disso, pois pode haver alcguma funcionalidade calculada no decorador
        // cada classe filtro deve se preocupar só com a sua funcionalidade
       List<Integer> dadosProcessados = super.processarDados(dados);

        if (!ativo){
            return dadosProcessados;
        }

       // para n aletrar a lista atual cria outra
       List <Integer> lista_ordem = new ArrayList<>();
        
        //Colocando a lista em ordem 
        for (int i = 0; i < lista_ordem.size(); i++){
            int posicaoAlvo = i;

            for (int j = i+ 1; j < lista_ordem.size(); j++){
                if (ordem.equals("crescente")){
                    if(lista_ordem.get(j) < lista_ordem.get(posicaoAlvo)){
                        posicaoAlvo = j;
                    } 
                } else {
                    if (lista_ordem.get(j) > lista_ordem.get(posicaoAlvo)){
                        posicaoAlvo = j;
                    }
                }
            }
            int temp = lista_ordem.get(i);
            lista_ordem.set(i, lista_ordem.get(posicaoAlvo));
            lista_ordem.set(posicaoAlvo, temp);
            
        }

        return lista_ordem;
    }


}
