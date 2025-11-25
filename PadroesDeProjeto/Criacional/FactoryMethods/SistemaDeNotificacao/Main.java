package PadroesDeProjeto.Criacional.FactoryMethods.SistemaDeNotificacao;

public class Main {
    public static void main(String args[]){
        CriadorNotificacao criadorEmail  = new CriadorEmail();
        criadorEmail.enviarNotificacao(null);

        CriadorNotificacao criadorSMS = new CriadorSMS();
        criadorSMS.enviarNotificacao(null);

    }
}
