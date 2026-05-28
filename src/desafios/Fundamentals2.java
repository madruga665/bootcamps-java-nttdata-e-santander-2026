package desafios;

import java.util.Scanner;

public class Fundamentals2 {
  static void main() {
    Scanner scanner = new Scanner(System.in);

    // Lê a linha de entrada e separa em nome e tipo de conta
    String input = scanner.nextLine();
    String[] partes = input.split(" ");
    String nome = partes[0];
    String tipoConta = partes[1];

    // Verifique se o tipo de conta é válido ("corrente", "poupança" ou "investimento")
    // e imprima a mensagem de saudação personalizada ou a mensagem de erro conforme o caso.

    switch (tipoConta) {
      case "corrente", "poupança", "investimento" -> System.out.printf("Bem-vindo(a), %s! Sua conta %s esta pronta para uso.", nome, tipoConta);
      default -> System.out.println("Tipo de conta invalido.");
    }

    scanner.close();
  }
}
