package PadroesDeProjeto.Criacional.Singleton.Exemplo1;

public class ConfiguracoesEager {
    // A instância é criada AQUI, no momento do carregamento da classe.
    private static final ConfiguracoesEager INSTANCE = new ConfiguracoesEager(); 

    private ConfiguracoesEager() {
        // Construtor privado
    }

    public static ConfiguracoesEager getInstance() {
        // Sem verificação, apenas retorna a instância já criada.
        return INSTANCE; 
    }
}

