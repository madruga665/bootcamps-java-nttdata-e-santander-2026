package bankAccount;

public class BankAccount {
  private double balance;
  private double specialLimit;
  private boolean hasAccount = false;

  public BankAccount(float balance) {
    this.balance = balance;
  }

  private double specialLimitTax() {
    var usedSpecialLimit = Math.abs(balance) - specialLimit;

    return (usedSpecialLimit / 100) * 20;
  }

  public void deposit(double amount) {
    var tax = specialLimitTax();

    if (balance < 0 ) {
      balance += amount - tax;
    } else {

    balance += amount;
    }
  }

  public void withdraw(float amount) {
    balance -= amount;
  }

  public double getBalance() {
    return balance;
  }

  public double getSpecialLimit() {
    if (balance < 0) {
      return specialLimit + balance;
    } else {
    return specialLimit;
    }
  }

  public boolean isHasAccount() {
    return hasAccount;
  }

  public void setHasAccount(boolean hasAccount) {
    this.hasAccount = hasAccount;
  }

  public void setSpecialLimit(float specialLimit) {
    this.specialLimit = specialLimit;
  }
}
