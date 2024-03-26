package incapsulation;

public class RobotDemo {
    public static void main(String[] args) {
        Robot robot = new Robot("Xiaomi", "Петрович", 0, 0);

        robot.moveRight();
        robot.moveRight();
        robot.moveRight();
        robot.moveRight();
        robot.moveRight();
        robot.moveRight();
        robot.moveRight();
        robot.moveRight();
        robot.moveRight();
        robot.moveRight();
        robot.moveRight();
        robot.moveRight();
        robot.moveRight();
        robot.moveRight();
        robot.moveRight();
        robot.moveRight();

        robot.moveUp();
        robot.moveUp();
        robot.moveUp();
        robot.printRobotInfo();

        robot.printRobotInfo();

        robot.sayEnergyLevel();

        if (robot.getxCoordinate() > 10) {
            System.out.println("Едем обратно");
        } else {
            System.out.println("Продолжаем уборку");
        }

    }
}
