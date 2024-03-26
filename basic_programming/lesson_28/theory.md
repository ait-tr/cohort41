## Вложенные классы/внутренние классы
Это классы, которые описаны внутри других классов.

В Java, **вложенные классы** (nested classes) и **внутренние классы** (inner classes) используются для логического группирования классов, которые используются только в одном месте, улучшения инкапсуляции и уменьшения области видимости переменных и других классов.
Вложенные классы могут быть статическими и нестатическими. Нестатические вложенные классы называются внутренними классами.

### Вложенные классы

Вложенные классы делятся на два типа:

1. **Статические вложенные классы** (static nested classes) - используются без ссылки на объект внешнего класса.
2. **Внутренние классы** (inner classes) - включают обычные внутренние классы, локальные классы (определены в блоке кода, например, в методе), анонимные классы (которые не имеют имени класса).

Отличия вложенных и внутренних классов на практике и их использование зависят от конкретных потребностей программы. Вот основные отличия и рекомендации по использованию:

### Отличия

1. **Статические вложенные классы** (Static Nested Classes) не имеют доступа к членам внешнего класса без явной их передачи.
   Они могут быть использованы **независимо** от объекта внешнего класса.

2. **Внутренние классы** (Inner Classes) имеют доступ ко всем переменным и методам внешнего класса, даже если они объявлены как `private`.
   Внутренний класс ассоциируется с экземпляром внешнего класса и не может быть создан без него.

### Можно ли обойтись без них?

Да, можно обойтись без вложенных и внутренних классов, но они предоставляют удобные и мощные средства для структурирования кода и управления областями видимости.
Использование этих классов улучшает читаемость и поддерживаемость кода, позволяя более логично группировать связанные классы и интерфейсы.

### Рекомендации по использованию

1. **Для группировки классов, которые тесно связаны с внешним классом.**
   Например, когда класс используется как вспомогательный только в контексте одного класса, его логично сделать внутренним или вложенным, чтобы подчеркнуть эту связь.

2. **Для инкапсуляции:** Внутренние классы могут скрывать реализацию от внешнего мира, что полезно для инкапсуляции и создания более безопасного кода.

3. **Для реализации интерфейсов в ограниченной области:** Внутренние классы хорошо подходят для создания экземпляров классов, которые должны реализовывать интерфейс или наследовать от другого класса только для использования в ограниченной области.

4. **Когда требуется доступ к внутреннему состоянию внешнего класса:**
   Внутренние классы могут напрямую доступаться к методам и переменным внешнего класса, что может быть полезно для обработки событий или обратных вызовов.

### Альтернативы

- **Агрегация или композиция:** Вместо использования внутренних классов можно передать ссылку на внешний класс в конструктор другого класса.
- **Использование пакетов:** Классы, которые логически связаны, могут быть организованы в одном пакете, предоставляя уровень инкапсуляции через модификаторы доступа, такие как `protected` и пакетно-приватный уровень.

Вложенные и внутренние классы в Java предлагают гибкость при проектировании приложений. Хотя они не всегда необходимы, их использование может значительно упростить некоторые аспекты программирования, особенно когда дело касается инкапсуляции и структурирования кода.

___


Плохой практикой может быть создание вложенных или внутренних классов, если они активно используются вне контекста внешнего класса, так как **основной идеей вложенности является логическая связь и инкапсуляция** в рамках одного внешнего класса.

Рассмотрим, как правильно использовать статические и нестатические вложенные классы внутри внешнего класса.

### Статический вложенный класс

Статический вложенный класс хорошо подходит для ситуаций, когда его функционал тесно связан с внешним классом, но не требует доступа к экземпляру этого внешнего класса.
Пример использования во внешнем классе:

