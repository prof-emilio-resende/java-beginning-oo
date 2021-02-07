package fit;

public class Airplane {
  private int speed;

  public Airplane() {
    this.speed = 300;
  }

  protected void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getSpeed() {
    return speed;
  }
}