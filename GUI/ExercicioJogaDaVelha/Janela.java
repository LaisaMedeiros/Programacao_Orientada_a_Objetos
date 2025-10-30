package GUI.ExercicioJogaDaVelha;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Exemplo4.AcaoEvento;

public class Janela {
    
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
