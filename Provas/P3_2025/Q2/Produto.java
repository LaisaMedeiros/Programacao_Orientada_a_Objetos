package ProvasAntigas.P3_2025.Q2;

import java.util.List;

public class Produto {

    protected String nome;
    protected float preco;

    public Produto(float preco, String nome){
        this.nome = nome;
        this.preco = preco;
    }

    public List<String> metodoOrdenada(List<Produto> lista){
        List<String> listaNomes = new List<>();
        Produto objetoMenor = lista.get(0);
        for (int i = 1; i < lista.size(); i++){
            if (objetoMenor.getPreco() > lista.get(i).getPreco()){
                String variavelGuardaNome = ObjetoMenor.getNome();
                ObjetoMenor.setNome(lista[i].getNome);
                lista[i].setNome(variavelGuardaNome);
                lista
            }
        }
    }


    
}
