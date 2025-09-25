//classe pai
public class Animal {
    private String nome;
    
    //construtor
    public Animal(String nome) {
    	this.nome = nome;
    }
    
    public void comer() {
        //String mensagem = String.format("%s comeu", nome);
        //System.out.println(mensagem);
        //System.out.printf("%s comeu", nome);
        System.out.println(nome + " comeu!");
    }

    public void beber() {
        System.out.println(nome + " bebeu!");
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}

