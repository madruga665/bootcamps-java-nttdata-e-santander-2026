package ticket;

public abstract class Ticket {
  private final double price;
  private final String movieName;
  private final AudioType audioType;

  public Ticket(double price, String movieName, AudioType audioType) {
    this.price = price;
    this.movieName = movieName;
    this.audioType = audioType;
  }

  public double getPrice() {
    return price;
  }

  public String getMovieName() {
    return movieName;
  }

  public AudioType getAudioType() {
    return audioType;
  }
}
