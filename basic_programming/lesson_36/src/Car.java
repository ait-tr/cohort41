/*
@date 05.03.2024
@author Sergey Bugaienko
*/

public class Car implements Comparable<Car> {
    private String model;
    private int year;
    private int maxSpeed;

    public Car(String model, int year, int maxSpeed) {
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    // Позволяет определить "естественный" порядок сортировки, который подходит для большинства задач
    @Override
    public int compareTo(Car car) {
        return this.year - car.getYear();
    }

    // a = текущий объект ? b  = объект с которым сравниваем
    // a < b -> метод вернул отрицательное значение
    // a > b -> метод вернул положительное значение
    // a == b -> метод вернет 0

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car {" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
