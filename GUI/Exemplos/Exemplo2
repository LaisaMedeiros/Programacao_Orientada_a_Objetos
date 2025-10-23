// Exemplo 2
import javax.swing.*;
import java.awt.*;

public class JanelaComComponentes {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Janela com Componentes");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout()); // Usando FlowLayout

        JLabel rotulo = new JLabel("Digite seu nome:");
        JTextField campoTexto = new JTextField(20);
        JButton botao = new JButton("Enviar");

		// adiciona os componentes no painel
        painel.add(rotulo);
        painel.add(campoTexto);
        painel.add(botao);

		// Adiciona o painel à janela
        janela.add(painel); 
        janela.setVisible(true);
    }
}
