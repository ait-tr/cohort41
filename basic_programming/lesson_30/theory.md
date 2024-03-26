## Архитектура приложения

Сегодня мы поговорим о **слоистой архитектурой** (Layered Architecture) или **многоуровневой архитектурой** (Multi-tier Architecture). 

В такой архитектуре приложение разделяется на отдельные слои, каждый из которых имеет свою специфическую роль и ответственность.
Это разделение позволяет упростить разработку и тестирование приложений, а также повысить их масштабируемость, безопасность и удобство поддержки.

Ключевые характеристики слоистой архитектуры:

- **Изолированность слоев**: Каждый слой фокусируется на выполнении своей конкретной задачи и взаимодействует только со слоями, непосредственно предшествующим или последующим ему. Это обеспечивает четкое разделение ответственности между компонентами системы.
- **Абстракция**: Верхние слои не знают деталей реализации нижних слоев, что позволяет изменять реализацию нижних слоев без влияния на верхние.
- **Взаимозаменяемость и масштабируемость**: Благодаря четкому разделению слоев можно легко заменять или масштабировать отдельные части системы, не затрагивая остальные.
- **Удобство в тестировании и поддержке**: Каждый слой можно тестировать отдельно от других, что упрощает процесс разработки и поддержки приложения.

### О слоях
Приложение, как минимум, должно иметь следующие слои:

1. **Слой моделей (Model Layer)**:
  - Определение основных сущностей: `Пользователь`, `Товар`, `Заказ` и т.д.
  - Определение атрибутов каждой сущности и методов доступа.

2. **Слой репозитория (Repository Layer)**:
  - Отвечает за прямую работу с данными. В этом слое организовывается возможность сохранять, получать, изменять или удалять данные.
  - Методы для добавления, удаления, обновления и извлечения данных.

3. **Сервисный слой (Service Layer)**:
  - Содержит бизнес-логику приложения.
  - Методы, такие как `добавитьТовар`, `создатьЗаказ`, `зарегистрироватьПользователя` и т.д.
  - Взаимодействует со слоем репозитория для доступа к данным.

4. **Презентационный слой (Presentation Layer)**:
  - Отвечает за взаимодействие с пользователем, отображение информации и обработку пользовательского ввода.

### Важность последовательности обращений между слоями
Особое внимание следует уделить тому, что запросы из презентационного слоя должны обязательно проходить через сервисный слой для обращения к данным.
Это ключевой момент в обеспечении безопасности, абстракции и целостности архитектуры приложения. 

Такая последовательность обращений гарантирует, что все операции с данными происходят в соответствии с бизнес-логикой и правилами безопасности, установленными в сервисном слое. 

Прямое обращение из презентационного слоя к слою репозитория минуя сервисный слой нарушает принципы разделения ответственности и может привести к уязвимостям в безопасности, ошибкам в обработке данных и нарушениям в бизнес-процессах.

---

## Enums в Java

### Что такое Enums?
- Специальный тип данных, который позволяет переменной быть набором предварительно определенных значений.

**Основная цель Enums:**
- Обеспечивать типобезопасность и снижать количество ошибок.

---

### Создание Enums:
```
public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
```

### Использование Enums:
```
Day today = Day.MONDAY;
switch(today) {
    case MONDAY:
        System.out.println("Today is Monday.");
        break;
    // ... другие дни
}
```

---

## 3. Продвинутые возможности Enums

### Конструкторы и методы:
```
public enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6);
    // ... другие планеты

    private final double mass;
    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
}
```

### Встроенные методы:
- `values()`: Возвращает массив, содержащий список констант Enum.
- `valueOf(String name)`: Возвращает константу Enum с указанным именем.

### Перечисление через цикл:
```
for (Day day : Day.values()) {
    System.out.println(day);
}
```

---

## 4. Сравнение Enums

### Сравнение с использованием `==` и `equals()`:
- Для сравнения двух значений Enum можно безопасно использовать оператор `==`.

