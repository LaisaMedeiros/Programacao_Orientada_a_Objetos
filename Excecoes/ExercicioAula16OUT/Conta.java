package Excecoes.ExercicioAula16OUT;

import java.util.ArrayList;

public class Conta {
    private int saldo;
    private int identificador;
    private static final double VALOR_MAXIMO = 1000.0;
    private static final double VALOR_MINIMO = 0.0;
    ArrayList<Integer> historico = new ArrayList<>();

    public Conta(int identificador) {
        this.identificador = identificador;
    }

    //método depósito que lança a exceção ValorMaximoAtingido
    // Como usa throws na assinatura do método, quem o chama é obrigado a tratar a execção
    // método checked (verificada) - precisa de throws 
    public boolean deposito(int valor) throws ValorMaximoAtingido {
        if (valor < 0){
            throw new IllegalArgumentException("Valor de depósito inválido");
        }
        if (saldo + valor > VALOR_MAXIMO){
            // ao usar o throw, a execução do método é interrompida e o controle é passado para o bloco catch na main
            throw new ValorMaximoAtingido(); 
        }
        this.saldo += valor;
        return true;   
    }

    //método unchecked (não verificada) - não precisa de throws
    public boolean retirada(int valor){
        if (valor < 0){
            throw new IllegalArgumentException("Valor de retirada inválido");
        }
        if (saldo - valor < VALOR_MINIMO){
            historico.add(valor);
            throw new SaldoMinimoAtingido();
        } 
        this.saldo -= valor;
        return true;
        
    }

    // esse método faz uma transferência entre contas
    //pode lançar as duas exceções
    public boolean transferencia(Conta destino, int valor) throws ValorMaximoAtingido {
        if (valor < 0){
            throw new IllegalArgumentException("Valor de transferência inválido");
        }
        if (this.saldo - valor < VALOR_MINIMO){
            historico.add(valor);
            throw new SaldoMinimoAtingido();
        }
        this.saldo -= valor; // retira da conta origem
        destino.saldo += valor; // deposita na conta destino

        //Se ao depositar na conta destino o valor máximo for atingido, lança a exceção e desfaz a operação
        if (destino.saldo > VALOR_MAXIMO){
            // desfaz a operação
            this.saldo += valor;
            destino.saldo -= valor;
            throw new ValorMaximoAtingido();
        }
        return true;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getIdentificador() {
        return identificador;
    }

    // Método para encontrar uma conta pelo seu identificador em uma lista de contas
    public static Conta encontrarContaPorId(ArrayList<Conta> contas, int id) {
        for (Conta conta : contas) {
            if (conta.getIdentificador() == id) {
                return conta;
            }
        }
        return null; // Retorna null se a conta não for encontrada
    }

}
