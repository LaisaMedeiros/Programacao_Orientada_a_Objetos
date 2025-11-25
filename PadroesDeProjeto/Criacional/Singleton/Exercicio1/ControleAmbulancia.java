package PadroesDeProjeto.Criacional.Singleton.Exercicio1;

public class ControleAmbulancia {
    private static ControleAmbulancia instance;
    private boolean emUso;

    private ControleAmbulancia(){};

    public static ControleAmbulancia getInstance(){
        if (instance == null){
            instance = new ControleAmbulancia();
        }

        return instance;
    }

    public void usar(String setor) {
        if (!emUso) {
            emUso = true;
            System.out.println("Ambulância em uso pelo setor: " + setor);
        } else {
            System.out.println("Ambulância já está em uso!");
        }
    }

    public void liberar() {
        if (emUso) {
            emUso = false;
            System.out.println("Ambulância liberada.");
        } else {
            System.out.println("Ambulância já está disponível.");
        }
    }
}
