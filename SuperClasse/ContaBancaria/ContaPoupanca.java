package SuperClasse.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    //Sobrescrevendo o método sacar
    @Override
    public void sacar(double valor) {
        double taxaSaque = 0.5; // Taxa fixa de R$0,50 para saques
        double valorTotal = valor + taxaSaque;

        if (valorTotal <= saldo) {
            super.sacar(valorTotal);
            System.out.println("Taxa de R$" + taxa + " aplicada.");
        } else {
            System.out.println("Saldo insuficiente para saque e taxa.");
        }
    }
}
