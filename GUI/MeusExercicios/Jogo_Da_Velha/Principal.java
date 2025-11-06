package Jogo_Da_Velha;
import javax.swing.*;  
import java.awt.*;

public class Principal {
    public static void main(String args[]) {
        // Cria a janela
        JFrame janela = new JFrame("Jogo Da Velha");
        janela.setBounds(500, 200, 300, 400); // Aumentei a altura para caber tudo
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // BoxLayout para organizar verticalmente
        //getContentPane define o container em que o BoxLayout vai organizar
        // os componentes
        janela.setLayout(new BoxLayout(janela.getContentPane(), BoxLayout.Y_AXIS));

        // Título
        JLabel titulo = new JLabel("Jogo da Velha da Laísa!");
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Botões de seleção de modo de jogo
        JButton humano_humano = new JButton("Humano x Humano");
        humano_humano.setAlignmentX(Component.CENTER_ALIGNMENT); // Alinhamento
        humano_humano.setMaximumSize(new Dimension(200, 30)); // Largura x Altura
        
        JButton humano_cmp = new JButton("Humano x Computador");
        humano_cmp.setAlignmentX(Component.CENTER_ALIGNMENT);
        humano_cmp.setMaximumSize(new Dimension(200, 30));
        
        JButton cmp_cmp = new JButton("Computador x Computador");
        cmp_cmp.setAlignmentX(Component.CENTER_ALIGNMENT);
        cmp_cmp.setMaximumSize(new Dimension(200, 30));

        // Painel do tabuleiro
        JPanel tabuleiro = new JPanel(new GridLayout(3, 3, 10, 10)); 
        tabuleiro.setPreferredSize(new Dimension(200, 200));
        tabuleiro.setMaximumSize(new Dimension(200, 200)); // Importante para BoxLayout

        // Cria lista de botões
        JButton[] botoes = new JButton[9];
        for (int i = 0; i < 9; i++) {
            botoes[i] = new JButton("");  // Guarda no array
            botoes[i].setPreferredSize(new Dimension(50, 50));
            botoes[i].addActionListener(logicaJogo); // Registra listener
            tabuleiro.add(botoes[i]);     // Adiciona no painel
        }
        // ADICIONA NA JANELA
        janela.add(titulo);
        // Espaço após o título
        janela.add(Box.createRigidArea(new Dimension(0, 10)));
        // Adiciona os botões com espaçamento
        janela.add(humano_humano);
        // Espaçamento
        janela.add(Box.createRigidArea(new Dimension(0, 5)));
        janela.add(humano_cmp);
        // Espaçamento
        janela.add(Box.createRigidArea(new Dimension(0, 5)));
        janela.add(cmp_cmp);
        // Espaço antes do tabuleiro
        janela.add(Box.createRigidArea(new Dimension(0, 20)));
        janela.add(tabuleiro);
        janela.setVisible(true);
        
    }
}