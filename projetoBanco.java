import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int valorDaConta = 3600;
    String nomeDoCliente = "João";
    String tipoDeConta = "Corrente";
    System.out.println("************");
    System.out.println("\nNome do cliente: " + nomeDoCliente);
    System.out.println("Tipo de conta: " + tipoDeConta);
    System.out.println("Valor da conta: " + valorDaConta);
    System.out.println("\n************");
    Scanner scanner = new Scanner(System.in);
    System.out.println(
        "1 - Consultar Saldo\n" +
            "2 - Receber Valor\n" +
            "3 - Transferir Valor\n" +
            "4 - Sair\n");
    int switchCase = 0;
    do {
      int opcao = scanner.nextInt();
      switch (opcao) {
        case 1:
          System.out.println(String.format("Saldo: %d", valorDaConta));
          break;
        case 2:
          System.out.println("Digite o valor a ser recebido: ");
          int valorRecebido = scanner.nextInt();
          valorDaConta += valorRecebido;
          System.out.println("Valor recebido com sucesso");
          break;
        case 3:
          System.out.println("Digite o valor a ser transferido: ");
          int valorTransferido = scanner.nextInt();
          if (valorTransferido > valorDaConta) {
            System.out.println("Não e possível transferir esse valor");
            break;
          } else {
            valorDaConta -= valorTransferido;
            System.out.println("Valor foi transferido com sucesso");
          }
          break;
        case 4:
          System.out.println("Saindo do sistema");
          switchCase = 4;
          break;
        default:
          System.out.println("Não existe essa opção");
          break;
      }
    } while (switchCase != 4);
    scanner.close();
  }
}
