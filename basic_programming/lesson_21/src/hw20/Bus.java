package hw20;
/*
@date 12.02.2024
@author Sergey Bugaienko
*/

/*
HW
Добавьте в класс Bus поле, хранящее общее количество перевезенных автобусом пассажиров (за все время).

Геттер для этого поля.

Нужен ли сеттер?

Должны ли мы в каком-то из существующих методов изменять количество перевезенных автобусом пассажиров?

Если да - реализуйте.
 */

public class Bus extends Vehicle {

    private int capacity;
    private int countPassengers; // по умолчанию установлено в 0. Количество пассажиров в автобусе в настоящий момент

    private int totalPassengerCounter; // общее кол-во пассажиров, перевезенных этим (конкретным экземпляром) автобусом

    public Bus(String model, int yearManufactured, int capacity) {

        // чтобы создать объект-родителя нам нужно вызвать его конструктор!
        super(model, yearManufactured); // вызов конструктора родителя
        System.out.println("Конструктор Bus продолжает выполнение!");
        this.capacity = capacity;
    }

    public boolean takePassenger() {
        // Проверить, есть ли место в автобусе
        if (countPassengers < capacity) {
            //свободное место есть. Добавляем пассажира
            countPassengers++;
            System.out.println("Пассажир зашел в автобус " + this.getModel());
            totalPassengerCounter++;
            return true;
        }

        System.out.println("Автобус полный! Пассажир не смог зайти");
        return false;
    }

    public void getOutPassenger() {
        // проверить, а есть ли сейчас в автобусе пассажиры
        if (countPassengers > 0) {
            countPassengers--;
            System.out.println("Пассажир вышел из автобуса " + this.getModel());
        } else {
            System.out.println("Некому выходить - в автобусе больше нет пассажиров");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        //TODO надо проверять, есть ли "лишние" пассажиры в автобусе
        this.capacity = capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public int getTotalPassengerCounter() {
        return totalPassengerCounter;
    }
}
