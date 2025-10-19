package Excecoes.OutrosExercicios.Exercicio3;

public class Principal {
    public static void main(String[] args) {
        Login login = new Login("usuario123", "senha123");

        // Testando o método fazerLogin1 que lança a exceção
        try {
            boolean sucesso = login.fazerLogin1("usuario123", "senha123");
            System.out.println("Login 1 bem-sucedido: " + sucesso);
        } catch (LoginInvalidoException e) {
            System.out.println(e.getMessage());
        }

        // Testando o método fazerLogin2 que trata a exceção internamente
        boolean sucesso2 = login.fazerLogin2("usuario123", "senhaErrada");
        System.out.println("Login 2 bem-sucedido: " + sucesso2);
    }
}
