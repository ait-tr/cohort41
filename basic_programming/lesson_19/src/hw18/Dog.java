package hw18;
/*
@date 09.02.2024
@author Sergey Bugaienko
*/

/*
Написать класс Собака.

Каждая Собака обязательно должна иметь имя и высоту прыжка

Должна уметь прыгать и должна уметь тренироваться.

- За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров

-- Максимальная высота прыжка, которую может натренировать собака, не может быть больше,
чем двукратная высота первоначального прыжка.

Также должен быть метод взять барьер. В параметрах метод принимает высоту барьера.

Если собака в состоянии преодолеть этот барьер - прыгает.
Если не в состоянии, нужно проверить помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер).
Если да -> идем тренироваться -> берет барьер

 */
public class Dog {
    private String name;
    private int jumpHeight;

    private int maxJumpHeight;

    private static int increasePerOneTraining;

    static {
        increasePerOneTraining = 10;
    }

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * 2;
    }


    public void jump() {
        System.out.println("Собака " + name + " совершила прыжок");
    }

    private void training() {
        this.jumpHeight += increasePerOneTraining; // 44 + 10 = 54 < 88
        //84 + 10 = 94 (max 88)

//        jumpHeight =  (jumpHeight > maxJumpHeight) ? maxJumpHeight : jumpHeight;
        //                          54             88   -> 54
        //                          94             88   -> 88
        jumpHeight =  Math.min(jumpHeight, maxJumpHeight); // метод возвращает меньшее из двух чисел
        System.out.println(" === прыжок после тренировки === " + jumpHeight);

    }

    public boolean takeBarrier(int barrier) {
        System.out.println(name + " прыжок: " + jumpHeight + "; барьер: " + barrier + " | Начало метода takeBarrier");
        if (jumpHeight >= barrier) { // Если текущая высота прыжка достаточна - прыгаем
            jump();
            System.out.println("(jumpHeight >= barrier) = true -> " + name + " прыжок: " + jumpHeight + "; барьер: " + barrier);
            return true;
        } else { // ветка, в которой текущий прыжок меньше барьера
            if (maxJumpHeight >= barrier) { // проверяем, есть ли смысл тренироваться

                do { // Начинаем цикл тренировок
                    training(); // каждая тренировка увеличивает высоту прыжка на 10 см
                } while (jumpHeight < barrier); // проверяем - достаточна ли высота прыжка для взятия барьера


                jump();
                System.out.println("maxJumpHeight >= barrier : true -> " + name + " прыжок: " + jumpHeight + "; барьер: " + barrier);
                return true;
            } else { // Тренировки лишены смысла - этот барьер собака взять не может.
                System.out.println("Извините, этот барьер мне не взять. ");
                System.out.println("maxJumpHeight >= barrier : FALSE -> " + name + " прыжок: " + jumpHeight + "; барьер: " + barrier);

                return false;
            }
        }
    }


    public void info() {
        System.out.println("Собака: " + name + "; текущий прыжок " + jumpHeight + " | max: " + maxJumpHeight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
