import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    double celsio, temp;
    System.out.println("Insira a temperatura em Celsios:");
    //criar o scanner para ser usado 
    Scanner scanner = new Scanner(System.in);
    celsio = scanner.nextDouble();
    //lembrar de fechar o scanner
    scanner.close();
    temp = ((celsio * 1.8) + 32);
    System.out.println("A temperatura " + celsio + "°C em Fahrenheit é: " + temp + "°F");
  }
}
