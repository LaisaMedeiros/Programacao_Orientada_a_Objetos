package PadroesDeProjeto.Criacional.Singleton.Exemplo3;

public class Main {
    public static void main(String[] args) {

        Configuracao config1 = Configuracao.getInstance();
        System.out.printf("Objeto1: %s %s\n", config1.getIdioma(), config1.getTema());
        config1.setIdioma("Ingles");
        config1.setTema("Escuro");

        Configuracao config2 = Configuracao.getInstance();
        System.out.printf("Objeto2: %s %s\n", config2.getIdioma(), config2.getTema());
    }
  
}
