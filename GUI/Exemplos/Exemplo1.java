// Exemplo 1
import javax.swing.JFrame;

public class PrimeiraJanela {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Minha Primeira Janela Swing");
        janela.setSize(300, 200); // Largura e altura
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
