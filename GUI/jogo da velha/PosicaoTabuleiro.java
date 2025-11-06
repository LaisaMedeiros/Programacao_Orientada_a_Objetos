import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PosicaoTabuleiro extends JButton {
	
	private int number;
	
	public PosicaoTabuleiro( int num, String texto  ){
		this.number = num;
		this.setText( texto );
	}	
}
