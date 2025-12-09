package Provas.P3_251.Q4;

public class Parede {
    private double altura;
    private double largura;
    private Porta porta;
    // Se não tiver porta basta colocar null

    public Parede(double altura, double largura, Porta porta){
        this.altura = altura;
        this.largura = largura;
        this.porta = porta;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void adicionarPorta(Porta porta) {
        this.porta = porta;
    }

    public void removerPorta() {
        this.porta = null;
    }

    public boolean temPorta() {
        return porta != null;
    }
}
