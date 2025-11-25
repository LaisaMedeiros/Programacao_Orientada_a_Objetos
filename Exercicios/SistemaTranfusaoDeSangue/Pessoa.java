package Exercicios.SistemaTranfusaoDeSangue;

public class Pessoa <T extends TipoSanguineo> implements Observer{
    private String nome;
    private T tipoSanguineo;
    private boolean emListaDeEspera;

    public Pessoa(String nome, T tipoSanguineo) {
        this.nome = nome;
        this.tipoSanguineo = tipoSanguineo;
        this.emListaDeEspera = false;
    }

    public String getNome() {
        return nome;
    }

    public T getTipoSanguineo() {
        return tipoSanguineo;
    }

    public boolean isEmListaDeEspera(){
        return emListaDeEspera;
    }

    public void setEmListaDeEspera(boolean emListaDeEspera){
        this.emListaDeEspera = emListaDeEspera;
    }
}
