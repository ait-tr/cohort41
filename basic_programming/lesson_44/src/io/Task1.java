package io;
/*
@date 18.03.2024
@author Sergey Bugaienko
*/

import java.io.*;

public class Task1 {
    public static void main(String[] args) {

        /*
        1. Создайте 10 файлов: test_1.txt, test_2.txt, test_3.txt ...
        2. В каждый файл записать строку соответственно: Java1, Java2 ... Java10
         */

        // Понадобится цикл, путь к фалам, генерация имен файлов и создание файлов цикле
        // Понадобится writer, генерация теста для записи



        File pathDir = new File("src/lesson_44/task1");
        pathDir.mkdirs();

        for (int i = 1; i < 11; i++) {
            File fileName = new File(pathDir, "test_" + i + ".txt");
            // test_1.txt, test_2.txt, ...

            try (FileWriter writer = new FileWriter(fileName)) {
                fileName.createNewFile();
                writer.write("Java" + i);

                System.out.println("Запись в файл произведена успешно: " + fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

         /*
            Проверьте все файлы в директории
            Получить список всех файлов, залезть в каждый, прочитать строку, сравнить, вывести имя файла, если есть такая строка
            Выведите в консоль имя файла, в котором содержится строка "Java7"
            // output: test_7.txt

         */
        // Список файлов. Перебрать все файлы. Прочитать из каждого строку. Если строка содержит искомую, вывести в консоль имя файла


        //Получаем список файлов
        File[] files = pathDir.listFiles();

        for (File file: files) {

            //нужны ридеры, чтобы заглянуть в файл
            try (BufferedReader bReader = new BufferedReader(new FileReader(file))){

                String line = bReader.readLine();

                if (line != null && line.contains("Java7")) {
                    System.out.println("Файл найден: " + file.getName());
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
