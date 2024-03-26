package incapsulation;

public class Robot {

    private String model;
    private String name;
    private int xCoordinate;
    private int yCoordinate;

    public Robot(String model, String name, int xCoordinate, int yCoordinate) {
        this.model = model;
        this.name = name;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void moveLeft(){
        xCoordinate = xCoordinate - 1;
    }

    public void moveRight(){
        xCoordinate = xCoordinate + 1;
    }

    public void moveUp(){
        yCoordinate = yCoordinate + 1;
    }

    public void moveDown(){
        yCoordinate = yCoordinate - 1;
    }

    public void printRobotInfo(){
        System.out.println("Робот-пылесос модель: " + model);
        System.out.println("Робот-пылесос имя: " + name);
        System.out.println("Робот-пылесос координаты: X = " + xCoordinate + ", Y = " +  yCoordinate);
    }

    public void sayEnergyLevel(){

                /* могли бы прямо тут написать код для
                   проверки уровня зарядки аккумулятора
                 */

        int powerLvl = checkPowerLevel();
        System.out.println("Текущий уровень зарядки: " + powerLvl + " процентов");
    }

    private int checkPowerLevel(){
        // проверяет уровень зарядки
        int currentLevl = 50;

        return currentLevl;
    }

}
