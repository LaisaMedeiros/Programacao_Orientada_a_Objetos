package Casting.Downcasting;

class Passaro extends Animal {
    @Override
    public void mover() {
        System.out.println("Pássaro voando...");
    }
    
    public void cantar() {
        System.out.println("Piu piu! Cantando...");
    }
}