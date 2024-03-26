package generics;


import java.util.ArrayList;
import java.util.List;

public class NonGerics {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("text1");
        list.add("text222");

        printSmth(list);

        //list.add(new Integer(1));

        printSmth(list);



    }

    public static void printSmth (List<String> list){
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            System.out.println("Длина строки: " + item.length());
        }
    }

}
