## Class String
Для работы со строками в Java существует класс String, который предоставляет ряд методов для манипуляции строками. Строка представляет собой последовательность символов.

Ввиду того, что мы (люди) общаемся с помощью слов (иначе говоря – строк), класс String используется в приложениях очень часто и умение работать с ним корректно и эффективно является крайне важным.

При работе со строками важно понимать, что объект String является неизменяемым (immutable). То есть при любых операциях над строкой, которые изменяют эту строку, фактически будет создаваться новая строка.

Физически объект String представляет собой **ссылку на область в памяти**, в которой размещены символы.

### Некоторый методы класса String для работы со строками:

- length(): возвращает длину строки 
- substring(): возвращает подстроку, начиная с определенного индекса до конца или до определенного индекса 
- toLowerCase(): переводит все символы строки в нижний регистр 
- toUpperCase(): переводит все символы строки в верхний регистр 
- valueOf(): преобразует объект в строковый вид 
- charAt(): возвращает символ строки по индексу 
- regionMatches(): сравнивает подстроки в строках 
- indexOf(): находит индекс первого вхождения подстроки в строку 
- lastIndexOf(): находит индекс последнего вхождения подстроки в строку 
- replace(): заменяет в строке одну подстроку на другую
- toCharArray(): можно обратно преобразовать строку в массив символов 
- isEmpty(): (boolean) является ли строка пустой 
- equals(): сравнивает строки с учетом регистра 
- equalsIgnoreCase(): сравнивает строки без учета регистра 
- сompareTo(): сравнивает две строки 
- startsWith(): определяет, начинается ли строка с подстроки 
- endsWith(): определяет, заканчивается ли строка на определенную подстроку 
- getChars(): возвращает группу символов 
- trim(): удаляет начальные и конечные пробелы 
- concat(): объединяет строки 
- join(): соединяет строки с учетом разделителя


Документация Oracle / Oracle documentation. [Все методы класса String / All methods of class String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html "Oracle documentation")

___

## Тип boolean
**Логическое высказывание** – это повествовательное предложение, относительно которого можно однозначно сказать, истинно оно или ложно

**Условные выражения** представляют собой некоторое условие и возвращают значение типа boolean, то есть значение **true** (если условие истинно), или значение **false** (если условие ложно).
К условным выражениям относятся операции сравнения и логические операции

**Операции сравнения**
В операциях сравнения сравниваются два операнда, и возвращается значение **типа boolean** - true, если выражение верно, и false, если выражение неверно.

```
== сравнивает два операнда на равенство
!= сравнивает два операнда на неравенство
< меньше чем
> больше чем
<= меньше или равно
>= больше или равно
```

### Логические операции
Также в Java есть логические операции, которые также представляют условие и возвращают **true** или **false** и, как правило, объединяют несколько операций сравнения.

- `!` Логическое НЕ (отрицания, NOT) - !x означает “не x”. Меняет значение на противоположное
- `&` Логическое И (AND) - Возвращает true если оба операнда равны true.
- `|` Логическое ИЛИ (OR) - Возвращает true если хотя бы один из операндов равен true.
- `^`  Логическое исключающее ИЛИ (XOR) - По сути, возвращает true, если операнды — разные.
- `&&` Условное И (сокращенное логическое И) - По возвращаемому результату же самое, что &, но, есть нюансы
- `||` Условное ИЛИ (сокращенное логическое ИЛИ) - По возвращаемому результату же самое, что и |, но, есть нюансы

**Приоритет логических операций**
Как и в математике, в программировании у операторов есть определённый порядок выполнения, если они встречаются в одном выражении

1. `!`
2. `&`
3. `^`
4. `|`
5. `&&`
6. `||`

Если одинаковые операции стоят по соседству, то раньше выполняется та, что левее.


<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>

## Class String

In Java, the `String` class is used for working with strings and provides a set of methods for string manipulation. A string is a sequence of characters.

Given that we (humans) communicate using words (in other words - strings), the `String` class is used very often in applications, and the ability to work with it correctly and efficiently is crucial.

When working with strings, it's important to understand that a `String` object is immutable. This means that any operations on a string that appear to modify it will actually create a new string.

Physically, a `String` object represents a **reference to a memory area** where characters are stored.

___
## String Class Methods

- `length()`: Returns the length of the string.
- `substring()`: Returns a substring starting from a specified index to the end or up to a specified index.
- `toLowerCase()`: Converts all characters in the string to lowercase.
- `toUpperCase()`: Converts all characters in the string to uppercase.
- `valueOf()`: Converts an object to its string representation.
- `charAt()`: Returns the character at a specific index in the string.
- `regionMatches()`: Compares substrings within strings.
- `indexOf()`: Finds the index of the first occurrence of a substring in the string.
- `lastIndexOf()`: Finds the index of the last occurrence of a substring in the string.
- `replace()`: Replaces one substring with another in the string.
- `toCharArray()`: Converts a string back into an array of characters.
- `isEmpty()`: Returns `true` if the string is empty.
- `equals()`: Compares strings considering case sensitivity.
- `equalsIgnoreCase()`: Compares strings without considering case.
- `compareTo()`: Compares two strings.
- `startsWith()`: Determines if a string starts with a specified substring.
- `endsWith()`: Determines if a string ends with a specific substring.
- `getChars()`: Returns a group of characters.
- `trim()`: Removes leading and trailing whitespaces.
- `concat()`: Concatenates strings.
- `join()`: Joins strings using a delimiter.



## Boolean Type
A **boolean statement** is a declarative sentence about which one can unambiguously say whether it is true or false.

**Conditional expressions** represent a certain condition and return a value of type boolean, which is either **true** (if the condition is true) or **false** (if the condition is false). Conditional expressions include comparison operations and logical operations.

**Comparison Operations**
Comparison operations involve comparing two operands and return a **boolean** value - true if the expression is true and false if the expression is false.

- `==` compares two operands for equality.
- `!=` compares two operands for inequality.
- `<` less than
- `>` greater than
- `<=` less than or equal to
- `>=` greater than or equal to

**Logical Operations**
Java also includes logical operations, which represent conditions and return **true** or **false**, typically combining multiple comparison operations.

- `!` Logical NOT (negation) - `!x` means "not x". Inverts the value to its opposite.
- `&` Logical AND - Returns true if both operands are true.
- `|` Logical OR - Returns true if at least one of the operands is true.
- `^` Logical XOR (exclusive OR) - Essentially returns true if the operands are different.
- `&&` Conditional AND (short-circuit logical AND) - Same result as `&`, but with nuances.
- `||` Conditional OR (short-circuit logical OR) - Same result as `|`, but with nuances.


**Priority of Logical Operations**
Just like in mathematics, in programming, operators have a specific order of execution when they appear in a single expression.

1. `!` (Logical NOT)
2. `&` (Logical AND)
3. `^` (Logical XOR)
4. `|` (Logical OR)
5. `&&` (Conditional AND)
6. `||` (Conditional OR)


If identical operations are adjacent, the one on the left is executed first.


</details>











