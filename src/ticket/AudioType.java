package ticket;

public enum AudioType {
  DUBLADO("Dublado"),
  LEGENDADO("Legendado");

  private final String description;

  AudioType(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}