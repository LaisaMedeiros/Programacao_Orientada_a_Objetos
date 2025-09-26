public class Serie{
    private String nome;
    private int temporadas;
    private int ano;

    public Serie(String nome, int temporadas, int ano){
        this.nome = nome;
        this.temporadas = temporadas;
        this.ano = ano;
    }
    //sobrescrevendo o método toString da classe Object
    @Override
    public String toString(){
        //String para rrecber as informações
        String info = String.format("Nome: %s\nTemporadas: %d\nAno: %d", nome, temporadas, ano);
        return info;
    }

    public String getNome(){
        return nome;
    }

    public int getTemporadas(){
        return temporadas;
    }

    public int getAno(){
        return ano;
    }

    public String setNome(String nome){
        this.nome = nome;
    }

    public int setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public int setAno(int ano){
        this.ano = ano;
    }
}