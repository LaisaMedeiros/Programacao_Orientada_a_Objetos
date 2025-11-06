package PadroesDeProjeto.Criacional.Singleton.Exemplo2;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Testando Singleton ---");
        
        // Chamada 1: Pega a primeira e única instância.
        // A instância será criada aqui.
        Logger logger1 = Logger.getInstance();
        logger1.log("Iniciando a aplicação...");
        
        // Chamada 2: Pega a instância já existente.
        Logger logger2 = Logger.getInstance();
        logger2.log("Processando dados do usuário...");
        
        // Chamada 3 (em outro "módulo"): Pega a instância já existente.
        Logger logger3 = Logger.getInstance();
        logger3.log("Encerrando o processo.");

        System.out.println("\n--- Prova de Unicidade ---");
        
        // Se for um Singleton, todos devem ser o mesmo objeto (retorna 'true').
        boolean saoIguais = (logger1 == logger2) && (logger2 == logger3);
        System.out.println("As 3 variáveis apontam para o mesmo objeto? " + saoIguais);
    }
}