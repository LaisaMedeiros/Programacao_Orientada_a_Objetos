package Excecoes.OutrosExercicios.Exercicio5;

public class TestaConta {
    public static void main(String[] args) {
        // cria um objeto do tipo ContaBancaria
        ContaBancaria conta = new ContaBancaria(300, 200);

        // como os métodos sacar e depositar lançam exceções usando throws, é necessário tratá-las
        try {
            System.out.println("Saldo inicial: " + conta.getSaldo());
            conta.sacar(600);
            System.out.println("Saque realizado com sucesso.");
        } catch (ContaException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }

        try {
            conta.depositar(1500);
            System.out.println("Depósito realizado com sucesso.");
        } catch (ContaException e) {
            System.out.println("Erro ao depositar: " + e.getMessage());
        }
    }
}
