package petshop;

public class Pet {
  private final String name;
  private boolean clean;

  public Pet(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public boolean getClean() {
    return clean;
  }

  public void setClean(boolean clean) {
    this.clean = clean;
  }

  public boolean isClean() {
    return this.clean;
  }
}