### Метод `ordinal()`:
- Возвращает порядковый номер константы (начиная с нуля).

---

### EnumSet:
- Специализированный набор для работы с enums.
```
EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
```

### EnumMap:
- Специализированная карта для ключей типа Enum.
```
EnumMap<Day, String> dayActivityMap = new EnumMap<>(Day.class);
dayActivityMap.put(Day.MONDAY, "Work");
```

---
### Преимущества использования Enums:
- Типобезопасность.
- Читаемость кода.
- Возможность группировки связанных констант.


<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>

## Application Architecture

Today, we're going to discuss **Layered Architecture** or **Multi-tier Architecture**.

In such an architecture, an application is divided into separate layers, each with its specific role and responsibility. This separation simplifies the development and testing of applications, as well as enhances their scalability, security, and maintenance ease.

Key characteristics of layered architecture:

- **Layer Isolation**: Each layer focuses on performing its specific code.task and interacts only with the layer directly preceding or following it. This ensures a clear separation of responsibilities between the system's components.
- **Abstraction**: Upper layers are unaware of the implementation details of lower layers, allowing changes to the implementation of lower layers without affecting the upper ones.
- **Interchangeability and Scalability**: Thanks to the clear separation of layers, individual parts of the system can be easily replaced or scaled without affecting the rest.
- **Ease of Testing and Maintenance**: Each layer can be tested independently from the others, simplifying the development process and application maintenance.

### About the Layers
An application should, at a minimum, have the following layers:

1. **Model Layer**:
    - Definition of main entities: `User`, `Product`, `Order`, etc.
    - Definition of attributes for each entity and access methods.

2. **Repository Layer**:
    - Responsible for direct data manipulation. This layer organizes the ability to save, retrieve, modify, or delete data.
    - Methods for adding, removing, updating, and extracting data.

3. **Service Layer**:
    - Contains the application's business logic.
    - Methods such as `addProduct`, `createOrder`, `registerUser`, etc.
    - Interacts with the repository layer to access data.

4. **Presentation Layer**:
    - Responsible for user interaction, displaying information, and handling user input.

### Importance of Layer Sequence in Accessing Data
It's crucial that requests from the presentation layer must always pass through the service layer to access the data.
This key aspect ensures that all data operations occur in accordance with the business logic and security rules set in the service layer.

Direct access from the presentation layer to the repository layer, bypassing the service layer, violates the principles of responsibility separation and can lead to security vulnerabilities, data processing errors, and business process breaches.

---

## Enums in Java
### What are Enums?
- A special data type that allows a variable to be a set of predefined constants.

**Main Purpose of Enums:**
- To provide type safety and reduce the number of errors.

---

### Creating Enums:
```
public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
```

### Using Enums:
```
Day today = Day.MONDAY;
switch(today) {
    case MONDAY:
        System.out.println("Today is Monday.");
        break;
    // ... other days
}
```

---

## 3. Advanced Features of Enums

### Constructors and Methods:
```
public enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6);
    // ... other planets

    private final double mass;
    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
}
```

### Built-in Methods:
- `values()`: Returns an array containing the list of Enum constants.
- `valueOf(String name)`: Returns the Enum constant of the specified name.

### Iterating through Enums:
```
for (Day day : Day.values()) {
    System.out.println(day);
}
```

---

## 4. Comparing Enums

### Comparison Using `==` and `equals()`:
- You can safely use the `==` operator to compare two Enum values.

### The `ordinal()` Method:
- Returns the ordinal number of the constant (starting from zero).

---

### EnumSet:
- A specialized set for use with enum types.
```
EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
```

### EnumMap:
- A specialized map for use with enum keys.
```
EnumMap<Day, String> dayActivityMap = new EnumMap<>(Day.class);
dayActivityMap.put(Day.MONDAY, "Work");
```

---
### Advantages of Using Enums:
- Type safety.
- Code readability.
- The ability to group related constants.

</details>