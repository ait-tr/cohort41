## Методы
Метод в программировании, в том числе и в Java, можно описать как набор инструкций, группируемых вместе для выполнения определенной задачи. Каждый метод имеет имя, и когда мы хотим использовать этот набор инструкций, мы "**вызываем**" метод, обращаясь к нему по этому имени.

```
[модификаторы] типВозвращаемогоЗначения   названиеМетода ([параметры]){
    // тело метода
}
```
_Модификаторы и параметры необязательны_

<img src="https://raw.githubusercontent.com/ait-tr/cohort41/main/basic_programming/lesson_10/img/Methods.jpeg" width="100%">


- Каждый java-метод должен быть внутри класса
- Статические методы принадлежат классу, а не статические методы принадлежат объектам, экземплярам класса
- В пределах одного класса может быть два и более метода с одинаковыми именами, но разным набором параметров (**перегрузка метода**)

**Сигнатура** метода - совокупность имени метода с набором параметров.
Причем возвращаемое значение не входит в сигнатуру, а порядок следования параметров - входит


```
    void myMethod(){
        System.out.println("I am a simple method");
    }
```

Пример метода без модификаторов (вернее сказать с модификаторами по умолчанию) и без параметров.\

---

## Перегрузка методов

Перегрузка методов в Java (Method Overloading) – это возможность создавать несколько методов в одном классе с одинаковым именем, но с разными параметрами. Основные моменты перегрузки методов:

1. **Разные Сигнатуры:** Перегруженные методы должны иметь разные сигнатуры, то есть они должны отличаться количеством параметров, типами параметров или их порядком.

2. **Тот же Класс:** Перегрузка методов происходит в рамках одного класса.

3. **Возвращаемый Тип:** Возвращаемый тип может быть одинаковым или различным для перегруженных методов, но только изменение возвращаемого типа без изменения сигнатуры параметров не считается перегрузкой.

4. **Вызов на Этапе Компиляции:** Перегрузка методов разрешается на этапе компиляции (Static Polymorphism) на основе сигнатуры метода, которая вызывается.

Пример перегрузки методов:

```
public class Example {
    // Первый метод с одним параметром
    void demo(int a) {
        // Код метода
    }

    // Перегруженный метод с двумя параметрами
    void demo(int a, int b) {
        // Код метода
    }

    // Еще один перегруженный метод с параметрами разного типа
    double demo(double a) {
        // Код метода
        return a*a;
    }
}
```

Здесь метод `demo` перегружен три раза: первый метод принимает один целочисленный параметр, второй – два целочисленных параметра, а третий – один параметр типа double. Какой метод будет вызван, определяется типами и количеством аргументов, переданных при вызове метода.

---

### Методы с возвращаемым значением

Методы также могут возвращать значения.
Это полезно, когда метод должен произвести какой-то расчет или обработку данных и вернуть результат.

Пример метода с возвращаемым значением:

```
public class MyClass {
    // Метод, который возвращает результат сложения двух чисел
    public static int addNumbers(int number1, int number2) {
        int sum = number1 + number2;
        return sum; // Возврат значения
    }

    public static void main(String[] args) {
        int result = addNumbers(5, 10); // Вызов метода и сохранение возвращаемого значения
        System.out.println("Сумма: " + result);
    }
}
```

В этом примере `addNumbers` принимает два параметра (числа) и возвращает их сумму.
Возвращаемый тип `int` указывается перед именем метода.


<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>


## Methods

**Methods** in Java are a complete sequence of actions (instructions) aimed at solving a specific code.task.

```
[modifiers] returnType methodName ([parameters]) {
    // method body
}
```
_Modifiers and parameters are optional_

- Every Java method must be inside a class.
- Static methods belong to the class, while non-static methods belong to objects, instances of the class.
- Within the same class, there can be two or more methods with the same name but a different set of parameters (**method overloading**).

The **signature** of a method is the combination of its name and the set of parameters. The return value is not part of the signature, but the order of parameters is included.

```
    void myMethod(){
        System.out.println("I am a simple method");
    }
```
Here's an example of a method without modifiers (or rather, with default modifiers) and without parameters.


</details>
