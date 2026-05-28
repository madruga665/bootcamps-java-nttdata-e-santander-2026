package tabuada;

import java.util.Scanner;

public class Main {

  static void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o número que da tabuada que você deseja");
    int number = scanner.nextInt();

    for (int index = 0; index <= 10; index++) {
      int result = number * index;
      System.out.println(number + " x " + index + " = " + result);
    }
  }
}
