package PadroesDeProjeto.Criacional.Singleton.Exemplo2;

public class Logger {
    
    private static Logger instance;
    private final String id; // Para identificar a única instância

    private Logger(){
        // Inicializa o ID com um valor único ou timestamp para visualização
        this.id = "Logger_" + System.currentTimeMillis();
    }

    public static Logger getInstance(){
        if ( instance == null){
            instance = new Logger();
        }

        return instance;
    }

    public void log(String mensagem) {
        System.out.println("[" + this.id + "] Log: " + mensagem);
    }
}
