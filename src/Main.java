import BankAccount.BankAccountMenu;
import Petshop.PetMachineMenu;

import java.util.Scanner;

public class Main {
  private final static Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
  private final static PetMachineMenu petMachineMenu = new PetMachineMenu();
  private final static BankAccountMenu bankAccountMenu = new BankAccountMenu();

  static void main(String[] args) {
    var option = -1;

    do {
      System.out.println("**** Escolha um dos apps ****");
      System.out.println("1 - Pet Machine");
      System.out.println("2 - Bank Account");
      option = scanner.nextInt();

      switch (option) {
        case 1 -> petMachineMenu.menu();
        case 2 -> bankAccountMenu.menu();
        case 0 -> System.exit(0);
        default -> System.out.println("Opção inválida");
      }
    } while (true);
  }
}