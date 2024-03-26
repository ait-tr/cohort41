## Цикл for

Цикл **for** является наиболее распространённым циклом в программировании, поэтому его следует изучить. Цикл for проводит инициализацию перед первым шагом цикла. Затем выполняется проверка условия цикла, и в конце каждой итерации происходит изменение управляющей переменной.

```
for(<начальная точка>; <условие выхода>; <изменение счетчика>) {
	// Тело цикла
}
```

Пример перебора цифр от 0 до 5 и вывод каждой в консоль:
```
for(int i = 0; i < 5; i++) {
   System.out.println(i);
}
```

Счетчик цикла не обязательно должен быть целочисленным. Вполне допустим, например, тип double. И даже тип String:\

```
 for (String str = "Hello"; str.length() < 10; str = str + "1") {
      System.out.println(str);
  }
```

Такой счетчик цикла допустим, но практически не используется. За ненадобностью.

Все три блока <начальная точка>; <условие выхода>; <изменение счетчика> - не обязательны.
Программа вполне себе скомпилируется и запустит бесконечный цикл:

```
for( ; ; ){
    System.out.println("Hello");
}
```

Если при обработке цикла нужно его прервать, используйте оператор `break`, который останавливает работу текущего тела цикла.
Все последующие итерации также пропускаются

Оператор `continue` завершает текущую итерацию цикла и переходит к следующей.


___
## Методы
**Методы** в Java — это законченная последовательность действий (инструкций), направленных на решение отдельной задачи

```
[модификаторы] типВозвращаемогоЗначения   названиеМетода ([параметры]){
    // тело метода
}
```
_Модификаторы и параметры необязательны_

- Каждый java-метод должен быть внутри класса 
- Статические методы принадлежат классу, а не статические методы принадлежат объектам, экземплярам класса 
- В пределах одного класса может быть два и более метода с одинаковыми именами, но разным набором параметров (**перегрузка метода**)

**Сигнатура** метода - совокупность имени метода с набором параметров. Причем возвращаемое значение не входит в сигнатуру, а порядок следования параметров - входит


```
    void myMethod(){
        System.out.println("I am a simple method");
    }
```
Пример метода без модификаторов (вернее сказать с модификаторами по умолчанию) и без параметров.\


<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>



## The "for" Loop
The **for** loop is the most commonly used loop in programming, so it's crucial to understand. The **for** loop performs initialization before the first loop step. Then, it checks the loop condition, and at the end of each iteration, the control variable is modified.
```
for (<initialization>; <exit condition>; <counter modification>) {
    // Loop body
}
```

Example of iterating through numbers from 0 to 5 and printing each one to the console:
```
for(int i = 0; i < 5; i++) {
   System.out.println(i);
}
```

The loop counter doesn't necessarily have to be an integer. It's perfectly acceptable, for instance, to use the double type. Even the String type can be used:

```
 for (String str = "Hello"; str.length() < 10; str = str + "1") {
      System.out.println(str);
  }
```

While such a loop counter is permissible, it's rarely used due to its impracticality.

All three blocks, <initialization>; <exit condition>; <counter modification>, are not mandatory. A program will successfully compile and run with an infinite loop:
```
for( ; ; ){
    System.out.println("Hello");
}
```

If you need to interrupt a loop's processing, use the `break` statement, which stops the execution of the current loop body. All subsequent iterations are also skipped.

The `continue` statement terminates the current iteration of the loop and proceeds to the next one.

___

## Methods
**Методы** в Java — это законченная последовательность действий (инструкций), направленных на решение отдельной задачи

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
