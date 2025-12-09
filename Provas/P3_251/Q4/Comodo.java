package Provas.P3_251.Q4;

import java.util.ArrayList;

public class Comodo {
    private ArrayList<Parede> paredes;
    private double altura;
    private double largura;

    public Comodo(int numParedes, ArrayList<Parede> paredes, double altura, double largura) {
        this.paredes = new ArrayList<>();
        this.altura = altura;
        this.largura = largura;
        for (int i = 0; i < numParedes; i++) {
            paredes.add(new Parede(altura, largura, null));
        }
    }

    public void addParede(Parede parede){
        paredes.add(parede);
    }

    public void removeParede(Parede parede){
        paredes.remove(parede);
    }

    public void mostrarParedes(){
        for(Parede parede : paredes){
            System.out.printf("Altura:", parede.getAltura(), "Largura:", parede.getLargura());
            
        }
    }
}
