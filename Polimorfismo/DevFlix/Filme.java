package Polimorfismo.DevFlix;

public class Filme extends Video {
    private String audio;
    private String legenda;

    public Filme(String nome) {
        super(nome);
        this.audio = "Português";
        this.legenda = "Nenhum";
    }

    //Esta sobrescrevendo o metodo sem aproveitar o metodo da classe mae
    @Override
    public void play() {
        System.out.println("Reproduzindo o filme: " + getNome());
    }

    public void play(String audio) {
        this.audio = audio;
        System.out.println("Reproduzindo o filme: " + toString());
        if (audio == "Português") {
            this.legenda = "Nenhum";
        } else {
            this.legenda = "Português";
        }
    }

    @Override
    public String toString() {
        String informacao = String.format("Nome: %s\nÁudio: %s\nLegenda: %s", getNome(), audio, legenda);
        return informacao;
    }

    public void play(String audio, String legenda) {
        this.audio = audio;
        this.legenda = legenda;
        System.out.println("Reproduzindo o filme: " + toString());

    }
}