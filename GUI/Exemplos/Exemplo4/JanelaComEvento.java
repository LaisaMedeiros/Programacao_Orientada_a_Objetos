package Exemplo4;
// Exemplo 3.1
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaComEvento {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Janela com Evento");
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());

        JButton botao1 = new JButton("Clique Aqui!");
        JLabel rotulo = new JLabel("Nenhum clique ainda.");

		AcaoEvento ae1 = new AcaoEvento( rotulo );

        // Adicionando o ActionListener ao botão (classe anônima)
        // ActionListener é uma interface
        botao1.addActionListener( ae1 );

		// adiciona os componentes diretamente no frame sem painel
        janela.add(botao1);
        janela.add(rotulo);
        janela.setVisible(true);
    }
}