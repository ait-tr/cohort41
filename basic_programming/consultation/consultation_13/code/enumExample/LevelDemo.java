package code.enumExample;

import java.util.Arrays;

public class LevelDemo {
    public static void main(String[] args) {
        Level level = Level.HIGH;

        System.out.println("уровень: " + level + ", код уровня :" + level.getLevelCode());

        Level level2 = Level.EASY;

        System.out.println("уровень: " + level2 + ", код уровня :" + level2.getLevelCode());

        System.out.println(Arrays.toString(Level.values()));
    }
}