```
class OuterClass {
    static class NestedStaticClass {
        static void staticMethod() {
            System.out.println("Статический метод вложенного статического класса");
        }
        
        void nonStaticMethod() {
            System.out.println("Не статический метод вложенного статического класса");
        }
    }
    
    void useNestedStaticClass() {
        NestedStaticClass.staticMethod(); // Вызов статического метода
        
        NestedStaticClass nestedObject = new NestedStaticClass();
        nestedObject.nonStaticMethod(); // Вызов нестатического метода
    }
    
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.useNestedStaticClass();
    }
}
```

### Нестатический вложенный (внутренний) класс

Нестатические вложенные классы используются, когда есть необходимость в доступе к членам внешнего класса.
Они идеально подходят для реализации вспомогательных классов, работающих с внутренним состоянием внешнего класса.

```
class OuterClass {
    private String outerField = "Внешнее поле";
    
    class InnerClass {
        void accessOuter() {
            System.out.println("Доступ к полю внешнего класса: " + outerField);
        }
    }
    
    void useInnerClass() {
        InnerClass inner = new InnerClass();
        inner.accessOuter(); // Использование внутреннего класса для доступа к полям внешнего класса
    }
    
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.useInnerClass();
    }
}
```

В этих примерах видно, что вложенные классы используются непосредственно внутри внешнего класса, что подчеркивает их логическую связь и взаимодействие.

Статические вложенные классы хороши для реализации компонентов, которые могут функционировать независимо, но логически принадлежат внешнему классу.

А нестатические вложенные классы (внутренние классы) идеально подходят для работы с внутренним состоянием внешнего класса.

___

## Двусвязные списки

Представьте себе поезд, где каждый вагон — это элемент списка. Каждый вагон связан с предыдущим и следующим вагоном. В каждом вагоне есть:

- Место для хранения пассажира (данные элемента).
- Дверь, ведущая к предыдущему вагону.
- Дверь, ведущая к следующему вагону.

Первый вагон (головной элемент списка) имеет дверь, ведущую только вперед, а последний вагон (хвостовой элемент списка) — только назад.

### Отличие от массива

- **Массивы** — это непрерывные блоки памяти, где каждый элемент располагается рядом с другим. Если вы хотите добавить или удалить элемент из середины массива, вам придется "перемещать" все последующие элементы.

- **Связные списки** не требуют непрерывного блока памяти. Элементы могут быть разбросаны по разным участкам памяти, но связаны между собой указателями (в нашей аналогии — дверьми между вагонами). Это делает вставку или удаление элемента из середины списка более быстрой операцией по сравнению с массивами.

### Преимущества и недостатки


- **Преимущества:**
    - Динамический размер (не требует предварительного объявления размера, как массив).
    - Быстрая вставка или удаление из середины списка (в отличие от массивов).

- **Недостатки:**
    - Занимают больше памяти из-за хранения дополнительных указателей на предыдущий и следующий элементы.
    - Последовательный доступ к элементам (для доступа к элементу необходимо пройти через все предыдущие элементы).
    - Нет прямого доступа к произвольному элементу (как в массиве).

 
**Двусвязные списки — это лишь одна из структур данных**, и в разных задачах может потребоваться использование разных структур. Но понимание основ работы со списками даст вам хорошую основу для изучения других структур данных и алгоритмов


### Практическое упражнение
**Задача:** Создать базовую реализацию двусвязного списка для понимания его внутреннего устройства и методов работы.

- Задача минимум: Реализовать следующие методы:
  - `add(T value)` - добавить элемент в конец списка.
  - `add(int index, T value)` - добавить элемент в указанную позицию.
  - `remove(int index)` - удалить элемент из указанной позиции.
  - `get(int index)` - получить элемент из указанной позиции.
  - `size()` - получить количество элементов в списке.
  - `isEmpty()` - проверить, пуст ли список.
  - `clear()` - очистить список.





<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>

Nested classes, also known as inner classes, are classes defined within other classes in Java.

In Java, **nested classes** (nested classes) and **inner classes** (inner classes) are used for logical grouping of classes that are only used in one place, improving encapsulation, and reducing the visibility scope of variables and other classes. Nested classes can be static and non-static. Non-static nested classes are called inner classes.

