package homework_40;
/*
@date 13.03.2024
@author Sergey Bugaienko
*/




import java.util.List;
import java.util.stream.Collectors;

/*
Дан список строк.
Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву (например, "A"),
удалите дубликаты и отсортируйте их в алфавитном порядке.
 */
public class HW40_Task4 {
    public static void main(String[] args) {


        List<String> list = List.of("Вода", "Водка", "Вилы", "Вилка", "Вино", "Вода", "Водка", "Вилы", "Вилка", "Аджика", "Сало");
//        System.out.println("Abcde".startsWith("A"));
//        System.out.println("Abcde".endsWith("de"));
        task4(list, "В");


        List<Person> people = List.of(new Person("Max", 30, "City"),
                new Person("John", 40, "Berlin"));

        System.out.println(getPersonList(people));
    }

    private static void task4(List<String> strings, String startWith) {

        List<String> strings1 = strings
                .stream()
                .filter( s -> s.startsWith(startWith))
//                .filter( s-> s.endsWith("A"))
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(strings1);

    }

    /*
    Дан список Person с полями name, age, city.
    Используйте Stream API для фильтрации людей, которые старше определенного возраста и проживают в определенном городе,
    а затем соберите их в список.
     */
    private static List<Person> getPersonList(List<Person> people){
        return people
                .stream()
                .filter(p -> p.getAge() > 25)
                .filter(person ->  person.getCity().equals("City"))
                .collect(Collectors.toList());

    }
}
