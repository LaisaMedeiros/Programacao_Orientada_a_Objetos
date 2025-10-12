package Casting.Upcasting.Animal;

// Classe principal
public class Main {
    public static void main(String[] args) {
        // Upcasting implícito e explícito acontecendo aqui:
        Animal meuAnimal = new Cachorro(); // UPCASTING!

        meuAnimal.fazerSom(); // Vai imprimir "Au Au!" (polimorfismo)
        // meuAnimal.abanarRabo(); // ERRO DE COMPILAÇÃO! O compilador vê 'meuAnimal' apenas como um Animal.
        
        Veterinario vet = new Veterinario();
        Cachorro dog = new Cachorro();

        vet.examinar(dog); // Upcasting de Cachorro para Animal

    }
}
