package fundamentals;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

  public static void main() {
    Scanner scanner = new Scanner(System.in);
    int currentYear = LocalDate.now().getYear();

    System.out.println("==== Digite seu nome ====");
    String name = scanner.next();

    System.out.println("==== Digite o ano do seu nascimento ====");
    int yearOfBirth = scanner.nextInt();
    int age = currentYear - yearOfBirth;
    boolean canDrive = age >= 18;

    if (canDrive) {
      System.out.printf("Olá %s, tudo certo? você tem %s anos e já pode dirigir", name, age);

      return;
    }

    System.out.printf("Olá %s, tudo certo? você ainda é menor de idade e não pode dirigir", name);
  }
}
