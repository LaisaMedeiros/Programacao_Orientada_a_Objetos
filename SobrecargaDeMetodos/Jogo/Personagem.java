package SobrecargaDeMetodos.Jogo;

public class Personagem {
    private String nome;
    private int nivel;
    private String classe;

    public Personagem(String nome){
        this.nome = nome;
        this.nivel = 1;
        this.classe = "Nenhum";
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", classe='" + classe + '\'' +
                '}';
    }

    public final void ataarSemArma(){
        System.out.println(nome + " atacou sem arma!");
    }

    public String getNome(){
        return nome;
    }

    public int getNivel(){
        return nivel;
    }

    public String getClasse(){
        return classe;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNivel(int nivel){
        this.nivel = nivel;
    }

    public void setClasse(String classe){
        this.classe = classe;
    }

    public void atacar(){
        System.out.println(nome + " atacou com um ataque básico!");
    }
}
