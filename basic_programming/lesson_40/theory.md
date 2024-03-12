
Функциональные интерфейсы `Function`, `Predicate` и `Consumer` являются частью Java Lambda Expressions, введенных в Java 8. 
Они играют ключевую роль в функциональном программировании в Java, предоставляя удобные способы обработки данных с помощью лямбда-выражений и методов, которые принимают функциональные интерфейсы в качестве параметров.

### Function<T, R>

Интерфейс `Function<T, R>` предназначен для операций, которые принимают один входной параметр типа `T` и возвращают результат типа `R`. 
Этот интерфейс имеет один абстрактный метод `apply`.

#### Метод `apply`:
- **Сигнатура**: `R apply(T t)`
- **Описание**: Принимает объект типа `T` и возвращает объект типа `R`.

#### Пример использования `Function`:

```
Function<String, Integer> lengthFunction = str -> str.length();
int length = lengthFunction.apply("Hello, World!"); // Возвращает длину строки
```

### Consumer<T>

Интерфейс `Consumer<T>` предназначен для операций, которые выполняют действие над объектом типа `T`, но не возвращают никакого результата (void). 
Он содержит один абстрактный метод `accept`.

#### Метод `accept`:
- **Сигнатура**: `void accept(T t)`
- **Описание**: Выполняет операцию над объектом типа `T`.

#### Пример использования `Consumer`:

```
Consumer<String> printConsumer = System.out::println;
printConsumer.accept("Hello, World!"); // Печатает строку в консоль
```


### Predicate<T>

`Predicate<T>` предназначен для представления простых функций, которые принимают один аргумент типа `T` и возвращают логическое значение (`boolean`). 
Этот интерфейс особенно полезен для фильтрации или проверки соответствия элементов определенным условиям.

#### Методы интерфейса `Predicate`:

- **`test(T t)`**: Это основной метод интерфейса. Он оценивает условие на предоставленном объекте и возвращает `true` или `false`.

- **`and(Predicate<? super T> other)`**: Возвращает составной предикат, который является логическим "И" (`AND`) этого предиката и предиката `other`.

- **`or(Predicate<? super T> other)`**: Возвращает составной предикат, который является логическим "ИЛИ" (`OR`) этого предиката и предиката `other`.

- **`negate()`**: Возвращает предикат, который является логическим отрицанием (`NOT`) этого предиката.

#### Пример использования `Predicate`:

```
Predicate<String> isNotEmpty = s -> !s.isEmpty();
boolean result = isNotEmpty.test("Hello, World!"); // Возвращает true
```

`Predicate`, так же как и `Function` и `Consumer`, является ключевым элементом функционального программирования в Java и играет важную роль в работе со стримами и коллекциями, где часто требуются операции фильтрации, сопоставления или условной логики.

### Комбинирование функциональных интерфейсов

Функциональные интерфейсы также предоставляют методы по умолчанию, такие как `andThen` и `compose` для `Function`, которые позволяют комбинировать несколько функций в цепочку. Например:

```
Function<String, String> toUpperCase = String::toUpperCase;
Function<String, String> concatenateExclamation = str -> str + "!";
Function<String, String> combinedFunction = toUpperCase.andThen(concatenateExclamation);

String result = combinedFunction.apply("hello"); // "HELLO!"
```

Точно так же, вы можете использовать метод `andThen` с интерфейсом `Consumer` для создания цепочек потребителей.

___

# Stream API

**Stream API** в Java позволяет обрабатывать последовательности элементов (например, коллекции) в функциональном стиле.
Stream API введено в Java 8 и является частью Java Collections Framework.

Основной интерфейс Stream предоставляет множество методов для выполнения операций с данными.

### Основные определения:

- **Stream** - последовательность элементов, поддерживающая параллельные и последовательные агрегатные операции.
- **Pipeline** - последовательность операций, выполняемых на потоке данных.
- **Intermediate operation (Промежуточная операция)** - операция, преобразующая поток и возвращающая новый поток, например, `filter`, `map`.
- **Terminal operation (Терминальная операция)** - операция, завершающая работу с потоком и возвращающая результат, например, `collect`, `forEach`.

### Основные методы Stream API:

