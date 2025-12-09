package Provas.P3_251.Q1;

public class Classes {
    
    protected static int contador = 0;
    protected int tamanho; // UM atributo por objeto

    // Método para pegar contador atual (se precisar)
    public static int getContador() {
        return contador;
    }

    // Getter para tamanho (comum a todos)
    public int getTamanho() {
        return tamanho;
    }
    
    // Setter para tamanho (comum a todos)
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

}
