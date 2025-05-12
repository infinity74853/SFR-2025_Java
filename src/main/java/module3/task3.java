package module3;

public class task3 {
  public static void main(String[] args) {
    Burger burger1 = new Burger();
    burger1.showBurger(); // Бургер без добавок

    Burger burger2 = new Burger();
    burger2.setIngredient("сыром");
    burger2.showBurger(); // Бургер с сыром
  }
}
