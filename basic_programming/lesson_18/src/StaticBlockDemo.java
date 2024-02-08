/*
@date 08.02.2024
@author Sergey Bugaienko
*/

public class StaticBlockDemo {
    static String[] colors;
    static int number = 10;


    private String title = "Str1";


    static {
        System.out.println("Static init block start!");
        colors = new String[3];
        colors[0] = "Red";
        colors[1] = "Yellow";
        colors[2] = "Cyan";
    }

    {
        System.out.println("NON-static init block");
    }

    static {
        System.out.println("STATIC second!");
    }

    public StaticBlockDemo() {
        System.out.println("Constructor start!");
    }

    public void printColors() {
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
    }


}
