/*
@date 15.03.2024
@author Sergey Bugaienko
*/

import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionExample {
    public static void main(String[] args) {

        //Ошибка компиляции
        String str = "Hello";
        // int a = "Java"; // java: incompatible types: java.lang.String cannot be converted to int

//        System.out.println( 1 / 0); // java.lang.ArithmeticException

        int[] array = {1, 3, 6};
        // array[10] = 10; // java.lang.ArrayIndexOutOfBoundsException

        String str1 = null;
        // str1.length(); //  java.lang.NullPointerException



        /*
        try {
        // код, который может вызвать исключение
        } catch {
        // код обработки исключения
        }
         */

        String string = "1";
        int integer = -100;

        // try блок используется для оборачивания кода, который может вызвать исключение.
        // Блок catch - для перехвата и обработки исключения.
        // Блок finally - используется для кода, который должен быть выполнен независимо от того, было ли исключение перехвачено

        try {
            integer = Integer.parseInt(string);

            String str5 = "null";
            System.out.println(str5.length());
            System.out.println("End try block");

        } catch (NullPointerException nullPointerException) {
            System.out.println("Я ловлю NPE!!!");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
//            exception.printStackTrace();
            integer = 0;
        } finally {
            System.out.println("Код из блока finally");
        }


        System.out.println("Программа работает дальше");

        System.out.println("integer: " + integer);

        String url = getUrlString();
        System.out.println(url);

        try {
            String url2 = getUrlString2();
        } catch (MalformedURLException e) {
            System.out.println("Неверный формат адреса");
            System.out.println(e.toString());
        }

    }

    private static String getUrlString() {
        URL myUrl = null;
        String defaultUrlString = "https://google.com";

        try {
            myUrl = new URL(defaultUrlString);
            myUrl = new URL("htps://example.com");
        } catch (MalformedURLException exception) {
            System.out.println("Неверный формат URL: " + exception.getMessage());
            exception.printStackTrace();
        }

        return myUrl.toString();
    }

    private static String getUrlString2() throws MalformedURLException {
        //Ключевое слово throws - используется в сигнатуре метода для указания,
        // что метод может выбросить исключение

       URL myUrl = new URL("htps://example.com");

        return myUrl.toString();
    }
}
