package Excecoes.ExercicioAula16OUT_MITRE;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    // para n passar como argumento
    private static ArrayList<Conta> contas = new ArrayList<Conta>();

    public static void main (String[] args) {

        Scanner scan1 = new Scanner (System.in);
        String menu = "1 - criar conta"+
                    "2 - depositar \n"+
                    "3 - retirar \n"+
                    "4 - transferir \n"+
                    "7 - imprimir saldo \n"+
                    "8 - historico \n"+
                    "9 - sair \n"; 

        int choice = 0;
        int id1 = 0, id2 = 0, valor = 0;
        Conta conta1, conta2;

        //É tratado no catch do while abaixo
        private static int lerTeclado (String msg) throws Exception {
            System.out.println(msg);
            return scan1.nextInt();
        }

        while (choice != 9){
            try{
                System.out.println(menu);
                if (choice < 10) //Para evitar eletura do choice, A=PARECE ESTAR ERRADO COLOCAR ISSO AQUI
                choice = scan1.nextInt();
                switch (choice){
                    case 1: // criar conta
                        id1 = lerTeclado("Digite o ID da nova conta:");
                        conta1 = new Conta(id1);
                        break;
                    case 2: // depositar
                        id1 = lerTeclado("Digite o ID da conta para depositar:");
                        valor = lerTeclado("Digite o valor a depositar:");
                        break;
                    case 3:

                    case 4:
                        id1 = lerTeclado("Digite o ID da conta para retirar:");
                        id2 = lerTeclado("Digite o ID da conta destino:");
                        valor = lerTeclado("Digite o valor a transferir:");
                        break;
                    case 7: //imprimir saldo
                    case 8: //historico
                    case 9: //MOSTRAR MENSAGEM DE SAIDA
                    case 12:
                        conta1 = getConta(id1);
                        conta1.deposito(valor);
                        break;
                    case 13:

                    case 14:
                        conta1 = getConta(id1);
                        conta2 = getConta(id2);
                        conta1.retirada(valor);
                        try {
                            conta2.deposito(valor);
                        } catch (SaldoAltoException e){
                            // estorna a retirada
                            conta1.deposito(valor);
                            System.out.println("Transferência não realizada. Saldo alto na conta destino.");
                        }
                        break;
                }
            //Ocorre quando o usuario tenta fazer uma transação com valor negativo
            } catch (IllegalArgumentException e){
                int decisao = 0;
                try {
                    decisao = lerTeclado("Valor inválido. Digite 1 para tentar novamente ou 2 para voltar ao menu:");
                } catch (Exception ex){
                }
                if (decisao == 1){
                    valor *= -1;
                    choice +=  10;
                }
            } catch (Exception e){
                System.out.print("Uma inconsistência ocorreu e a transação não fo realizada");
            } finally {
                id1 = -1;
                scan1.nextLine();
            }

            }
        }

        public static Conta getConta (int id)  {
            for (Conta c : contas) {
                if (c.getId() == id) {
                    return c;
                }
            }
            return null;
    }
}
