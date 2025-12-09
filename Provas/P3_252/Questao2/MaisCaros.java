package Provas.P3_252.Questao2;

import java.util.ArrayList;

public class MaisCaros<T extends Produto>{
    private ArrayList<T> listaDezMaisCaros;

    public MaisCaros(){
        listaDezMaisCaros = new ArrayList<>();
    }

    public ArrayList<T> RetornaListaDezMaisCaros(){
        return listaDezMaisCaros;
    }

    public void add(T produto) {
        // 1. Adiciona o produto no final
        listaDezMaisCaros.add(produto);
        
        // 2. Ordena manualmente (Bubble Sort decrescente)
        for (int i = listaDezMaisCaros.size() - 1; i >= 1; i--) {
            if (listaDezMaisCaros.get(i).getPreco() > listaDezMaisCaros.get(i - 1).getPreco()) {
                    // Troca os elementos
                    T temp = listaDezMaisCaros.get(i);
                    listaDezMaisCaros.set(i, listaDezMaisCaros.get(i - 1));
                    listaDezMaisCaros.set(i - 1, temp);
            }  else {
                break; // Já está na posição certa
            }
        }
          
        // 3. Mantém só 10 elementos
        if (listaDezMaisCaros.size() > 10) {
            // Remove do final até ficar com 10
            while (listaDezMaisCaros.size() > 10) {
                listaDezMaisCaros.remove(listaDezMaisCaros.size() - 1);
            }
        }
    }
}
