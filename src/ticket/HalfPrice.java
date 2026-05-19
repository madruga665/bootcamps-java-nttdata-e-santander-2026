package ticket;

public class HalfPrice extends Ticket {

  public HalfPrice(double price, String movieName, AudioType audioType) {
    super(price, movieName, audioType);
  }

  @Override
  public double getPrice() {
    return super.getPrice() / 2;
  }
}
