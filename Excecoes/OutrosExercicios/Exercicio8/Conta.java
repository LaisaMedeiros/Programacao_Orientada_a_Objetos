package Excecoes.OutrosExercicios.Exercicio8;

public class Conta {
    private int id;
    private float saldo; // ← Inicializado automaticamente com 0.0f

    public Conta(int id) {
        this.id = id;
        this.saldo = 0;
    }

    public boolean deposito(float valor) throws SaldoMaximoAtingido {
        if (this.saldo + valor > 1000.0f){
            throw new SaldoMaximoAtingido("Saldo maximo atingido apos deposito.");
        }
        this.saldo += valor;
        return true;
    }

    public boolean retirada(float valor){
        if (this.saldo - valor < 0){
            Main.historicoExcecoes.add(valor);
            throw new SaldoNegativo("Saldo insuficiente para retirada.");
        }
        this.saldo -= valor;
        return true;
    }

    public boolean transferencia(Conta conta1, float valor) throws SaldoMaximoAtingido {
        if (this.saldo - valor < 0){
            throw new SaldoNegativo("Saldo insuficiente para transferencia.");
        }
        this.saldo -= valor;
        if (conta1.getSaldo() + valor > 1000.0f){
            throw new SaldoMaximoAtingido("Saldo maximo atingido na conta destino.");
        }
        conta1.deposito(valor);
        return true;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    
}
