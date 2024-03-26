package code;

import code.util.MyArrayList;
import code.util.MyList;

public class App {
    public static void main(String[] args) {
        MyList<String> stringMyList = new MyArrayList<>();

        CreateDataBase createDataBase = new CreateDataBase();

        createDataBase.createData(stringMyList);

        System.out.println(stringMyList);

    }
}