#### Создание потока:

- `stream()` - создание потока из коллекции.
- `Arrays.stream(T[] array)` - создание потока из массива.
- `Stream.of(T... values)` - создание потока из перечисленных значений.
- `Stream.empty()` - создание пустого потока.
- `Stream.iterate(T seed, UnaryOperator<T> f)` - создание потока с элементами, генерируемыми итеративно.

#### Промежуточные операции:

- `filter(Predicate<T> predicate)` - фильтрация элементов потока.
- `map(Function<T, R> mapper)` - преобразование каждого элемента потока.
- `flatMap(Function<T, Stream<R>> mapper)` - преобразование каждого элемента потока в поток и объединение всех потоков в один.
- `distinct()` - удаление дубликатов.
- `sorted()` - сортировка элементов потока.
- `peek(Consumer<T> action)` - выполнение действия для каждого элемента потока без изменения потока.

#### Терминальные операции:

- `forEach(Consumer<T> action)` - выполнение действия для каждого элемента потока.
- `toArray()` - преобразование потока в массив.
- `reduce(BinaryOperator<T> accumulator)` - агрегация элементов потока с использованием аккумулятора.
- `collect(Collector<T, A, R> collector)` - преобразование потока в другую форму с использованием коллектора.
- `count()` - подсчет количества элементов в потоке.
- `anyMatch(Predicate<T> predicate)` - проверка, удовлетворяет ли хотя бы один элемент потока условию.
- `allMatch(Predicate<T> predicate)` - проверка, удовлетворяют ли все элементы потока условию.
- `noneMatch(Predicate<T> predicate)` - проверка, что ни один элемент потока не удовлетворяет условию.
- `findFirst()` - возврат первого элемента потока.
- `findAny()` - возврат любого элемента потока.

### Особенности Stream API:

1. **Ленивость**: Промежуточные операции ленивы и выполняются только при вызове терминальной операции.
2. **Неизменяемость**: Потоки не изменяют исходные данные.
3. **Параллельная обработка**: Потоки могут обрабатываться параллельно с помощью метода `parallel()`.

### Пример использования Stream API:

```
List<String> list = Arrays.asList("one", "two", "three", "four");
List<String> filteredList = list.stream()
    .filter(s -> s.length() > 3)
    .map(String::toUpperCase)
    .sorted()
    .collect(Collectors.toList());
System.out.println(filteredList);
```


### _P.S._
## `Стримоз`
Это условное заболевание может возникнуть у разработчиков, которые недавно узнали о существовании Stream API.
Основной симптом - необузданное желание использовать Stream API для выполнения любых операций над коллекциями.



<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>

Functional interfaces `Function`, `Predicate`, and `Consumer` are part of Java Lambda Expressions, introduced in Java 8. They play a key role in functional programming in Java, offering convenient ways to process data using lambda expressions and methods that take functional interfaces as parameters.

### Function<T, R>

The `Function<T, R>` interface is intended for operations that take one input parameter of type `T` and return a result of type `R`. This interface has a single abstract method `apply`.

#### `apply` Method:
- **Signature**: `R apply(T t)`
- **Description**: Takes an object of type `T` and returns an object of type `R`.

#### Example of using `Function`:

```
Function<String, Integer> lengthFunction = str -> str.length();
int length = lengthFunction.apply("Hello, World!"); // Returns the length of the string
```

### Consumer<T>

The `Consumer<T>` interface is intended for operations that perform an action on an object of type `T` but do not return any result (void). It contains one abstract method `accept`.

#### `accept` Method:
- **Signature**: `void accept(T t)`
- **Description**: Performs an operation on an object of type `T`.

#### Example of using `Consumer`:

```
Consumer<String> printConsumer = System.out::println;
printConsumer.accept("Hello, World!"); // Prints the string to the console
```

### Predicate<T>

`Predicate<T>` is intended to represent simple functions that take a single argument of type `T` and return a boolean value. This interface is particularly useful for filtering or checking if elements meet certain conditions.

#### Methods of the `Predicate` Interface:

- **`test(T t)`**: This is the primary method of the interface. It evaluates the condition on the provided object and returns `true` or `false`.

