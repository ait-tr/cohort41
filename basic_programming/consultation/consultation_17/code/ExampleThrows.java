package code;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExampleThrows {
    public static void main(String[] args) {

        try {
            readFile();
        } catch (FileNotFoundException e){
           e.printStackTrace();
        }


    }


    public static void readFile() throws FileNotFoundException {

        FileReader fileReader = new FileReader("text.txt");

    }





}
