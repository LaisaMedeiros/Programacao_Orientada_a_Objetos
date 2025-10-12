package Genericos.Caixa;

public class Caixa<T> {
    private T conteudo;
    
    public Caixa (T conteudo){
        this.conteudo = conteudo;
    }

    public T getConteudo(){
        return conteudo;
    }

    public void mostrarConteudo(){
        System.out.println("Conteudo: " + conteudo);
    }
}
