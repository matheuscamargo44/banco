
import model.Conta;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Menu {
    Scanner scanner = new Scanner(System.in);
    Banco banco = new Banco();
    public void menu(List<Conta> contas) {

        System.out.println("Bem-vindo ao sistema bancário!");
        System.out.println("Por favor, informe o número da conta:");
        String contaInformada = scanner.nextInt();
        System.out.println("Por favor, informe a sua senha: ");
        String senhaInformada = scanner.nextLine();

        Scanner.nextLine();
        Conta contaLogada = banco.autenticar(contaInformada, senhaInformada);
        while(true){

            System.out.println("[1] - Consultar saldo");
            System.out.println("[2] - Depositar");
            System.out.println("[3] - Sacar");
            System.out.println("[0] - Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch(escolha){
                case 1:
                    contaLogada.getSaldo();
                    break;
                case 2:
                    contaLogada.depositar(double valor);
                    break;
                case 3:
                    contaLogada.sacar();
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
