package PadroesDeProjeto.Comportamental.Oberver.MonitoramentoDeEstoque;

import java.util.*;

public class EstoqueCentral implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private Map<String, Integer> estoque = new HashMap<>();

    @Override
    public void adicionar(Observer o){
        observers.add(o);
    }

    @Override
    public void remover(Observer o){
        observers.remove(o);
    }

    @Override
    public void notificar(EventoEstoque evento){
        for (Observer o : observers){
            o.update(evento);
        }
    }

    // LOGICA DO SISTEMA
    // adiciona um item no hash map coma  função put
    public void adicionarItem(String item, int quantidade) {
        estoque.put(item, quantidade);
    }

    //
    public void consumirItem(String item, int qnt) {
        // retorna o valor mapeado para a chave
        int atual = estoque.getOrDefault(item, 0);
        int novo = atual - qnt;
        estoque.put(item, novo);

        if (novo < 5) {
            notificar(new EventoEstoque(item, novo, "BAIXO"));
        }
    }

    public void reporItem(String item, int qnt) {
        int atual = estoque.getOrDefault(item, 0);
        int novo = atual + qnt;
        estoque.put(item, novo);

        notificar(new EventoEstoque(item, novo, "REPOSICAO"));
    }

}
