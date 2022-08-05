package fit;

public class Jet extends Airplane {
  private int multiplier;

  public Jet() {
    super();
    System.out.println("Inicializando classe Jet...");
    this.multiplier = 2;
  }

  public Jet(int multiplier) {
    super();
    System.out.println(String.format("Inicializando class Jet com o parametro %d...", multiplier));
    this.multiplier = multiplier;
  }

  public Jet(int multiplier, int speed) {
    super(speed);
    System.out.println(String.format("Inicializando class Jet com os parametros %d %d...", speed, multiplier));
    this.multiplier = multiplier;
  }

  @Override
  public int getSpeed() {
    System.out.println("Comportamento especial para Jet...");
    return super.getSpeed();
  }

  public int accelerate() {

    int newSpeed = this.getSpeed() * this.multiplier;
    this.setSpeed(newSpeed);

    return newSpeed;
  }

}
