package PadroesDeProjeto.Criacional.FactoryMethods.SistemaDeNotificacao;

public abstract class CriadorNotificacao {
    // as subclasses concretas implementam este metodo para criar diferentes tipos de notificações
    public abstract Notificacao criarNotificacao();

    // metodo que utiliza a notificação criada
    public void enviarNotificacao(String mensagem){
        Notificacao notificacao = criarNotificacao();
        notificacao.enviar(mensagem);
    }
}
