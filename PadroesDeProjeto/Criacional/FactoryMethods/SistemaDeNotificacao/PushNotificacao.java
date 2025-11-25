package PadroesDeProjeto.Criacional.FactoryMethods.SistemaDeNotificacao;

public class PushNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando notificação por Push: " + mensagem);
    }
    
}
