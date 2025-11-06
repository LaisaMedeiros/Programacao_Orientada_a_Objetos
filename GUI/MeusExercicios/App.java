package GUI.MeusExercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
// import javax.swing.JTextArea;
import javax.swing.JTextField;

public class App {
    public static void main (String[] args){
        JFrame janela = new JFrame();
        //(x, y, largura, altura)
        janela.setBounds(0, 0, 400, 600);

        // Criando um texto com Label
        JLabel labelUsuario = new JLabel("Usuario");
        labelUsuario.setBounds(150,200,100,30);

        // criando o campo para o uduario digitar
        JTextField campoUsuario = new JTextField("");
        campoUsuario.setBounds(100, 230, 150, 30);

        // cria campo com várias linhas
        // JTextArea campoLinhas = new JTextArea("Varias linhas para digitar");
        // campoLinhas.setBounds(10, 150, 150, 100);

        // Criando uma Label para senha
        JLabel labelSenha = new JLabel("Senha");
        labelSenha.setBounds(150,280,150,30);

        // Digitar senha
        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(100, 310, 150, 30);

        //cria botão e define tamanho
        JButton botaoLogar = new JButton("Login");
        botaoLogar.setBounds(100, 360, 150, 30);
        // para definir o que acontece ao clicar no botão
        // dentro do parenteses há uma clase que implementa ActionListener
        botaoLogar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String senha = new String(campoSenha.getPassword());
                System.out.printf("Usuario: %s \nSenha: %s", usuario, senha);
                campoUsuario.setText("");
                campoSenha.setText("");
            }

        });
        
        // adiciona o botão, label, campo de digitar na janela
        janela.add(botaoLogar);
        janela.add(labelUsuario);
        janela.add(campoUsuario);
        //janela.add(campoLinhas);
        janela.add(campoSenha);
        janela.add(labelSenha);

        // Isso tira o layout automatico definido na janela permitindo que ele seja definido manualmente
        // a cada item adicionado, cada utem terá que ter se tamanho definido obrigatoriamente
        janela.setLayout(null);

        // encerrar ao fechar, representa o inteiro 3
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

    }
}
