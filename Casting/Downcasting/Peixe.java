package Casting.Downcasting;

class Peixe extends Animal {
    @Override
    public void mover() {
        System.out.println("Peixe nadando...");
    }
    
    public void bolhas() {
        System.out.println("Glub glub! Fazendo bolhas...");
    }
}