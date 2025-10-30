// Exemplo 5
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exemplo5 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Janela com Evento");
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());

        JButton botao1 = new JButton("Clique Aqui!");
        JLabel rotulo = new JLabel("Nenhum clique ainda.");

		// Classe anônima
        // Adicionando o ActionListener ao botão (classe anônima)
        // ActionListener é uma interface
        botao1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rotulo.setText("Botão já foi clicado!");
            }
        });

        JButton botao2 = new JButton("Clique Aqui!");
        JLabel rotulo2 = new JLabel("Nenhum clique ainda.");

		// adiciona os componentes diretamente no frame sem painel
        janela.add(botao1);
        janela.add(rotulo);
        janela.add(botao2);
        janela.add(rotulo2);
        janela.setVisible(true);
    }
}