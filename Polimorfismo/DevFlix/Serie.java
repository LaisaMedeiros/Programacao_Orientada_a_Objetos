package Polimorfismo.DevFlix;

public class Serie extends Filme {
    private int temporada;
    private int episodio;
    private int episodioAtual;
    private int temporadaAtual;
    
    public Serie(String nome, int temporada, int episodio) {
        super(nome);
        this.temporada = temporada;
        this.episodio = episodio;
        this.temporadaAtual = 1;
        this.episodioAtual = 1;
    }

    @Override
    public String toString(){
        String informacao = String.format("Nome: %s\nTemporada: %d\nEpisódio: %d\nTemporada Atual: %d\nEpisódio Atual: %d", getNome(), temporada, episodio, temporadaAtual, episodioAtual);
        return informacao;
    }


    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public int getEpisodioAtual() {
        return episodioAtual;
    }

    public void setEpisodioAtual(int episodioAtual) {
        this.episodioAtual = episodioAtual;
    }

    public int getTemporadaAtual() {
        return temporadaAtual;
    }

    public void setTemporadaAtual(int temporadaAtual) {
        this.temporadaAtual = temporadaAtual;
    }
    
}
