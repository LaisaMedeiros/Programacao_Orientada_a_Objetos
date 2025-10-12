package Casting.Upcasting.Aves;

// Classe que implementa a interface
class Passaro implements Voavel {
    @Override
    public void voar() {
        System.out.println("Passaro voando alto!");
    }

    public void fazerNinho() {
        System.out.println("Construindo ninho...");
    }
}
