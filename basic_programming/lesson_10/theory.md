## Методы

Метод в программировании, в том числе и в Java, можно описать как набор инструкций, группируемых вместе для выполнения
определенной задачи. Каждый метод имеет имя, и когда мы хотим использовать этот набор инструкций, мы "**вызываем**"
метод, обращаясь к нему по этому имени.

```
[модификаторы] типВозвращаемогоЗначения   названиеМетода ([параметры]){
    // тело метода
}
```

_Модификаторы и параметры необязательны_

<img src="https://raw.githubusercontent.com/ait-tr/cohort41/main/basic_programming/lesson_10/img/Methods.jpeg" width="100%">

- Каждый java-метод должен быть внутри класса
- Статические методы принадлежат классу, а не статические методы принадлежат объектам, экземплярам класса
- В пределах одного класса может быть два и более метода с одинаковыми именами, но разным набором параметров (*
  *перегрузка метода**)

**Сигнатура** метода - совокупность имени метода с набором параметров.
Причем возвращаемое значение не входит в сигнатуру, а порядок следования параметров - входит

```
    void myMethod(){
        System.out.println("I am a simple method");
    }
```

Пример метода без модификаторов (вернее сказать с модификаторами по умолчанию) и без параметров.\

### Методы с параметрами

Теперь добавим параметры к методу. Параметры - это данные, которые вы передаете в метод, чтобы он мог использовать их в
своих инструкциях.

Пример метода с параметрами:

```
public class MyClass {
    // Метод с параметром
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
    printMessage("Это сообщение было передано в метод как параметр."); // Вызов метода с параметром
    }
}
```

Здесь `printMessage` принимает один параметр `message` типа `String`. Метод выводит переданное сообщение.

<img src="https://raw.githubusercontent.com/ait-tr/cohort41/main/basic_programming/lesson_10/img/methodsMemory.jpeg" width="100%">



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
- Within the same class, there can be two or more methods with the same name but a different set of parameters (**method
  overloading**).

The **signature** of a method is the combination of its name and the set of parameters. The return value is not part of
the signature, but the order of parameters is included.

```
    void myMethod(){
        System.out.println("I am a simple method");
    }
```

Here's an example of a method without modifiers (or rather, with default modifiers) and without parameters.


</details>
