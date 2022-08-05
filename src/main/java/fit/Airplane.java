package fit;

public class Airplane {
  private int speed;

  public Airplane() {
    System.out.println("Iniciando a construção de Airplane...");
    this.speed = 300;
  }

  public Airplane(int speed) {
    System.out.println(String.format("Iniciando a construção de Airplane com velocidade: %d...", speed));
    this.speed = speed;
  }

  protected void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getSpeed() {
    System.out.println("Obtendo valor de velocidade...");
    return speed;
  }
}