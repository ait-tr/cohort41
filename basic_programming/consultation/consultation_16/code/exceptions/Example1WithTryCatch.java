package code.exceptions;

import code.loop.UserInput;

import java.util.InputMismatchException;

public class Example1WithTryCatch {
    public static void main(String[] args) {

        UserInput ui = new UserInput();

        try {

        int x = ui.inputInteger("Введите первое число: ");
        int y = ui.inputInteger("Введите второе число: ");

            System.out.println("Результат деления = " + divide(x, y));
        } catch (InputMismatchException e) {
            System.out.println("неправильный ввод данных");
        } catch (ArithmeticException exception){
            System.out.println("Произошла ошибка " + exception.getMessage());
        } finally {
            System.out.println("ЭТОТ БЛОК ОТРАБОТАЕТ ВСЕГДА");
        }


        System.out.println("Программа завершила свою работу");
    }

    static double divide(int x, int y){
        return x / y;
    }
}
