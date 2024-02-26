package util;

public interface MyQueue<T>{
    void addLast(T value); // добавить в конец
    void addFirst(T value); //добавить в начало
    T getFirst(); // значение "головы" списка
    T getLast(); // значение самого правого элемента списка
    T remove(); // Удаляет первый элемент списка
    T removeFirst(); // Удаляет первый элемент списка
    T removeLast(); //Удаляет последний элемент списка
}