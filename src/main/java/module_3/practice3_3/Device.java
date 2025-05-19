package module_3.practice3_3;

public abstract class Device {
  private String deviceId;
  private boolean isOn;

  public abstract void turnOn();
  public abstract void turnOff();

  public String getStatus() {
    return isOn ? "ON" : "OFF";
  }
}

