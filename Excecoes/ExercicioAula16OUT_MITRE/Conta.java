package Excecoes.ExercicioAula16OUT_MITRE;

public class Conta {
    private static int SALDO_MAX = 1000;
    private static int SALDO_MIN = 0;
    private int id;
    private int saldo;

    public Conta (int id) {
        this.id = id;
        this.saldo = 0; //REDUNDANTE NÃO PRECISA
    }

    public int getId() {
        return id;
    }

    // só entra SaldoAltoException na assinatura pq IllegalArgumentExcpetion é unchecked
    public void deposito (int valor) throws SaldoAltoException {
        if (valor < SALDO_MIN) {
            //TÁ ERRADO?
            throw new IllegalArgumentException();
        }
        if (this.saldo + valor > SALDO_MAX) {
            throw new SaldoAltoException();
        }
        this.saldo += valor;
    }

    public void retirada (int valor ){
        if (valor <0){
            throw new IllegalArgumentException();
        }
        if (this.saldo - valor < SALDO_MIN){
            throw new SaldoBaixoException(this.id, valor);   
        }
        this.saldo -= valor;
    }

    @Override
    public String toString() {
        return "\nConta:" + this.id + " "+this.saldo;
    }


}

