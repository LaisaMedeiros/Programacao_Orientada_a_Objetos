//classe pai
public class Animal {
    private String nome;

    public void comer() {
        //String mensagem = String.format("%s comeu", nome);
        //System.out.println(mensagem);
        //System.out.printf("%s comeu", nome);
        System.out.println(nome + " comeu!");
    }

    public void beber() {
        System.out.println(nome + " bebeu!");
    }

    public getNome(){
        return nome;
    }

    public setNome(String nome){
        this.nome = nome;
    }
}


