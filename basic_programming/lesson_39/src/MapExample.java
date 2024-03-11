/*
@date 11.03.2024
@author Sergey Bugaienko
*/

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> oldTable = new Hashtable<>(); // Устаревшая реализация. НЕ рекомендуемая к использованию.
        Map<Integer, String> map = new HashMap<>();

        // Map<K,V>
        // V put(K key, V value)
        // добавить пару ключ-значения
        // Возвращает "старое значение", соответсвующее ключу ранее

        System.out.println(map.put(1, "Hello"));
        map.put(2, "Java");
        map.put(3, "World");
        String oldValue = map.put(1, "Python");
        System.out.println("oldVal: " + oldValue);
        map.put(17, "orange");

        System.out.println(map);


        // V get(Object key) - возвращает значение, ассоциированное с ключом. Если такого ключа нет - null
        String value = map.get(17);
        System.out.println("value: " + value);

        System.out.println("\n==========================");

        String value1 = map.get(17);
        String defaultValue = "Default";
        if (value1 == null) value1 = defaultValue;
        System.out.println(value1);

        // V getOrDefault(Object key, V defaultValue)
        String valueWithCheckNull = map.getOrDefault(1, "NotNullValue");
        System.out.println("valueWithCheckNull: " + valueWithCheckNull);

        // boolean containsKey(Object key) - вернет true если есть такой ключ в словаре
        // boolean containsValue(Object value) - вернет true если есть карта содержит одно или несколько таких значений

        System.out.println("map.containsKey(100): " + map.containsKey(100));
        System.out.println(map.containsValue("Java"));

        System.out.println("\n=====================");
        map.isEmpty(); // true, если карта пуста
        // int size() - возвращает количество пар "ключ-значение"
        int size = map.size();
        System.out.println(size + " | " + map.isEmpty());
        // void clear() - очищает карту

        // V remove(Object key) - по ключу удаляет пару "ключ-значение". Возвращает значение из удаленной пары
        System.out.println(map.remove(100));

        // boolean remove(Object key, Object value) -удаляет пару "ключ-значение". Возвращает true в случае успешного удаления пару ключ-значения
        System.out.println("map.remove(1, \"Java\") -> " + map.remove(1, "Java"));
        System.out.println(map);

        System.out.println("map.remove(1, \"Python\") -> " + map.remove(1, "Python"));
        System.out.println(map);

        System.out.println("\n===========================\n");
        // put vs replace
        // V replace(K key, V value)
        map.put(99, "Banana"); // если нет ключа "key" -> то новая пара БУДЕТ создана будет.  Если ключ есть - value будет переписано на новое значение
        System.out.println("map.replace(2, \"Value\" -> " + map.replace(2, "Value")); // если нет ключа "key" -> то новая пара создана НЕ будет. Если ключ есть - value будет переписано на новое значение
        System.out.println(map.replace(100, "New Value"));

        // boolean replace(K key, V oldValue, V newValue)
        System.out.println(map.replace(99, "Banana", "Kiwi")); // Ищет ключ, соответствие key=lodValue. И если соответствие есть - переписывает значение на newValue
        System.out.println(map.replace(99, "Banana", "Avocado"));
        System.out.println(map);

        System.out.println("\n=====================\n");
        // Set<K> keySet() - возвращает Set всех ключей словаря
        Set<Integer> keySet = map.keySet();
        System.out.println("keySet: " + keySet);

        for (Integer key : map.keySet()) {
            System.out.println("Current value: " + map.get(key));
        }

        System.out.println("\n================");

        //Collection<V> map.values() - возвращает коллекцию всех значений карты
        Collection<String> collection = map.values();
        System.out.println(collection);

        // Map.Entry<K, V>

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {

            System.out.println("entry.getKey() -> " + entry.getKey());
            if (entry.getValue().equals("Value")) {
                entry.setValue("Banana");
            }
            System.out.println("entry.getValue() -> " + entry.getValue());
            System.out.println("==========================");
        }

        System.out.println(map);

        System.out.println("\n========================\n");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String val = entry.getValue();
        }

        map.forEach((key, val) -> System.out.println("Key: " + key + " | value: " + val));

        System.out.println("\n=====================\n");

        Map<Integer, String> newMap = new LinkedHashMap<>();
        newMap.put(77, "Kotlin");
        newMap.put(0, "Tree");
        newMap.put(87, "JS");

        System.out.println("newMap: " + newMap);

        map.put(87, "DuplicatedValue");
        System.out.println("map" + map);

        newMap.putAll(map);
        System.out.println(newMap);
        newMap.put(87, "Hero");
        newMap.put(1000, "Hello");
        System.out.println(newMap);


    }
}
