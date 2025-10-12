package Exercicios.ReceitaFederal;

public class Contribuinte <T extends Categoria> {
    private String nome;
    private Categoria categoria;
    private int pontos;

    public Contribuinte(String nome, Categoria categoria, int pontos) {
        this.nome = nome;
        this.categoria = categoria;
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getPontos() {
        return pontos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
