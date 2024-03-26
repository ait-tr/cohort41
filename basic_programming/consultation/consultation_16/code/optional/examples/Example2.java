package code.optional.examples;

import java.util.*;

public class Example2 {
    public static void main(String[] args) {
        List<String> list = List.of("Вода", "Водка", "Вилы", "Вилка", "Вино", "Вода", "Водка", "Вилы", "Вилка", "Аджика", "Сало");


        List<String> emptyList = new ArrayList<>();
        String task2 = emptyList.stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparing(string -> string.length()))
                .orElse("Список пуст");

            System.out.println(task2);


    }
}
