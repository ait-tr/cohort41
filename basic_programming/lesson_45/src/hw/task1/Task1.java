package hw.task1;
/*
@date 19.03.2024
@author Sergey Bugaienko
*/

import java.io.*;

/*
Ваша задача используя классы пакета java.io создать файл с именем 'copy.txt'
и скопировать в него все данные из файла 'text.txt'
 */
public class Task1 {
    public static void main(String[] args) {


        String fileName = "src/homework_44/task1/text.txt";

        String fileForCopy = "src/homework_44/task1/copy.txt";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileForCopy))
        ){

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
