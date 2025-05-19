package module_3.practice3_3;

public class Light extends Device implements Controllable {
  @Override
  public void turnOn() {
    System.out.println("Свет включен");
  }

  @Override
  public void turnOff() {
    System.out.println("Свет выключен");
  }

  @Override
  public void controlDevice() {
    System.out.println("Управление яркостью света");
  }
}
