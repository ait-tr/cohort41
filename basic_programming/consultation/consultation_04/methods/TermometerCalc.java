package methods;

import java.util.Scanner;

public class TermometerCalc {
    public static void main(String[] args) {
        /*
        пользователь вводит температуру в градусах цельсия
        а вам нужно напечатать температуру в градусах Фаренгейта

        tCels * 1.8 + 32 = tFar
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите температуру в градусах Цельсия: ");

        double tCelsium = scanner.nextDouble();

        double tFahrengeit = tCelsium * 1.8 +32;

        System.out.println("Температура в градусах по шкале Фаренгейта = " + tFahrengeit);

    }

}
