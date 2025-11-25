package Excecoes.OutrosExercicios.Exercicio8;
import java.util.*;
import java.util.Scanner;
public class Main {
    public static List<Float> historicoExcecoes = new ArrayList<>();
    public static List<Conta> contas = new ArrayList<>();

    // é um método statico pq é chamado no main que é statico
    public static Conta buscaConta(int id){
        for (Conta conta: contas){
            if (conta.getId() == id){
                return conta;
            }
        }
        return null;
    }

    // método principal
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o id da conta 1:");
        int id = scanner.nextInt();
        Conta conta1 = new Conta(id);
        contas.add(conta1);

        System.out.println("Insira o id da conta 2:");
        id = scanner.nextInt();
        Conta conta2 = new Conta(id);
        contas.add(conta2);

        System.out.println("Insira o id da conta 3:");
        id = scanner.nextInt();
        Conta conta3 = new Conta(id);
        contas.add(conta3);

        // a pessoa pode realizar quantas operações quiser até sair
        int opcao = 10;
        float valor;
        while (opcao !=0){
            System.out.println("Escolha uma das operações:"+
                            "1 - Depósito"+
                            "2 - Retirada"+
                            "3 - Transferência"+
                            "0 - sair");
            try {
                System.out.println("Insira a opção desejada:");
                opcao = scanner.nextInt();
                System.out.println("Insira o valor para despito:");
                valor = scanner.nextFloat();
                if (valor < 0){
                    throw new ValorNegativoException("Valor de depósito não pode ser negativo.");
                }
                System.out.println("Insira o id da conta que deseja operar:");
                int id_operacao = scanner.nextInt();
                Conta conta = buscaConta(id_operacao);
                if (conta == null){
                    System.out.println("Conta não existe. Operação cancelada.");
                    continue;
                }

                switch (opcao){
                    case 1:
                        conta.deposito(valor);
                        System.out.println("Depósito realizado com sucesso. Saldo atual: " + conta1.getSaldo());
                        break;
                    case 2:
                        conta.retirada(valor);
                        System.out.println("Retirada realizada com sucesso. Saldo atual: " + conta1.getSaldo());
                        break;
                    case 3:
                        // A ideia não é criar uma nova conta, mas usar uma conta já existe num array de contas
                        System.out.println("Insira o id da conta de destino:");
                        int id_destino = scanner.nextInt();
                        
                        //busca se o id da conta destino existe
                        Conta contaDestino = buscaConta(id_destino);
                        if (contaDestino == null){
                            System.out.println("Conta destino não existe. Operação cancelada.");
                            break;
                        }
                        
                        conta1.transferencia(contaDestino, valor);
                        System.out.println("Transferência realizada com sucesso. Saldo atual: " + conta1.getSaldo());
                        break;
                }
            } catch (SaldoMaximoAtingido e){
                System.out.println(e.getMessage());
                System.out.println("Insira um valor menor ou -1 para desistir da operação:");
                if (scanner.nextFloat() == -1){
                    System.out.println("Desistindo dessa operação.");
                    continue;
                } else {
                    ...
                }
            } catch (SaldoNegativo e){
                System.out.println(e.getMessage());
            } catch (ValorNegativoException e){
                System.out.println(e.getMessage());
                System.out.println("Podemos multiplicar o valor por -1 para torná-lo positivo. Deseja fazer isso? (1 - sim / 0 - não)");
                int resposta = scanner.nextInt();
                if (resposta == 1){
                    valor = (-1)*valor;
                    ...
                } else {
                    System.out.println("Desistindo dessa operação.");
                    continue;
                }
            } catch(IllegalArgumentException e){
                System.out.println("Entrada inválida. Tente novamente.");
                continue;
            }
            finally{
                System.out.println("Deseja continuar? (1 - sim / 0 - não)");
                if (scanner.nextInt() == 0){
                    break;
            }
        }
        scanner.close();
    }
    }
}
