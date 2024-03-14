## Stream API

**Stream API** в Java позволяет обрабатывать последовательности элементов (например, коллекции) в функциональном стиле. Stream API введено в Java 8 и является частью Java Collections Framework. Основной интерфейс Stream предоставляет множество методов для выполнения операций с данными.

### Основные определения:

- **Stream** - последовательность элементов, поддерживающая параллельные и последовательные агрегатные операции.
- **Pipeline** - последовательность операций, выполняемых на потоке данных.
- **Intermediate operation (Промежуточная операция)** - операция, преобразующая поток и возвращающая новый поток, например, `filter`, `map`.
- **Terminal operation (Терминальная операция)** - операция, завершающая работу с потоком и возвращающая результат, например, `collect`, `forEach`.

Промежуточные методы можно условно разделить на следующие категории:
- фильтрация данных
- изменение данных
- упорядочивания данных

Терминальные методы можно разделить по функциональности на:
- аккумулирующие данные
- выполняющие действия с данными
- сохраняющие данные
- генерирующие результат на основе данных

### Промежуточные. Все возвращают поток. Фильтрация данных
- `filter(Predicate<? super T> predicate)`: Отфильтровывает элементы, соответствующие заданному предикату.
- `distinct()`: Удаляет дублирующие элементы, возвращая поток с уникальными элементами.
- `limit(long maxSize)`: Ограничивает количество элементов потока заданным значением.
- `skip(long n)`: Пропускает первые `n` элементов потока.
- `Stream<T> takeWhile(Predicate<? super T> predicate)` - этот метод принимает предикат и возвращает новый поток, который содержит элементы исходного потока до тех пор, пока предикат возвращает `true`. Как только предикат возвращает `false` для какого-либо элемента, операция прекращает обработку и игнорирует все последующие элементы исходного потока.
- `Stream<T> dropWhile(Predicate<? super T> predicate)` - метод также принимает предикат, но в отличие от `takeWhile`, он пропускает элементы исходного потока, пока предикат возвращает `true`, и возвращает поток, начиная с первого элемента, для которого предикат возвращает `false`.


### Промежуточные методы для изменения потока данных:
- `map(Function<? super T, ? extends R> mapper)`**: Преобразует элементы потока с использованием заданной функции.
- `flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)`: Преобразует каждый элемент потока в поток других объектов и "сглаживает" все эти потоки в один.
- `mapToInt(ToIntFunction<? super T> mapper)`: Преобразует объекты потока в `IntStream`.
- `mapToLong(ToLongFunction<? super T> mapper)`: потока в `LongStream`.
- `mapToDouble(ToDoubleFunction<? super T> mapper)`: объекты потока в `DoubleStream`.

### Статические методы:
- `concat(Stream<? extends T> a, Stream<? extends T> b)`: - Объединяет два потока в один.
Например: `Stream.concat(Stream.of("a"), Stream.of("b"))` создаст поток, содержащий "a" и "b".
- `empty()`: Создаёт пустой поток.
- `generate(Supplier<T> s)`:
Создает бесконечный поток, генерируя элементы с помощью предоставленной функции.
Если захотим собрать его в список- надо как-то ограничить
Например: `Stream.generate(Math::random)` создаст бесконечный поток случайных чисел

- `iterate(final T seed, final UnaryOperator<T> f)`: - Создаёт поток, в котором каждый последующий элемент генерируется путём повторного применения функции к предыдущему элементу, начиная с начального значения `seed`. 
Например: `Stream.iterate(0, n -> n + 2)` создаст поток чётных чисел.

- `iterate(T seed, Predicate<? super T> hasNext, UnaryOperator<T> next)` (добавлен в Java 9): Похож на `iterate`, но также включает предикат `hasNext`, который определяет, когда итерация должна остановиться.
Stream<Integer> integerStream = Stream.iterate(0, n -> n <= 10, n -> n + 1);

- `of(T... values)`: Создаёт поток из переданных значений.
- `of(T value)` - Создаёт поток из одного элемента.
- `ofNullable(T value)` - потом из одного или пустой

