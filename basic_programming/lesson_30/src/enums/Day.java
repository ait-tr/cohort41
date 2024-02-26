package enums;
/*
@date 26.02.2024
@author Sergey Bugaienko
*/

public enum Day {

    MONDAY("Понедельник", 1),
    TUESDAY("Вторник", 2),
    WENDESDAY("Средна", 3),
    THURSDAY("Четверг", 4),
    FRIDAY("Пятница", 5),
    SATURDAY("Суббота", 6),
    SUNDAY("Воскресенье", 7);

    private String russian;
    private int dayOfWeek;

    Day(String russian, int dayOfWeek) {
        this.russian = russian;
        this.dayOfWeek = dayOfWeek;
    }

    public String getRussian() {
        return russian;
    }

    public void setRussian(String russian) {
        this.russian = russian;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

}
