package Casting.Upcasting.Aves;

// Classe principal
public class Main {
    public static void main(String[] args) {
        // Upcasting para uma interface
        Voavel minhaAve = new Passaro(); // UPCASTING!

        minhaAve.voar(); // Funciona perfeitamente
        // minhaAve.fazerNinho(); // ERRO DE COMPILAÇÃO! A interface Voavel não conhece este método.
    }
