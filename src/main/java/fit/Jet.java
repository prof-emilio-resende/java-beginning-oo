package fit;

public class Jet extends Airplane {
  private int multiplier;

  public Jet() {
    super();
    this.multiplier = 2;
  }

  public int accelerate() {

    int newSpeed = this.getSpeed() * this.multiplier;
    this.setSpeed(newSpeed);

    return newSpeed;
  }

}
