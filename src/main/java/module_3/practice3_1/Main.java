/**
 Создание собственного класса.
 Задание 1.
 a)	Создайте класс Burger.
 b)	Создайте в классе поле ingridient.
 c)	Реализуйте в классе метод, принимающий 1 аргумент и инициализирующий поле ingridient.
 d)	Реализуйте метод showBurger, выводящий в терминал «Бургер с
 e)	{Добавкой}» в случае наличия ingridient или выводящий «Бургер без добавок», в случае если ingridient не инициализирован.
 f)	В классе Main напишите реализацию класса Burger.
 Пример реализации класса Burger:
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
 Задание 2.
 a)	Создайте класс Calculator.
 b)	Реализуйте у класса методы add (сумма), minus (разность),
 c)	multiplication (перемножение), division (деление).
 d)	Методы должны принимать по два параметра и реализовывать
 e)	арифметическое действие в соответствии с названием.
 f)	Напишите программу, использующую данный класс для демонстрации работы калькулятора.
 Задание 3.
 a)	Создайте класс Person.
 b)	Создайте в классе 4 поля: Фамилия, Имя, Отчество, Дата рождения.
 c)	Создайте метод, принимающий 4 параметра и инициализирующий поля.
 d)	Создайте 4 отдельных метода, позволяющих изменять каждое поле по отдельности. Указанные методы должны принимать по 1аргументу.
 e)	Создайте 4 отдельных метода, позволяющих получать значение каждого отдельного поля.
 f)	Создайте класс PersonList. Данный класс должен содержать поле список persList типа Person.
 g)	Создайте в классе метод adperson, принимающий объект Person и добавляющий его в список persList.
 h)	Создайте метод delPerson, принимающий в качестве аргумента имя персоны и удаляющий из списка persList все записи, содержащие указанное имя.
 i)	Создайте метод showPersonList, выводящий в терминал всех Person, содержащихся в PersonList.
 j)	В классе Main напишите реализацию класса PersonList

 Задание 4.
 a)	Разработать класс для хранения данных Music, объект которого будет хранить название (тип String), исполнителя (типа String), рейтинг (тип int), длительность трека (int), жанр (String)
 b)	У Music должен быть конструктор, принимающий все параметры. Рейтинг автоматически выставляется как 1.
 c)	Создать класс Main, в нём main и продемонстрировать работоспособность.

 Задание 5.
 a)	Разработать самодостаточный класс Playlist, объекты которого (плейлисты) будут хранить в себе список класса Music.
 b)	В каждый список можно добавить объект класса Music. Удалить песню по названию. Вывести количество треков. Вывести треки определенного жанра.
 c)	Создать класс Main, в нём main и продемонстрировать работоспособность.

 Задание 6.
 a)	Разработать утилитарный класс MusicPlayer, который принимает в себя объект класса Playlist. Класс выводит в консоль c помощью цикла каждый трек в формате:
 b)	«Сейчас играет трек с названием [название трека] исполнитель [исполнитель] жанр [жанр] длительность [длительность]»
 c)	Создать класс Main, в нём main и продемонстрировать работоспособность.

 */

package module_3.practice3_1;

public class Main {
  public static void main(String[] args) {
    // Задание 1
    System.out.println("=== Задание 1 ===");
    Burger burger = new Burger();
    burger.showBurger();
    burger.setIngredient("сыром");
    burger.showBurger();

    // Задание 2
    System.out.println("\n=== Задание 2 ===");
    Calculator calc = new Calculator();
    System.out.println("5 + 3 = " + calc.add(5, 3));
    System.out.println("5 - 3 = " + calc.minus(5, 3));
    System.out.println("5 * 3 = " + calc.multiplication(5, 3));
    System.out.println("5 / 3 = " + calc.division(5, 3));

    // Задание 3
    System.out.println("\n=== Задание 3 ===");
    PersonList personList = new PersonList();
    personList.addPerson(new Person("Иванов", "Иван", "Иванович", "1990-01-01"));
    personList.addPerson(new Person("Петров", "Петр", "Петрович", "1995-05-05"));
    System.out.println("Все люди:");
    personList.showPersonList();
    personList.delPerson("Иван");
    System.out.println("\nПосле удаления:");
    personList.showPersonList();

    // Задание 4
    System.out.println("\n=== Задание 4 ===");
    Music song1 = new Music("Bohemian Rhapsody", "Queen", 354, "Rock");
    Music song2 = new Music("Shape of You", "Ed Sheeran", 234, "Pop");
    System.out.println(song1);
    System.out.println(song2);

    // Задание 5
    System.out.println("\n=== Задание 5 ===");
    Playlist myPlaylist = new Playlist();
    myPlaylist.addMusic(song1);
    myPlaylist.addMusic(song2);
    System.out.println("Всего треков: " + myPlaylist.getTrackCount());
    System.out.println("\nРок-треки:");
    myPlaylist.printTracksByGenre("Rock");

    // Задание 6
    System.out.println("\n=== Задание 6 ===");
    MusicPlayer player = new MusicPlayer();
    player.playPlaylist(myPlaylist);
  }
}
