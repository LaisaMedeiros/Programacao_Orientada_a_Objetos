package PadroesDeProjeto.Criacional.Singleton.Exemplo1;

public class ConfiguracoesLazy {
    // **2. Instância Estática e Privada**
    private static ConfiguracoesLazy instancia;

    // 1. Construtor Privado
    private ConfiguracoesLazy() {
        // não permite a crição de objetos fora da classe
    }

    // **3. Método de Acesso Público e Estático**
    public static ConfiguracoesLazy getInstance() {
        
        // **4. Lógica de Criação Controlada** (Lazy Initialization)
        if (instancia == null) {
            // Cria a instância *apenas* na primeira vez
            instancia = new ConfiguracoesLazy(); 
        }
        // Retorna a instância única e armazenada
        return instancia;
    }
}
