package module3;

public class Burger {
  String ingredient;

  public void setIngredient(String ingredient) {
    this.ingredient = ingredient;
  }

  public void showBurger() {
    if (ingredient != null) {
      System.out.println("Бургер с " + ingredient);
    } else {
      System.out.println("Бургер без добавок");
    }
  }
}
