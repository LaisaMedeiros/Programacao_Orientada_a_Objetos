package PadroesDeProjeto.Criacional.FactoryMethods.SistemaDeNotificacao;

// essa classe concreta implementa o metodo de criacao para notificacoes por email
public class CriadorEmail extends CriadorNotificacao{
    // essa classe retorna um objeto da classe NotificacaoEmail
    @Override 
     public Notificacao criarNotificacao(){
        return new EmailNotificacao();
     }
} 
    

