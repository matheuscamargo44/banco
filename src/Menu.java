
import model.Conta;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Menu {
    Scanner scanner = new Scanner(System.in);
    Banco banco = new Banco();

    public void menu(List<Conta> contas) {

        for(Conta conta : contas){
            banco.adicionarConta(conta);
        }

        System.out.println("Bem-vindo ao sistema bancário!");
        System.out.println("Por favor, informe o número da conta:");
        String numeroConta = scanner.nextLine();
        System.out.println("Por favor, informe a sua senha: ");
        String senhaInformada = scanner.nextLine();

        Scanner.nextLine();
        Conta contaLogada = banco.autenticar(numeroConta, senhaInformada);

        if(contaLogada == null){
            System.out.println("Autenticação falhou");
            return;
        }


        while(true){

            System.out.println("[1] - Consultar saldo");
            System.out.println("[2] - Depositar");
            System.out.println("[3] - Sacar");
            System.out.println("[0] - Sair");
            System.out.println("Escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch(escolha){
                case 1:
                    System.out.println("Saldo $: " + contaLogada.getSaldo());
                    break;
                case 2:
                    System.out.println("Valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    contaLogada.depositar(valorDeposito);
                    System.out.println("Depósito realizado com sucesso");
                    break;
                case 3:
                    System.out.println("Valor que deseja sacar: ");
                    double valorSaque = scanner.nextDouble();
                    boolean sucesso = contaLogada.sacar(valorSaque);
                    System.out.println(sucesso ? "Saque realizado!" : "Falha no saque!");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção Inválida");
            }

        }
    }
}
