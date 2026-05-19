package bankAccount;

import java.util.Scanner;

public class BankAccountMenu {
  private final static Scanner scanner = new Scanner(System.in);
  private final static BankAccount bankAccount = new BankAccount(0);

  private void getBalance() {
    var hasAccount = bankAccount.isHasAccount();
    var balance = bankAccount.getBalance();

    if (!hasAccount) {
      System.out.println("Você precisa criar uma conta para consultar o saldo");

      return;
    }

    System.out.println("Seu saldo é: R$" + balance);
  }

  private void getSpecialLimit() {
    var hasAccount = bankAccount.isHasAccount();
    var specialLimit = bankAccount.getSpecialLimit();

    if (!hasAccount) {
      System.out.println("Você precisa criar uma conta para consultar o seu limite especial");

      return;
    }

    System.out.println("Seu check especial é: R$" + specialLimit);
  }

  private void createBankAccount() {
    float amount = 0;
    while (amount == 0) {
      System.out.println("Você precisa abrir a conta com no minimo R$50, digite o valor a ser depositado");
      amount = scanner.nextFloat();

      if (amount < 50) {
        System.out.println("O valor minimo para abertura de conta é R$50");
        amount = 0;
      }
    }

    if (amount < 500) {
      bankAccount.setSpecialLimit(50);
    } else {
      float specialLimit = amount / 2;
      bankAccount.setSpecialLimit(specialLimit);
    }

    bankAccount.deposit(amount);
    bankAccount.setHasAccount(true);
  }

  public void deposit() {
    float amount = 0;
    while (amount == 0) {
      System.out.println("Você precisa digitar um valor maior que R$0");
      amount = scanner.nextFloat();
    }

    bankAccount.deposit(amount);
  }

  public void withdraw() {
    var balance = bankAccount.getBalance();
    var specialLimit = bankAccount.getSpecialLimit();
    var totalAmount = balance + specialLimit;
    float amount = 0;

    while (amount == 0) {
      System.out.println("Você precisa digitar um valor maior que R$0");
      amount = scanner.nextFloat();
    }

    var verifyOperation = totalAmount - amount;

    if (verifyOperation < 0) {
      System.out.println("Você não tem limite suficiênte para essa operação");

      return;
    }

    bankAccount.withdraw(amount);
  }

  public void payBill() {
    float amount = 0;
    while (amount == 0) {
      System.out.println("Digite o valor do boleto");
      amount = scanner.nextFloat();
    }

    bankAccount.withdraw(amount);
  }

  public void verifyIsUseSpecialLimit() {
    System.out.println(bankAccount.getBalance() < 0 ? "Você entrou no limite special" : "Você não esta usando o limite especial");
  }

  public void menu() {
    scanner.useDelimiter("\\n");
    var option = -1;

    System.out.println("**** Criar conta ****");
    createBankAccount();

    do {
      System.out.println("==== Escolha uma das opções ====");
      System.out.println("1 - Consultar saldo");
      System.out.println("2 - Consultar Limite especial");
      System.out.println("3 - Depositar dinheiro");
      System.out.println("4 - Sacar dinheiro");
      System.out.println("5 - Pagar boleto");
      System.out.println("6 - Verificar se a conta esta no limite especial");
      option = scanner.nextInt();

      switch (option) {
        case 1 -> getBalance();
        case 2 -> getSpecialLimit();
        case 3 -> deposit();
        case 4 -> withdraw();
        case 5 -> payBill();
        case 6 -> verifyIsUseSpecialLimit();
        case 0 -> System.exit(0);
        default -> System.out.println("Opção inválida");
      }
    } while (true);
  }
}
