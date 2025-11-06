// Exemplo 3
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

        // FlowLayout é um gerenciador de layout que organiza os componentes em linha horizontal, 
        // da esquerda para a direita, quando a largura do container é atingida vai para
        // a próxima linha. É centralizado por padrão

        JButton botao1 = new JButton("Clique Aqui!");
        JLabel rotulo = new JLabel("Nenhum clique ainda.");

        // Cria um objeto para guardar os cliques 
        // Passa o enderelo do rótulo
		AcaoEvento ae1 = new AcaoEvento( rotulo );

        // Quando clicar no botão atualiza o rótulo
        // O java chama automaticamente actonPerformed
        // Você clica no botão → o botão avisa o AcaoEvento → o AcaoEvento conta +1 e muda o texto do rótulo
        botao1.addActionListener( ae1 );

		// adiciona os componentes diretamente no frame sem painel
        janela.add(botao1);
        janela.add(rotulo);
        janela.setVisible(true);
    }
}
