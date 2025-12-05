package Provas.P1_252.Questao1;

public class Passeio extends Carro{
    private String modelo;

    public Passeio(String modelo, int volume, int tamTanque){
        super(volume, tamTanque);
        this.modelo = modelo;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
