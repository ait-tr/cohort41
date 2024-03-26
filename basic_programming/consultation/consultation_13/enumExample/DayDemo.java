package enumExample;

public class DayDemo {
    public static void main(String[] args) {
        Day today = Day.TUESDAY;

        switch (today) {
            case MONDAY :
                System.out.println("Понедельник - день тяжелый!");
                break;
            case TUESDAY : System.out.println("Приходим в себя после понедельника");
            break;
            case FRIDAY: System.out.println("Ура! Пятница!");
        }
    }
}
