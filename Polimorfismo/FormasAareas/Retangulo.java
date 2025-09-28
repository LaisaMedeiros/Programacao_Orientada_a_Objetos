package Polimorfismo.FormasAareas;

public class Retangulo extends Forma {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // OVERRIDE
    @Override
    public double calcularArea() {
        return base * altura;
    }
    
    // OVERRIDE - implementação específica para Retangulo
    @Override
    public void exibirArea() {
        System.out.println("Área do retângulo (" + base + "x" + altura + "): " + calcularArea());
    }
    
    // OVERRIDE
    @Override
    public String getTipo() {
        return "Retângulo";
    }
    
    // OVERLOAD - método específico do Retangulo
    public void exibirPerimetro() {
        System.out.println("Perímetro: " + (2 * (base + altura)));
    }
    
    public void exibirPerimetro(String unidade) {
        System.out.println("Perímetro: " + (2 * (base + altura)) + " " + unidade);
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
}