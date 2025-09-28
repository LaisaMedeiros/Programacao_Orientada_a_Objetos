package SuperClasse.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaCorrente = new ContaBancaria(1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca(1000);

        System.out.println("Saldo inicial da Conta Corrente: R$" + contaCorrente.getSaldo());
        System.out.println("Saldo inicial da Conta Poupança: R$" + contaPoupanca.getSaldo());

        System.out.println("\nTentando sacar R$200 da Conta Corrente:");
        contaCorrente.sacar(200);
        System.out.println("Saldo atual da Conta Corrente: R$" + contaCorrente.getSaldo());

        System.out.println("\nTentando sacar R$200 da Conta Poupança:");
        contaPoupanca.sacar(200);
        System.out.println("Saldo atual da Conta Poupança: R$" + contaPoupanca.getSaldo());

        System.out.println("\nTentando sacar R$900 da Conta Poupança:");
        contaPoupanca.sacar(900);
        System.out.println("Saldo atual da Conta Poupança: R$" + contaPoupanca.getSaldo());
    }
}
