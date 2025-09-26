package SobrecargaDeMetodos.Jogo;

public class Arqueiro extends Personagem {
    private String arma; 

    public Arqueiro(String nome) {
        super(nome);
        setClasse("Arqueiro");
        setNivel(2);
        this.arma = "Arco e Flecha";
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " atacou com um arco!");
    }

    @Override
    public String toString() {
        String infoPersonagem = super.toString();
        return infoPersonagem + ", arma='" + arma + '\'' + '}';
    }

}
