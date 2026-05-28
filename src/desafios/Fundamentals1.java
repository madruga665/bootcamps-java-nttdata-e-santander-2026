package desafios;

import java.util.Scanner;

public class Fundamentals1 {
  static void main() {
    Scanner scanner = new Scanner(System.in);
    int saldo = scanner.nextInt();
    int valorTransacao = scanner.nextInt();

    if (saldo >= valorTransacao) {
      System.out.println("Transação aprovada");

      return;
    }

    System.out.println("saldo insuficiente");
    scanner.close();
  }
}
