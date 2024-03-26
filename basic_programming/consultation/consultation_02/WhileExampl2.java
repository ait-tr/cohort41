import java.util.Random;

public class WhileExampl2 {
    public static void main(String[] args) {

        boolean condition = true;

        Random random = new Random();

        while (condition) {

            int randomValue = random.nextInt(100);

            if (randomValue > 50) {
                condition = false;
            }

            System.out.println("Текущее значение случайного числа = " + randomValue);
        }

    }
}
