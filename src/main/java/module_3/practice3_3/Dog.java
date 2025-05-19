package module_3.practice3_3;

public class Dog extends Animal {
  @Override
  public void makeSound() {
    System.out.println("Гав!");
  }

  @Override
  public void move() {
    System.out.println("Собака бежит");
  }
}
