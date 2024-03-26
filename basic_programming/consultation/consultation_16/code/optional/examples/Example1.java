package code.optional.examples;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        List<String> list = List.of("Вода", "Водка", "Вилы", "Вилка", "Вино", "Вода", "Водка", "Вилы", "Вилка", "Аджика", "Сало");


        List<String> emptyList = new ArrayList<>();
        Optional<String> task2 = emptyList.stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparing(string -> string.length()));

        if (task2.isPresent()) {
            System.out.println(task2.get());
        } else {
            System.out.println("Список пуст");
        }



//        Optional<String> longestString = list.stream().filter(Objects::nonNull).max(Comparator.comparing(string -> string.length()));
//        String code.task2 = longestString.orElse("Список пуст");
//
    }
}
