package Polimorfismo.FormasAareas;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    // OVERRIDE - implementação específica do método abstrato
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
    
    // OVERRIDE - sobrescrevendo método concreto da classe pai
    @Override
    public void exibirArea() {
        System.out.println("Área do círculo (raio=" + raio + "): " + calcularArea());
    }
    
    // OVERRIDE - sobrescrevendo método para comportamento específico
    @Override
    public String getTipo() {
        return "Círculo";
    }
    
    // OVERLOAD - método específico da classe Circulo
    public void exibirAreaComDiametro() {
        System.out.println("Diâmetro: " + (2 * raio) + ", Área: " + calcularArea());
    }
    
    public void exibirAreaComDiametro(String unidade) {
        System.out.println("Diâmetro: " + (2 * raio) + unidade + ", Área: " + calcularArea() + unidade + "²");
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}