package Polimorfismo.FormasAareas;

public class Triangulo extends Forma {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // OVERRIDE
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    
    // OVERRIDE - implementação específica para Triangulo
    @Override
    public void exibirArea(String unidade) {
        System.out.println("Área do triângulo: " + calcularArea() + " " + unidade + " (base: " + base + ", altura: " + altura + ")");
    }
    
    // OVERRIDE
    @Override
    public String getTipo() {
        return "Triângulo";
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
} {
    
}
