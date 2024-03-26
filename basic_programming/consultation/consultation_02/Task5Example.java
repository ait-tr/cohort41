import java.util.Scanner;

public class Task5Example {
    /*
    Программа просит пользователя слово "hello"
Если пользователь вводит правильное слово - программа распечатывает на экран благодарность и завершает работу
Если вводится не верное слово - программа просит ввести слово снова. До тех пор, пока не будет введено запрашиваемое слово

*опционально - считать кол-во попыток, которые потребовались пользователю для введения правильного слова
По окончанию - вывести число попыток на экран
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = "";

        int counter = 0;

        boolean condition = true;

        while (condition){
            System.out.println("Введите слово: ");
            inputText = scanner.nextLine();

            counter = counter + 1;

            if (inputText.equals("hello")) {
                System.out.println("Спасибо за сотрудничество!");
                condition = false;
            } else {
                System.out.println("Упс! Что-то пошло не так! Повторим еще раз.");
            }
        }

        System.out.println("Вам удалось выполнить мою просьбу с " + counter + " раза )))");

    }
}
