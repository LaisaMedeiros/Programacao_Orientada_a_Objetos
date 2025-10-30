import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogoDaVelha {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Jogo da velha");
        janela.setSize(800, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());
        
		// rótulo de mensagens
        JLabel mensagem = new JLabel("Escolha a opção:");
        janela.add( mensagem );
        
		// menu
        JPanel menu = new JPanel();
        menu.setLayout(new FlowLayout()); // Usando FlowLayout
        JButton botao1 = new JButton("Humano x Humano");
        JButton botao2 = new JButton("Humano x Computador");
        JButton botao3 = new JButton("Computador x Computador");
        menu.add(botao1);
        menu.add(botao2);
        menu.add(botao3);
        janela.add(menu); 
        
        // tabuleiro
        JPanel tabuleiro = new JPanel();
        tabuleiro.setLayout(new GridLayout(3, 3, 5, 5));

		EventoJogada evjo1 = new EventoJogada( mensagem );
        // Adicionando botões
        PosicaoTabuleiro[] posTab = new PosicaoTabuleiro[9];
        
        for(int i = 0; i < 9; i++){
			PosicaoTabuleiro pos1 = new PosicaoTabuleiro( i, " " );
			tabuleiro.add( pos1 );
			pos1.addActionListener( evjo1  );
			posTab[i] = pos1;
		}
		
		// classe anônima para mostrar o tabuleiro quando
		// for feita a escolha
        botao1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
				janela.add(tabuleiro);
				janela.revalidate();
				janela.repaint();
            }
        });
		
		// Adiciona o painel à janela
        janela.setVisible(true);        
    }
}
