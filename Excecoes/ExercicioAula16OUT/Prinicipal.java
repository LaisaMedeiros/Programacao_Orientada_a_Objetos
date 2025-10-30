package Excecoes.ExercicioAula16OUT;

import java.util.ArrayList;
import java.util.Scanner;

public class Prinicipal {
    // é estático, pois o arraylist deve ser compartilhado entre todas as instâncias da classe
    private static ArrayList<Conta> contas = new ArrayList<>();
    
    public static void main (String[] args) {
        private static Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o id da conta:");
        int id = scanner.nextInt();
        Conta conta1 = new Conta(id);
        String msg = "0 - Sair\n" +
                     "1 - Depositar\n" +
                     "2 - Retirar\n" +
                     "3 - Transferir\n" +
                     "4 - Ver saldo\n";
        

        public int lerEntrada(){
            System.out.println(msg);
            if (scanner.nextInt()){
                throw new IllegalArgumentException("Entrada inválida");
            }
            return scanner.nextInt();
        }

        while (entrada != 0){
            try {
                }
                switch (entrada){
                    case 1:
                        conta1.deposito(valor);
                        System.out.println("Depósito realizado com sucesso!");
                        break;
                    case 2:
                        conta1.retirada(valor);
                        System.out.println("Retirada realizada com sucesso!");
                        break;
                    case 3:
                        System.out.println("Digite o identificador da conta destino: ");
                        int idDestino = scanner.nextInt();
                        Conta contaDestino = new Conta(idDestino);
                        System.out.println("Digite o valor a ser transferido: ");
                        int valorTransferencia = scanner.nextInt();
                        conta1.transferencia(contaDestino, valorTransferencia);
                        System.out.println("Transferência realizada com sucesso!");
                }
            } catch (ValorMaximoAtingido e) {
                System.out.println(e.getMessage());
                System.out.print("Digite um valor novo ou -1 para sair: ");
                int valor_novo = scanner.nextInt(); 
                if (valor_novo == -1){
                    break;
                } else {
                    // tentar depositar o novo valor
                }
            } catch (IllegalArgumentException e){

            }
        }
}

}
}
