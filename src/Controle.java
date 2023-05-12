import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {

        Scanner opcao = new Scanner(System.in);

        String nome = "Mario Prado";
        int agencia = 1234;
        int numConta = 11111;
        double saldo = 1950.50;
        String tipoDaConta = "Conta Corrente";

        System.out.println("MARIO BANK");
        System.out.println("Cliente: " + nome);
        System.out.println("Agencia: " + agencia);
        System.out.println("Número da conta: " + numConta);
        System.out.println("Tipo de conta: " + tipoDaConta);

        int opcaoMenu = -1;

        while (opcaoMenu != 0) {
            System.out.println("Digite a opção desejada");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("0 - Sair");
            int opcaoDigitada = opcao.nextInt();

            switch (opcaoDigitada) {
                case 1 -> System.out.println("Saldo atual: " + saldo);
                case 2 -> {
                    System.out.println("Digite o valor do depósito");
                    double valorDoDeposito = opcao.nextDouble();
                    saldo += valorDoDeposito;
                    System.out.println("Saldo atualizado: R$" + saldo);
                }
                case 3 -> {
                    System.out.println("Digite o valor do saque");
                    double valorDoSaque = opcao.nextDouble();
                    if (valorDoSaque <= saldo) {
                        saldo -= valorDoSaque;
                        System.out.println("Saldo atualizado: R$" + saldo);
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                }
                case 4 -> {
                    System.out.println("Digite o valor da transferência:");
                    double valorDaTransferencia = opcao.nextDouble();
                    if (valorDaTransferencia <= saldo) {
                        saldo -= valorDaTransferencia;
                        System.out.println("Saldo atualizado: R$" + saldo);
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                }
                case 0 -> opcaoMenu = 0;
                default -> System.out.println("Opção inválida");
            }
        }
    }
}
