package Provas.P2_251.Questao2;

public class Opcional {
    private String nome;
    private double preco;
    private double volumeOcupado;

    public Opcional(String nome, double preco, double volumeOcupado) {
        this.nome = nome;
        this.preco = preco;
        this.volumeOcupado = volumeOcupado;
    }
 
    // equals() compara apenas por NOME (identificador único)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Opcional)) return false;
        Opcional opcional = (Opcional) o;
        return this.nome.equals(opcional.nome) ;
    }

    // hashCode() baseado apenas no nome
    @Override
    public int hashCode() {
        return nome.hashCode();
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getVolumeOcupado() {
        return volumeOcupado;
    }
    
    

}
