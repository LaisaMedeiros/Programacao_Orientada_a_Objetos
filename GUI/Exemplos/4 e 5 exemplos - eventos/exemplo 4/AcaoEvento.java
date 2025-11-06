import javax.swing.*;
import java.awt.event.*;

public class AcaoEvento implements ActionListener {
	
	private int qtde;
	private JLabel label;
	
	public AcaoEvento( JLabel jl1 ){
		// isso aqui existe pq actionPerformed precisa 
		// saber qual rótulo atualizar quando o botão for clicado!
		// label agora "aponta" para o mesmo objeto que rotulo
		this.label = jl1; 
	}
	
	// é chamdo toda vez que botao1.addActionListener( ae1 );
    @Override
    public void actionPerformed(ActionEvent e) {		
		qtde ++;
		this.label.setText("Botão clicado " + qtde + " vezes."); // Muda o MESMO objeto que rotulo
    }
}
