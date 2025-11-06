// Exemplo 5
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaComEvento {
    public static void main(String[] args) {

        // cria e configura janela
        JFrame janela = new JFrame("Janela com Evento");
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());

        // cria botão e legenda
        JButton botao1 = new JButton("Clique Aqui!");
        JLabel rotulo = new JLabel("Nenhum clique ainda.");

        // CLASSE ANÔNIMA - ESPECÍFICA PARA ESTE BOTÃO, NÃO PODE SER REUTILIZADO PARA OUTROS BOTÕES
        // para definir o que acontece ao clicar no botão
        // dentro do parenteses há uma clase que implementa ActionListener
        botao1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rotulo.setText("Botão já foi clicado!");
            }
        });

        JButton botao2 = new JButton("Clique Aqui!");
        JLabel rotulo2 = new JLabel("Nenhum clique ainda.");
        // O botao2 não faz NADA quando clicado!

		// adiciona os componentes diretamente no frame sem painel
        janela.add(botao1);
        janela.add(rotulo);
        janela.add(botao2);
        janela.add(rotulo2);
        janela.setVisible(true);
    }
}
