public class Principal {
    public static void main(String[] args) {
        System.out.println("Exemplo 1");

        // Cria um objeto do tipo Agencia com número 1
        //Usa o construct de Agencia, o número da Agencia é 1
        Agencia a1 = new Agencia(1);

        // Cria duas contas dentro da agência a1
        a1.criaConta(101, 1000.00); // conta com número 101 e saldo 1000
        a1.criaConta(102, 90.00);   // conta com número 102 e saldo 90

        // Busca a conta de número 101 dentro da agência
        // Cria um  objeto para salvar a conta encontrada
        Conta c1 = a1.getConta(101);

        // Verifica se a conta foi encontrada
        if (c1 != null) {
            // Mostra informações da conta usando o toString()
            System.out.println("Conta encontrada: " + c1);

            // Deposita 50 reais na conta
            c1.depositar(50.0);

            // Mostra o saldo atualizado
            System.out.println("Saldo após depósito: " + c1.getSaldo());
        } else {
            // Caso a conta 101 não exista, exibe mensagem de erro
            System.out.println("Conta 101 não encontrada");
        }

        // Cria uma nova agência separada (número 2)
        Agencia a2 = new Agencia(2);
        // Aqui você poderia criar contas em a2 sem interferir em a1
    }
}
