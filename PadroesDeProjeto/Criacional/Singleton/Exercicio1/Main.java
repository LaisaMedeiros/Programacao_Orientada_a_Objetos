package PadroesDeProjeto.Criacional.Singleton.Exercicio1;

public class Main {
    public static void main(String[] args) {
        ControleAmbulancia amb1 = ControleAmbulancia.getInstance();
        ControleAmbulancia amb2 = ControleAmbulancia.getInstance();

        amb1.usar("Emergência");
        amb2.usar("Pediatria");
        amb1.liberar();

        ControleExames ex1 = ControleExames.getInstance();
        ex1.usar("Laboratório 1");
        ex1.liberar();

        ControleSalaCirurgia sc = ControleSalaCirurgia.getInstance();
        sc.usar("Centro Cirúrgico");
        sc.liberar();

    }
}
