package Exercicios.SistemaTranfusaoDeSangue;

public class Pessoa <T extends TipoSanguineo> {
    private String nome;
    private T tipoSanguineo;

    public Pessoa(String nome, T tipoSanguineo) {
        this.nome = nome;
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getNome() {
        return nome;
    }

    public T getTipoSanguineo() {
        return tipoSanguineo;
    }
}
