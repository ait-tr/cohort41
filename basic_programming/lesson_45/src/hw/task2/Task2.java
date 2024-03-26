package hw.task2;
/*
@date 19.03.2024
@author Sergey Bugaienko
*/
/*
Данные в виде: <имяПользователя>:<суммаПоступления>.

Ваше задание прочитать данные из файла и обработать их.

Результат обработки должен быть записан в два файла:

less.txt список тех, кому в сумме перечисленно меньше 2000
more.txt список тех, кому в сумме перечисленно 2000 и больше
Output:

less.txt

user2:1950
user3:1800
more.txt:

user1:5050
user4:2100
 */

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {

    private static final int LIMIT = 2000;
    private static final String FILE_DATA = "src/homework_44/code.task2/data.txt";
    private static final String FILE_LESS = "src/homework_44/code.task2/less.txt";
    private static final String FILE_MORE = "src/homework_44/code.task2/more.txt";

    public static void main(String[] args) {
        /*
        1. Считать данные из файла
        2. Преобразовать данные в Map (просуммировав суммы переводов для каждого пользователя (если сум несколько)
        3. Записать данные в файлы. Файл для записи выбирать по общей сумме перевода за весь период
         */

        List<String> records = readData();
//        System.out.println(records);

        Map<String, Integer> usersTransactions = listToMap(records);
        System.out.println(usersTransactions);
//
        writeFiles(usersTransactions);


    }

    private static void writeFiles(Map<String, Integer> usersTransactions) {
        try (
                BufferedWriter less = new BufferedWriter(new FileWriter(FILE_LESS));
                BufferedWriter more = new BufferedWriter(new FileWriter(FILE_MORE))) {
            for (Map.Entry<String, Integer> entry : usersTransactions.entrySet()) {
                // user1:5050
                String data = entry.getKey() + ":" + entry.getValue();

                if (entry.getValue() < LIMIT) {
                    less.write(data);
                    less.newLine();
                } else {
                    more.write(data);
                    more.newLine();
                }


                /*
                BufferedWriter writer1;
                if (entry.getValue() < LIMIT) {
                    writer1 = less;
                } else {
                    writer1 = more;
                }
                 */

//                BufferedWriter writer = entry.getValue() < LIMIT ? less : more;
//                writer.write(data);
//                writer.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static Map<String, Integer> listToMap(List<String> records) {
        Map<String, Integer> users = new HashMap<>();

        for (String record : records) {
            // user1:2050

            DataTransfer dataTransfer = new DataTransfer(record);

            String name = dataTransfer.getUserName();
            int amount = dataTransfer.getValue();

            users.compute(name, (key, value) -> value == null ? amount : value + amount);

        }

        return users;
    }

    private static List<String> readData() {
        List<String> records = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_DATA))) {
            String line;

            while ((line = reader.readLine()) != null) {
                records.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return records;
    }
}
