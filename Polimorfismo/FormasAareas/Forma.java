package Polimorfismo.FormasAareas;

public abstract class Forma {
    
    // Método abstrato (será sobrescrito)
    public abstract double calcularArea();
    
    // OVERRIDE - método concreto que pode ser sobrescrito
    public void exibirArea() {
        System.out.println("A área da forma é: " + calcularArea());
    }
    
    // OVERLOAD - versões diferentes do mesmo método
    public void exibirArea(String unidade) {
        System.out.println("A área da forma é: " + calcularArea() + " " + unidade);
    }
    
    public void exibirArea(String nome, String cor) {
        System.out.println(nome + " (" + cor + ") - Área: " + calcularArea());
    }
    
    // Método que pode ser sobrescrito nas subclasses
    public String getTipo() {
        return "Forma Geométrica";
    }
}