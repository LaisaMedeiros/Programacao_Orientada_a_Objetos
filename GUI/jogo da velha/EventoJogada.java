import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventoJogada implements ActionListener {
	
	private boolean vezZero = true;
	private JLabel mensagem;
	
	public EventoJogada( JLabel mensagem ){
		this.mensagem = mensagem;
	}
	
    @Override
    public void actionPerformed(ActionEvent e) {
		vezZero = ! vezZero;
		JButton bot1 = (JButton) e.getSource();
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
