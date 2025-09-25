//Herda todas as informações da classe Animal
class Cachorro extends Animal {
    private String nome;

    public void comer(){
       System.out.println("O cachorro comeu!"); 
    }

    public void beber(){
        System.out.println("O cachorro bebeu!"); 
    }

    public void latir(){
        System.out.println("O cachorro latiu!"); 
    }

    public void lamber(){
        System.out.println("O cachorro lambeu!"); 
    }
}