--- 
## Класс `Optional`
Класс `Optional` в Java - это контейнерный класс, используемый для представления необязательных значений, которые могут быть `null`. Он был введен в Java 8 как часть java.util пакета и предлагает удобный способ работать с значениями, которые могут отсутствовать, без явного использования `null` проверок, что уменьшает возможность возникновения `NullPointerException`.

Вот основные характеристики и методы класса `Optional`:

### Создание объекта Optional

- `Optional.empty()`: возвращает пустой `Optional` объект.
- `Optional.of(value)`: возвращает `Optional` с не-null значением. Если значение `null`, то будет выброшено исключение `NullPointerException`.
- `Optional.ofNullable(value)`: возвращает `Optional`, который содержит значение, если оно не `null`, и пустой `Optional`, если значение `null`.

### Проверка наличия значения

- `isPresent()`: возвращает `true`, если значение присутствует в `Optional`.
- `isEmpty()`: возвращает `true`, если значение отсутствует в `Optional` (появился в Java 11).

### Получение значения

- `get()`: возвращает значение, если оно присутствует, иначе выбрасывает `NoSuchElementException`.
- `orElse(defaultValue)`: возвращает значение, если оно присутствует, иначе возвращает `defaultValue`.
- `orElseGet(supplier)`: возвращает значение, если оно присутствует, иначе вызывает функцию `supplier` для генерации значения по умолчанию.
- `orElseThrow(exceptionSupplier)`: возвращает значение, если оно присутствует, иначе выбрасывает исключение, созданное с помощью `exceptionSupplier`.

### Работа со значениями

- `ifPresent(consumer)`: выполняет действие `consumer`, если значение присутствует.
- `ifPresentOrElse(consumer, emptyAction)`: выполняет действие `consumer`, если значение присутствует, иначе выполняет `emptyAction` (добавлен в Java 9).
- `stream()`: если значение присутствует, возвращает поток с одним элементом, иначе возвращает пустой поток (добавлен в Java 9).
- `filter(predicate)`: если значение присутствует и удовлетворяет условию `predicate`, возвращает `Optional` этого значения, иначе возвращает пустой `Optional`.
- `map(function)`: если значение присутствует, применяет функцию `function` и возвращает `Optional` результата.
- `flatMap(function)`: если значение присутствует, применяет функцию `function`, которая сама возвращает `Optional`, и затем возвращает этот `Optional` напрямую, избегая дополнительной обертки `Optional<Optional<T>>`.

### Примеры использования

```
// Создание Optional объекта
Optional<String> optional = Optional.of("Hello");

// Использование map для преобразования содержимого, если оно присутствует
optional.map(String::toUpperCase).ifPresent(System.out::println); // Выведет "HELLO"

// Получение значения с альтернативой
String nullSafe = optional.orElse("Default Value");

// Использование orElseThrow для генерации исключения, если значение отсутствует
String value = optional.orElseThrow(IllegalStateException::new);


```

Использование класса `Optional` помогает писать более чистый код, уменьшая необходимость в проверках на `null` и явных `null` значениях. Это может привести к уменьшению ошибок, связанных с отсутствием значений, и улучшить читаемость кода.

Однако **следует избегать использования `Optional` для полей классов или в качестве аргументов методов**, так как это увеличивает сложность и не соответствует первоначальной цели класса `Optional`, которой является предоставление ясного и удобного способа работы с методами, которые могут возвращать `null`.



<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>

## Stream API
**Stream API** in Java allows for processing sequences of elements (for example, collections) in a functional style. Stream API was introduced in Java 8 and is part of the Java Collections Framework. The primary Stream interface provides many methods for data operations.

### Basic Definitions:

- **Stream**: A sequence of elements supporting parallel and sequential aggregate operations.
- **Pipeline**: A sequence of operations performed on a stream of data.
- **Intermediate Operation**: An operation that transforms the stream and returns a new stream, for example, `filter`, `map`.
- **Terminal Operation**: An operation that finishes the processing of the stream and returns a result, for example, `collect`, `forEach`.


</details>