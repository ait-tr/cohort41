/*
@date 05.02.2024
@author Sergey Bugaienko
*/


/*
Имя, цвет, возраст
мяукать, спать, бежать
 */
public class Cat {
    String name;
    String color;
    int age;

    /*
    Конструктор - это специальный метод, который автоматически вызывается при создании объекта этого класса.
    Основная задача конструктора - инициализировать новый объект (установить какие-то начальные значения свойств (полей),
    второстепенно - мы можем выполнить другие начальные настройки объекта.

    Особенности конструктора
    1. Имя конструктора ВСЕГДА совпадает с названием класса!
    2. Конструктор не имеет возвращаемого типа (даже void не указываем - просто пустое место),
    т.к. конструктор автоматически возвращает экземпляр класса.
    3. Конструктор вызывается автоматически при создании объекта. Это происходит при использовании оператора new
     */


    public Cat() {
        System.out.println("КОНСТРУКТОР!!!");
        this.name = "Alfred";
        this.color = "yellow";
        this.age = 8;
    }


//     Перегруженный конструктор
    public Cat(String catName) {
        System.out.println("Конструктор 2");
        color = catName;
    }

    public Cat(String name, String color) {
        // Ключевое this используется внутри класса - для ссылки (указания) на текущий объект.

        System.out.println("Конструктор с 2-мя String");
        this.name = name;
        this.color = color;
    }

    public Cat(String name, String color, int age) {
        // Также this может использоваться для вызова других конструкторов в том же классе.
        // Вызов другого конструктора может быть только в первой строчке тела конструктора
        this(name, color);

        System.out.println("Продолжение работы конструктора с 3-мя параметрами");
        this.age = age;

    }

    // это НЕ конструктор. Какой-то метод с именем Cat и типом возвращаемого значения void
    // он НЕ будет выполнен автоматически при создании объекта
    public void Cat() {
        System.out.println("Метод CAT!!!");
    }

    public void whoAmI() {
        System.out.println("Я котик " + name + ", мой возраст: " +
                age + "; цвет: " + color);

    }

    void sleep () {
        System.out.println("Я сплю");
    }
    void sayMeow() {
        System.out.println("Meow!!!");
    }
        void run () {
        System.out.println("Run");
    }
}
