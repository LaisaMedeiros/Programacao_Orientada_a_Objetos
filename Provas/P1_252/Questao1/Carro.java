package Provas.P1_252.Questao1;

public abstract class Carro {
    protected int volume;
    protected int tamTanque;

    public Carro(int volume, int tamTanque){
        this.volume = volume;
        this.tamTanque = tamTanque;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTamTanque() {
        return tamTanque;
    }

    public void setTamTanque(int novoTamTanque) {
        if (novoTamTanque < this.volume/2){
            this.tamTanque = novoTamTanque;
        }
    }


    
}
