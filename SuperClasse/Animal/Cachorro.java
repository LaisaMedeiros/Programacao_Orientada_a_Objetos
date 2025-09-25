//Herda todas as informações da classe Animal
class Cachorro extends Animal {
    
    public void latir(){
        System.out.printf("%s latiu", super.nome); 
    }

    public void lamber(){
        System.out.printf("%s lambeu", super.nome); 
    }
}
