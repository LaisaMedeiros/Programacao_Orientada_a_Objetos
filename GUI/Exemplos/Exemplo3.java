// Exemplo 3
import javax.swing.*;
import java.awt.*;

//Janela com GridLayout usando Swing
public class Exemplo3 {
    public static void main(String[] args) {
		
        JFrame janela = new JFrame("Exemplo GridLayout");
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 3 linhas, 2 colunas, espaçamento horizontal e vertical de 5 pixels
        janela.setLayout(new GridLayout(3, 2, 5, 5));

        // Adicionando botões
        janela.add(new JButton("Botão 1"));
        janela.add(new JButton("Botão 2"));
        janela.add(new JButton("Botão 3"));
        janela.add(new JButton("Botão 4"));
        janela.add(new JButton("Botão 5"));
        janela.add(new JButton("Botão 6"));

        janela.setVisible(true);
	}
}
