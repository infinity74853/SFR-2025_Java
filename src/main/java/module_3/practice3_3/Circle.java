package module_3.practice3_3;

public class Circle implements Shape, Resizable {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public double calculatePerimeter() {
    return 2 * Math.PI * radius;
  }

  @Override
  public void resize(int percent) {
    radius *= (1 + percent / 100.0);
  }
}
