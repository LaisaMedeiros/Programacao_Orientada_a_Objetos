import javax.swing.*;
import java.awt.event.*;

// Lida com o que acontece quando o jogador clica em umd os botões do tabuleiro
// ActionListener é uma interface O ActionListener é uma interface em Java que permite
// que seu programa "escute" e responda a eventos de ação, como cliques em botões, 
// pressionar Enter em campos de texto, ou selecionar itens de menu.
public class EventoJogada implements ActionListener {
	
	// rue indica que o primeiro jogador 'O' começa
	private boolean vezZero = true; // variável para rastrear de quem é a vez de jogar. 
	private JLabel mensagem; // usado para exibir mensagens ao usuário
	
	// construtor 
	public EventoJogada( JLabel mensagem ){
		this.mensagem = mensagem;
	}
	
	// sobrescre o metodo da classe ActionListerner
    @Override
    public void actionPerformed(ActionEvent e) {
		vezZero = ! vezZero; // inverte a vez por que?
		// botão que pega o evento e
		JButton bot1 = (JButton) e.getSource();
		// Se a celula já está preenchida:
		if( bot1.getText() == "0" || bot1.getText() == "X" )
			mensagem.setText( "Jogada inválida" );
		else{
			if( vezZero )
				bot1.setText( "0" );
			else
				bot1.setText( "X" );
		}
    }
}
