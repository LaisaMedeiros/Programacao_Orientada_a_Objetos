package Casting.Upcasting.Animal;

// Subclasse
class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Au Au!");
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo...");
    }
}

