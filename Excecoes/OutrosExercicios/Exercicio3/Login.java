package Excecoes.OutrosExercicios.Exercicio3;

public class Login {
    private String usuario; // Determina o nome do usuário
    private String senha; // Determina a senha do usuário.

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
        System.out.println("Senha alterada com sucesso!");
    }
    //usar throws na assinatura do método faz com que a exceção seja propagada para quem chamar o método
    public boolean fazerLogin1(String usuario, String senha) throws LoginInvalidoException {
        if (usuario.equals(this.usuario) && senha.equals(this.senha)) {
            return true; // Login bem-sucedido
        } else {
            // Quem chamar esse método precisa tratar essa exceção
            throw new LoginInvalidoException("Usuário ou senha inválidos.");
        }
    }

    //sem usar throws na assinatura do método, a exceção deve ser tratada dentro do próprio método
    public boolean fazerLogin2(String usuario, String senha) {
        try {
            if (usuario.equals(this.usuario) && senha.equals(this.senha)) {
                return true; // Login bem-sucedido
            } else {
                throw new LoginInvalidoException("Usuário ou senha inválidos.");
            }
        } catch (LoginInvalidoException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