### Nested Classes

Nested classes are divided into two types:

1. **Static nested classes** - used without a reference to an external class object.
2. **Inner classes** - include regular inner classes, local classes (defined in a block of code, such as in a method), and anonymous classes (which do not have a class name).

The differences between nested and inner classes in practice and their use depend on the specific needs of the program. Here are the main differences and recommendations for use:

### Differences

1. **Static Nested Classes** do not have access to the members of the outer class without their explicit transfer. They can be used **independently** of an object of the outer class.

2. **Inner Classes** have access to all variables and methods of the outer class, even if they are declared as `private`. An inner class is associated with an instance of the outer class and cannot be created without it.

### Can We Do Without Them?

Yes, it is possible to do without nested and inner classes, but they provide convenient and powerful means for structuring code and managing visibility scopes. Using these classes improves code readability and maintainability by more logically grouping related classes and interfaces.

### Recommendations for Use

1. **For grouping classes that are closely related to the outer class.** For example, when a class is used as auxiliary only in the context of one class, it makes sense to make it an inner or nested class to underscore this connection.

2. **For encapsulation:** Inner classes can hide the implementation from the outside world, which is useful for encapsulation and creating more secure code.

3. **For implementing interfaces in a limited area:** Inner classes are well suited for creating class instances that must implement an interface or inherit from another class only for use in a limited area.

4. **When access to the internal state of the outer class is required:** Inner classes can directly access the methods and variables of the outer class, which can be useful for handling events or callbacks.

### Alternatives

- **Aggregation or composition:** Instead of using inner classes, you can pass a reference to the outer class in the constructor of another class.
- **Using packages:** Classes that are logically related can be organized in one package, providing a level of encapsulation through access modifiers such as `protected` and package-private level.

Nested and inner classes in Java offer flexibility in designing applications. Although they are not always necessary, their use can significantly simplify some aspects of programming, especially when it comes to encapsulation and structuring code.


<hr>
<hr>


## Doubly Linked Lists

Imagine a train where each carriage is an element of the list. Each carriage is connected to the previous and next one. In each carriage there is:

- A place to store a passenger (the element's data).
- A door leading to the previous carriage.
- A door leading to the next carriage.

The first carriage (head of the list) has a door only leading forward, while the last carriage (tail of the list) only leads backward.

### Difference from an array

- **Arrays** are continuous memory blocks where each element is next to the other. If you want to add or remove an element from the middle of the array, you'll need to "move" all the subsequent elements.

- **Linked Lists** don't require a continuous block of memory. Elements can be scattered throughout different memory areas but are connected via pointers (in our analogy - doors between carriages). This makes inserting or deleting an element from the middle of the list a faster operation compared to arrays.

### Pros and Cons

- **Pros:**
    - Dynamic size (doesn't require size declaration upfront as arrays do).
    - Quick insertion or removal from the middle of the list (unlike arrays).

- **Cons:**
    - Consumes more memory because of the storage of additional pointers to previous and next elements.
    - Sequential access to elements (to access an element, you have to go through all previous elements).
    - No direct access to a random element (as in arrays).

**Doubly Linked Lists are just one of the data structures,** and different tasks may require using different structures. But understanding the basics of working with lists will give you a solid foundation for studying other data structures and algorithms.

### Practical Exercise
**Task:** Create a basic implementation of a doubly-linked list to understand its internal structure and working methods.

- Minimum code.task requirements: Implement the following methods:
    - `add(T value)` - add an element to the end of the list.
    - `add(int index, T value)` - add an element to the specified position.
    - `remove(int index)` - delete an element from the specified position.
    - `get(int index)` - retrieve an element from the specified position.
    - `size()` - get the number of elements in the list.
    - `isEmpty()` - check if the list is empty.
    - `clear()` - clear the list.

</details>