package PadroesDeProjeto.Criacional.Singleton.Exemplo4;

public class ConexaoBanco {
    private static ConexaoBanco instance = new ConexaoBanco();

    private ConexaoBanco(){}

    public static ConexaoBanco getInstance(){
        return instance;
    }

    public void conectar(){
        System.out.println("Conexão estabelecida");
    }

    public void desconectar(){
        System.out.println("Conexão encerrada");
    }

}
