//Representa uma conta bancária. 
//Tem atributos (número, saldo) e métodos (pegar número, depositar, sacar etc.). 

public class Conta {
    private int num;
    private double saldo;

    //Construct
    public Conta(int num, double saldo) {
        this.num = num;
        this.saldo = saldo;
    }

    //Pega numero da conta que é privado
    public int getNum() {
        return num;
    }
  
    //Pega saldo da conta que é privado
    public double getSaldo() {
        return saldo;
    }

    //Método para depositar na conta
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }
    
    public boolean sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta[num=" + num + ", saldo=" + saldo + "]";
    }
}
