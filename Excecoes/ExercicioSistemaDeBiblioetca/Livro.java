package Excecoes.ExercicioSistemaDeBiblioetca;

public class Livro {
    private String titulo;
    private int codigo;
    private String status;
    private String usuario_atual;

    // CORREÇÃO: remova o último parâmetro ou torne opcional
    public Livro(String titulo, int codigo){
        this.titulo = titulo;
        this.codigo = codigo;
        this.status = "disponível"; // com acento
        this.usuario_atual = "Biblioteca"; // valor padrão
    }

    public void emprestimo(int codigo){
        // CORREÇÃO: use "disponível" com acento (igual ao construtor)
        if (status.equals("disponível")){
            status = "emprestado";
            this.usuario_atual = "Usuário Padrão"; // definir um usuário
        } else {
            // CORREÇÃO: adicione mensagem à exceção
            throw new LivroJaEmprestado("Livro já está emprestado!");
        }
    }

    public void devolucao() throws LivroJaEstaDisponivel {
        if (status.equals("emprestado")){
            status = "disponível";
            this.usuario_atual = "Biblioteca";
        } else {
            // CORREÇÃO: adicione mensagem à exceção
            throw new LivroJaEstaDisponivel("Livro já está disponível!");
        }
    }

    public void transferencia(String novoUsuario) {
        if (!status.equals("emprestado")) {
            throw new LivroNaoEstaEmprestadoException("Livro precisa estar emprestado para transferência");
        }
        if (novoUsuario == null || novoUsuario.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do novo usuário não pode ser vazio");
        }
        
        String usuarioAnterior = this.usuario_atual;
        this.usuario_atual = novoUsuario.trim();
        System.out.println("Livro transferido de '" + usuarioAnterior + "' para '" + novoUsuario + "'");
    }

    public void consultaDeStatus(){
        System.out.println("Status: "+ status);
    }

    // CORREÇÃO: adicione este método que está faltando
    public String getStatus() {
        return status;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getCodigo(){
        return codigo;
    }
    
    // Opcional: método para ver usuário atual
    public String getUsuarioAtual() {
        return usuario_atual;
    }
}