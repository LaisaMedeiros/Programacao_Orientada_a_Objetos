package Excecoes.OutrosExercicios.Exercicio5;

public class ContaBancaria {
    private double saldo; // Determina o saldo da conta.
    private double limite; // Determina o limite de crédito do cheque especial.

    public ContaBancaria(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }
    public double getLimite() {
        return limite;
    }
    public double getSaldoComLimite(){
        return saldo + limite;  
    }
    public boolean sacar (double valor) throws ContaException {
        if (valor > 500) {
            throw new ContaException("Valor de saque inválido.");
        }
        if (getSaldoComLimite() - valor < 0) {
            throw new ContaException("Saldo insuficiente para saque.");
        }
        saldo -= valor;
        return true;
    }

    public void depositar (double valor) throws ContaException {
        if (valor > 1000){
            throw new ContaException("Valor de depósito inválido.");
        }
    }
}
