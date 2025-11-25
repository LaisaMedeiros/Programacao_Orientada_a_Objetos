package PadroesDeProjeto.Criacional.Singleton.Exercicio1;

public class ControleSalaCirurgia {
    private static ControleSalaCirurgia instance;
    private boolean emUso;

    private ControleSalaCirurgia(){};

    public static ControleSalaCirurgia getInstance(){
        if (instance == null){
            instance = new ControleSalaCirurgia();
        }

        return instance;
    }

    public void usar(String setor) {
        if (!emUso) {
            emUso = true;
            System.out.println("Sala de Cirurgia em uso pelo setor: " + setor);
        } else {
            System.out.println("Sala de Cirurgia já está em uso!");
        }
    }

    public void liberar() {
        if (emUso) {
            emUso = false;
            System.out.println("Sala de Cirurgia liberada.");
        } else {
            System.out.println("Sala de Cirurgia já está disponível.");
        }
    }
    
}
