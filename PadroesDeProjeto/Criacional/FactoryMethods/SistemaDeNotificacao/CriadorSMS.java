package PadroesDeProjeto.Criacional.FactoryMethods.SistemaDeNotificacao;

public class CriadorSMS extends CriadorNotificacao{
    @Override
    public Notificacao criarNotificacao(){
        return new SMSNotificacao();
    }
}
