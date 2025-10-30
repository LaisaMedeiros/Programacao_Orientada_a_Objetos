import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AcaoEvento implements ActionListener {
	
	private int qtde;
	private JLabel label;
	
	public AcaoEvento( JLabel jl1 ){
		this.label = jl1;
	}
	
    @Override
    public void actionPerformed(ActionEvent e) {		
		qtde ++;
		this.label.setText("Botão clicado " + qtde + " vezes.");
    }
}