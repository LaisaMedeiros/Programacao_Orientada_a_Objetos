package Casting.Upcasting.Animal;

class Veterinario {
    // Este método aceita qualquer Animal (e, por consequência, qualquer subclasse de Animal)
    public void examinar(Animal animal) { // Upcasting no parâmetro!
        System.out.println("Examinando o animal...");
        animal.fazerSom();
    }
}
