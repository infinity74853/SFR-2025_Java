package module_3.practice3_2;

public class Gryffindor extends Hogwarts {
  private final int nobility;
  private final int honor;
  private final int bravery;

  public Gryffindor(String name, int magicPower, int transgressionDistance,
                    int nobility, int honor, int bravery) {
    super(name, magicPower, transgressionDistance);
    this.nobility = nobility;
    this.honor = honor;
    this.bravery = bravery;
  }

  public void compare(Gryffindor other) {
    int thisSum = nobility + honor + bravery;
    int otherSum = other.nobility + other.honor + other.bravery;

    System.out.println(thisSum > otherSum ?
        getName() + " лучший Гриффиндорец, чем " + other.getName() :
        other.getName() + " лучший Гриффиндорец, чем " + getName());
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Благородство: " + nobility);
    System.out.println("Честь: " + honor);
    System.out.println("Храбрость: " + bravery);
  }
}
