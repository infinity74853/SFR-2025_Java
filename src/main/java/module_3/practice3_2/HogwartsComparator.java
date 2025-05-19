package module_3.practice3_2;

public class HogwartsComparator {
  public static void compare(Hogwarts a, Hogwarts b) {
    int aPower = a.getMagicPower() + a.getTransgressionDistance();
    int bPower = b.getMagicPower() + b.getTransgressionDistance();

    System.out.println(aPower > bPower ?
        a.getName() + " обладает большей мощностью магии" :
        b.getName() + " обладает большей мощностью магии");
  }
}
