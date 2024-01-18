## Представление информации в компьютере
Вся информация, которая хранится в компьютере записана в двоичном коде. То есть, как вы уже знаете, в последовательности 0 и 1. Бит (bit) — это самая маленькая единица в системе измерения информации. Само слово bit пришло к нам как аббревиатура от binary digit — двоичное число.

В 1956 году Владимир Бухгольц ввёл ещё одну единицу измерения — Байт, как пучок из 8 бит.
Вот наглядный пример байта в двоичной системе:

```
01001101
10011010
10001001
```

Итак, **1 Байт = 8 Битам**; Байт представляет собой комбинацию из 8 цифр, каждая из которых может быть либо единицей, либо нулем. Всего получается 256 комбинаций.

Представление числа в двоичной системе счисления, при котором первый (старший) разряд отводится под знак числа. Если число положительное, то в левый разряд записывается 0; если число отрицательное, то в левый разряд записывается 1. (Прямой код)

Существуют еще обратный и дополнительный код.



[Что такое дополнительный код / What is two's complement](https://ru.wikipedia.org/wiki/%D0%94%D0%BE%D0%BF%D0%BE%D0%BB%D0%BD%D0%B8%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D1%8B%D0%B9_%D0%BA%D0%BE%D0%B4 "Википедия")

## Переменные и Типы Данных 

Переменные не что иное, как зарезервированные места памяти для хранения значений. Это означает, что при создании переменной Вы резервируете некоторое пространство в памяти.

Основываясь на типе данных, который присвоен переменной, операционная система выделяет память и решает, что может быть сохранено в зарезервированную памяти. Поэтому, назначая различные типы данных для переменных, в Java можно хранить целые числа, десятичные дроби или символов в этих переменных.

На основе типа данных, назначенного переменной, операционная система выделяет память и определяет, какие данные могут быть сохранены в этой зарезервированной памяти. Таким образом, присваивая различные типы данных переменным в Java, вы можете хранить целые числа, десятичные дроби или символы в этих переменных.

В Java существуют два типа данных:

1. **Примитивные Типы Данных:** Эти типы данных представляют базовые значения и объявляются с использованием ключевых слов. В Java предопределены 8 примитивных типов данных.

2. **Ссылочные Типы Данных (Ссылки/Объекты):** Эти типы данных представляют объекты, которые могут иметь методы и свойства. Они используются для создания более сложных структур данных.

В Java есть 8 примитивных типов данных, которые подразделяются на четыре группы:

1. Целочисленные типы: `byte`, `short`, `int`, `long`
2. Вещественные типы (с плавающей точкой): `float`, `double`
3. Символьный тип: `char`
4. Логический тип: `boolean`

- **byte:** целые числа от -128 до 127
- **short:** целые числа от -32,768 до 32,767
- **int:** целые числа от -2^31 до 2^31 - 1
- **long:** целые числа от -2^63 до 2^63 - 1
- **float:** числа с плавающей запятой одинарной точности
- **double:** числа с плавающей запятой двойной точности
- **char:** символ Unicode
- **boolean:** логическое значение `true` или `false`

Переменные и типы данных играют важную роль в языке Java, позволяя вам эффективно управлять данными в ваших программах.

### Арифметические Операции
- **Сложение (+):** `int a = 5; int b = 3; int sum = a + b;`
- **Вычитание (-):** `int diff = a - b;`
- **Умножение (*):** `int prod = a * b;`
- **Деление (/):** `int quot = a / b;` (обратите внимание на целочисленное деление)
- **Остаток от деления (%):** `int rem = a % b;`
- **Инкремент (++) и Декремент (--):** `a++; b--;`

### Преобразование Типов (Type Casting)
- **Неявное преобразование:** Происходит автоматически, когда меньший тип преобразуется в больший, например, `int` в `long`.
- **Явное преобразование:** Необходимо, когда больший тип данных преобразуется в меньший, например, `double` в `int`. Пример: `int x = (int) 5.99;`

### Особенности Работы с Разными Типами
- **Переполнение и потеря точности:** Например, при сложении двух очень больших `int` может произойти переполнение.
- **Работа с плавающей точкой:** Операции с `float` и `double` могут иметь проблемы с точностью из-за представления чисел с плавающей точкой.

### Лучшие Практики
- При работе с разными типами данных всегда учитывайте возможное переполнение и потерю точности.
- Используйте явное преобразование типов, чтобы избежать неожиданных результатов, особенно при работе с вещественными числами.
- Понимайте разницу между целочисленным делением и делением с плавающей точкой.


<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>


## 01. Data Representation in Computers

All the information stored in a computer is represented in binary code. As you already know, this means it's represented in sequences of 0s and 1s. A **bit** is the smallest unit in the measurement of information. The term "bit" comes from "binary digit" — a binary number.

In 1956, Vladimir Buchholz introduced another unit of measurement — the **byte**, which is a bundle of 8 bits. Here's a visual example of a byte in binary:

```
01001101
10011010
10001001
```

So, **1 Byte = 8 Bits**. A byte consists of a combination of 8 digits, each of which can be either 1 or 0. In total, there are 256 possible combinations.

Representation of numbers in the binary numeral system also includes a sign bit. If the number is positive, a 0 is placed in the leftmost bit; if the number is negative, a 1 is placed in the leftmost bit. This representation method is called the **sign-and-magnitude representation**. Additionally, there are other representations such as the ones' complement and two's complement used for representing negative numbers.


## Variables and Data Types

Variables are reserved memory locations for storing values. This means that when you create a variable, you're reserving a specific space in memory.

Based on the data type assigned to a variable, the operating system allocates memory and determines what kind of data can be stored in that reserved memory. So, by assigning different data types to variables in Java, you can store integers, decimals, or characters in those variables.

In Java, there are two types of data:

1. **Primitive Data Types:** These data types represent basic values and are declared using keywords. There are 8 primitive data types predefined in Java.

2. **Reference Data Types (References/Objects):** These data types represent objects that can have methods and properties. They are used to create more complex data structures.

The primary primitive data types supported by Java include:

- **byte:** integers from -128 to 127
- **short:** integers from -32,768 to 32,767
- **int:** integers from -2^31 to 2^31 - 1
- **long:** integers from -2^63 to 2^63 - 1
- **float:** single-precision floating-point decimals
- **double:** double-precision floating-point decimals
- **char:** Unicode character
- **boolean:** logical value of `true` or `false`

Variables and data types play a crucial role in the Java language, enabling you to effectively manage data in your programs.

### Arithmetic Operations
- **Addition (+):** `int a = 5; int b = 3; int sum = a + b;`
- **Subtraction (-):** `int diff = a - b;`
- **Multiplication (*):** `int prod = a * b;`
- **Division (/):** `int quot = a / b;` (note integer division)
- **Modulus (%):** `int rem = a % b;`
- **Increment (++) and Decrement (--):** `a++; b--;`

### Type Casting
- **Implicit Casting:** Occurs automatically when a smaller type is converted into a larger type, for example, `int` to `long`.
- **Explicit Casting:** Necessary when a larger data type is converted into a smaller type, e.g., `double` to `int`. Example: `int x = (int) 5.99;`

### Features of Working with Different Types
- **Overflow and Precision Loss:** For instance, adding two very large `int` values may result in overflow.
- **Working with Floating Point:** Operations with `float` and `double` can have precision issues due to the representation of floating-point numbers.

### Best Practices
- When working with different data types, always consider the potential for overflow and loss of precision.
- Use explicit type casting to avoid unexpected outcomes, especially when working with real numbers.
- Understand the difference between integer division and floating-point division.


</details>
