package Provas.P1_252.Questao2;

import java.util.ArrayList;

public class Jogador {
    private static ArrayList <Integer> ListaNum = new ArrayList<Integer>();
    private static ArrayList <Jogador> Jogadores = new ArrayList<Jogador>();

    private int numero;

    public Jogador (int num){
        // Ao instanciar deve verificar se existe um jogador na lista que já tem esse numero
        for (Jogador obj:Jogadores){
            // seja já existe uma pessoa com o número na lista de jagadores
            if(obj.getNumero() == num){
                // muda o numero do objeto q ja ta na lista
                obj.setNumero(encontraProximoDiponivel());
            }
        }
        this.numero = num;
        Jogadores.add(this);
    }

    public int encontraProximoDiponivel(){
        int valorQualquer = 1;
        // Enquanto o candidato já estiver na lista, incrementa
        while (ListaNum.contains(valorQualquer)) {
            valorQualquer++;
        }
        ListaNum.add(valorQualquer);
        return valorQualquer; // Retorna o primeiro não encontrado

    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int n){
        this.numero = n;
    }
}
