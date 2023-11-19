package org.contabanco;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
      contabanco conta = new contabanco();
      Scanner input = new Scanner(System.in);

      System.out.println("Por favor, digite o nome do cliente");
      conta.setNomeCliente(input.nextLine());

      System.out.println("Por favor, digite o número da agência");
      conta.setAgencia(input.nextLine());

      System.out.println("Por favor, digite o número da conta");
      conta.setNumeroConta(input.nextInt());

      System.out.println("Por favor, digite o saldo da conta");
      conta.setSaldo(input.nextDouble());

      System.out.println(conta.toString());

      input.close();
    }
}
