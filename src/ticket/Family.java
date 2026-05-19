package ticket;

public class Family extends Ticket {
  private final int membersQuantity;

  public Family(double price, String movieName, AudioType audioType, int membersQuantity) {
    super(price, movieName, audioType);
    this.membersQuantity = membersQuantity;
  }

  private double calculateDiscount(double amount) {
    return (amount / 100) * 5;
  }

  @Override
  public double getPrice() {
    double totalPrice = super.getPrice() * membersQuantity;

    if (membersQuantity > 3) {
      return calculateDiscount(totalPrice);
    }

    return totalPrice;
  }
}
