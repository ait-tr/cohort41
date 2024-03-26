import util.MyArrayList;
import util.MyList;

import javax.script.ScriptEngine;

public class App {
    public static void main(String[] args) {
        MyList<String> stringMyList = new MyArrayList<>();

        CreateDataBase createDataBase = new CreateDataBase();

        createDataBase.createData(stringMyList);

        System.out.println(stringMyList);

    }
}
