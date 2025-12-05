package Provas.P1_252.Questao1;

public class Utilitario extends Carro{
    private int carga;

    public Utilitario(int carga, int volume, int tamTanque){
        super(volume, tamTanque);
        this.carga = carga;

    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    

}
