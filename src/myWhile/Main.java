package myWhile;

import java.util.Scanner;

public class Main {

  static void main() {
    Scanner scanner = new Scanner(System.in);
    String name = "";

    while (!name.equals("exit")) {
      System.out.println("==== Digite seu nome ====");
      name = scanner.next();
    }
  }
}
