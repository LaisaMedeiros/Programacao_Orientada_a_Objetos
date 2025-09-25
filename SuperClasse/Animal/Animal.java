//classe pai
public class Animal {
    public String nome;

    public void comer() {
        //String mensagem = String.format("%s comeu", nome);
        //System.out.println(mensagem);
        //System.out.printf("%s comeu", nome);
        System.out.println(nome + " comeu!");
    }

    public void beber() {
        System.out.println(nome + " bebeu!");
    }
}

