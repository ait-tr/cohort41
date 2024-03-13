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