- **`and(Predicate<? super T> other)`**: Returns a composite predicate that represents the logical "AND" of this predicate and another predicate `other`.

- **`or(Predicate<? super T> other)`**: Returns a composite predicate that represents the logical "OR" of this predicate and another predicate `other`.

- **`negate()`**: Returns a predicate that is the logical negation ("NOT") of this predicate.

#### Example of using `Predicate`:

```
Predicate<String> isNotEmpty = s -> !s.isEmpty();
boolean result = isNotEmpty.test("Hello, World!"); // Returns true
```

`Predicate`, along with `Function` and `Consumer`, is a key element of functional programming in Java and plays an important role in working with streams and collections, where operations like filtering, mapping, or conditional logic are often required.

### Combining Functional Interfaces

Functional interfaces also provide default methods like `andThen` and `compose` for `Function`, which allow combining multiple functions into a chain. For example:

```
Function<String, String> toUpperCase = String::toUpperCase;
Function<String, String> concatenateExclamation = str -> str + "!";
Function<String, String> combinedFunction = toUpperCase.andThen(concatenateExclamation);

String result = combinedFunction.apply("hello"); // "HELLO!"
```

Similarly, you can use the `andThen` method with the `Consumer` interface to create chains of consumers.

___


# Stream API
**Stream API** in Java allows for processing sequences of elements (for example, collections) in a functional style. Stream API was introduced in Java 8 and is part of the Java Collections Framework. The primary Stream interface provides many methods for data operations.

### Basic Definitions:

- **Stream**: A sequence of elements supporting parallel and sequential aggregate operations.
- **Pipeline**: A sequence of operations performed on a stream of data.
- **Intermediate Operation**: An operation that transforms the stream and returns a new stream, for example, `filter`, `map`.
- **Terminal Operation**: An operation that finishes the processing of the stream and returns a result, for example, `collect`, `forEach`.

### Core Methods of the Stream API:

#### Creating a Stream:

- `stream()`: Creating a stream from a collection.
- `Arrays.stream(T[] array)`: Creating a stream from an array.
- `Stream.of(T... values)`: Creating a stream from enumerated values.
- `Stream.empty()`: Creating an empty stream.
- `Stream.iterate(T seed, UnaryOperator<T> f)`: Creating a stream with iteratively generated elements.

#### Intermediate Operations:

- `filter(Predicate<T> predicate)`: Filtering elements of the stream.
- `map(Function<T, R> mapper)`: Transforming each element of the stream.
- `flatMap(Function<T, Stream<R>> mapper)`: Transforming each element of the stream into a stream and merging all streams into one.
- `distinct()`: Removing duplicates.
- `sorted()`: Sorting elements of the stream.
- `peek(Consumer<T> action)`: Performing an action for each element of the stream without modifying the stream.

#### Terminal Operations:

- `forEach(Consumer<T> action)`: Performing an action for each element of the stream.
- `toArray()`: Converting the stream to an array.
- `reduce(BinaryOperator<T> accumulator)`: Aggregating elements of the stream using an accumulator.
- `collect(Collector<T, A, R> collector)`: Transforming the stream into another form using a collector.
- `count()`: Counting the number of elements in the stream.
- `anyMatch(Predicate<T> predicate)`: Checking if at least one element of the stream satisfies the condition.
- `allMatch(Predicate<T> predicate)`: Checking if all elements of the stream satisfy the condition.
- `noneMatch(Predicate<T> predicate)`: Checking that no elements of the stream satisfy the condition.
- `findFirst()`: Returning the first element of the stream.
- `findAny()`: Returning any element of the stream.

### Features of the Stream API:

1. **Laziness**: Intermediate operations are lazy and are executed only when a terminal operation is called.
2. **Immutability**: Streams do not modify the original data.
3. **Parallel Processing**: Streams can be processed in parallel using the `parallel()` method.

### Example of Using Stream API:

```
List<String> list = Arrays.asList("one", "two", "three", "four");
List<String> filteredList = list.stream()
    .filter(s -> s.length() > 3)
    .map(String::toUpperCase)
    .sorted()
    .collect(Collectors.toList());
System.out.println(filteredList);
```


</details>