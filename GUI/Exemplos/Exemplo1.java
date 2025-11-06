// Exemplo 1
import javax.swing.JFrame;
//Primeira janela Swing em Java
public class Exemplo1 {
    public static void main(String[] args) {
        // Criando uma instância de JFrame
        JFrame janela = new JFrame("Minha Primeira Janela Swing");
        // Configurando o tamanho
        janela.setSize(0300, 200); // Largura e altura
        //JFrame.EXIT_ON_CLOSE faz com que a aplicação seja encerrada quando a janela for fechada
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a aplicação ao fechar a janela
        // Tornando a janela visível na tela
        janela.setVisible(true);
    }
}
