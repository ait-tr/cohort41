### Task 1

Частотный словарь слов:
Напишите метод, который принимает строку текста и возвращает Map<String, Integer>, где каждому слову соответствует количество его вхождений в текст.

### Task2
#### Опционально:
Напишите метод, возвращающий частотный словарь вхождения символов в строку

```
public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);
        
        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();
    }
```

```
//Output:
Строка: 2
для: 3
проверки: 3
количества: 2
вхождений: 1
слов: 2
и: 2
теста: 1

Вхождение символов: 
'
': 1; ' ': 15; '.': 2; 'С': 2; 'а': 5; 'в': 8; 'д': 4; 'е': 7; 'ж': 1; 'и': 8; 'й': 1; 'к': 7; 'л': 7; 'н': 1; 'о': 10; 'п': 3; 'р': 8; 'с': 5; 'т': 6; 'х': 1; 'ч': 2; 'я': 3; 


```

### Task 3

Пересечение двух карт:
Реализуйте метод, который принимает две карты `Map<String, Integer>` и возвращает новую карту, содержащую только те записи, ключи которых присутствуют в обеих исходных картах.
Для совпадающих ключей значение можно брать из любой карты

```
 Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        Map<String, Integer> intersectionMap = intersection(map1, map2);
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));
```

```
//Output
banana: 20
cherry: 30
```




### Task 4
#### *Опционально*

Построение маршрута.

У вас есть карта прямых рейсов, где ключ — это название города отправления, а значение — город назначения. 

Необходимо написать функцию, которая принимает карту рейсов, город отправления и город назначения и возвращает список городов, через которые проходит маршрут. Если прямого рейса нет, функция должна пытаться найти маршрут с пересадками.

**Условия:**
- Если прямого рейса нет, нужно искать возможные пересадки через другие города.
- Если маршрут невозможно составить, функция должна возвращать пустой список.
- Предполагается, что нет циклических маршрутов, и из города можно уехать только в один другой город (один к одному соответствие).

**Пример карты рейсов:**
```
Map<String, String> directFlights = new HashMap<>();
directFlights.put("New York", "Chicago");
directFlights.put("Chicago", "Denver");
directFlights.put("Denver", "Las Vegas");
directFlights.put("Boston", "Miami");
directFlights.put("Miami", "New York");
directFlights.put("Los Angeles", "San Francisco");
directFlights.put("San Francisco", "New York");
```

**Пример выполнения функции:**
```
List<String> route = findRoute(directFlights, "Boston", "Las Vegas");
System.out.println(route); // Вывод: ["Boston", "Miami", "New York", "Chicago", "Denver", "Las Vegas"]
```

___

## Продвинутый уровень
### Опционально на выходные

Написать свою реализацию HashMap использую прикрепленный к заданию класс `MyHashMap` и интерфейс `InterfaceHashMap.java`










