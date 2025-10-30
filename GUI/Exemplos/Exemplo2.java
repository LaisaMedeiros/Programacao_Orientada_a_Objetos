// Exemplo 2
import javax.swing.*;
import java.awt.*;

//Janela com componentes GUI usando Swing
public class Exemplo2 {
    public static void main(String[] args) {
        // Cria a janela principal
        JFrame janela = new JFrame("Janela com Componentes");
        janela.setSize(400, 300); // Define a largura e altura da janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a aplicação ao clicar em X

        // Cria um painel para adicionar os componentes
        JPanel painel = new JPanel();
        // Define o layout do painel
        painel.setLayout(new FlowLayout()); // Usando FlowLayout

        //Define a legenda, campo de texto e botão
        //Cria os componentes do painel que são objetos da classe JLabel, JTextField e JButton
        JLabel rotulo = new JLabel("Digite seu nome:");
        JTextField campoTexto = new JTextField(20);
        JButton botao = new JButton("Enviar");

		// adiciona os componentes no painel
        painel.add(rotulo);
        painel.add(campoTexto);
        painel.add(botao);

		// Adiciona o painel à janela
        janela.add(painel); 
        janela.setVisible(true);
    }
}
