package PadroesDeProjeto.Criacional.Singleton.Exercicio1;

public class ControleExames {
    private static ControleExames instance;
    private boolean emUso;

    private ControleExames(){};

    public static ControleExames getInstance(){
        if (instance == null){
            instance = new ControleExames();
        }

        return instance;
    }

    public void usar(String setor) {
        if (!emUso) {
            emUso = true;
            System.out.println("Laboratório de Exames em uso pelo setor: " + setor);
        } else {
            System.out.println("Laboratório de Exames já está em uso!");
        }
    }

    public void liberar() {
        if (emUso) {
            emUso = false;
            System.out.println("Laboratório de Exames liberado.");
        } else {
            System.out.println("Laboratório de Exames já está disponível.");
        }
    }
}
