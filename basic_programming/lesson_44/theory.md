
## Java IO
Java IO (Input/Output) - это часть Java Standard Edition API, предоставляющая механизмы для работы с вводом-выводом данных, такие как файлы, сетевые потоки и т. д.

Пакет java.io включает в себя множество классов и интерфейсов для работы с вводом-выводом данных. Они разделены на две основные категории:

### Потоки байтов (byte streams):
    - Используются для работы с бинарными данными.
    - Основные классы: `InputStream` и `OutputStream`.
    - Примеры классов: `FileInputStream`, `FileOutputStream`, `BufferedInputStream`, `BufferedOutputStream`, и другие.

### Потоки символов (character streams):
    - Используются для работы с текстовыми данными.
    - Основные классы: `Reader` и `Writer`.
    - Примеры классов: `FileReader`, `FileWriter`, `BufferedReader`, `BufferedWriter`, и другие.

Потоки байтов и потоки символов в Java IO имеют похожую структуру и работают аналогичным образом, но отличаются тем, что потоки символов автоматически конвертируют бинарные данные в символы и наоборот.

<img src="https://raw.githubusercontent.com/ait-tr/cohort41/main/basic_programming/lesson_44/img/JavaIO.jpeg" width="100%">

### Важные концепции Java IO:

1. InputStream/OutputStream:
    - Базовые классы для чтения и записи байтов.
    - `InputStream` имеет методы `read()`, `available()`, `close()` и другие.
    - `OutputStream` имеет методы `write()`, `flush()`, `close()` и другие.

2. Reader/Writer:
    - Базовые классы для чтения и записи символов.
    - `Reader` имеет методы `read()`, `close()` и другие.
    - `Writer` имеет методы `write()`, `flush()`, `close()` и другие.

3. Буферизация:
    - Буферизация используется для увеличения производительности при работе с вводом-выводом данных.
    - Буферизованные потоки хранят данные в буфере, что позволяет считывать или записывать большие блоки данных за один раз.
    - Примеры буферизованных потоков: `BufferedInputStream`, `BufferedOutputStream`, `BufferedReader`, `BufferedWriter`.

4. Сериализация:
    - Сериализация - это процесс преобразования объекта в последовательность байтов, чтобы его можно было сохранить в файле или передать по сети.
    - Десериализация - это процесс восстановления объекта из последовательности байтов.
    - Классы для работы с сериализацией: `ObjectInputStream`, `ObjectOutputStream`.

### File
Класс `java.io.File` в Java представляет собой абстракцию, используемую для работы с файлами и директориями (папками). 
Этот класс не используется для чтения или записи данных в файлы, а предназначен для управления информацией о файлах и директориях: 
- создания,
- удаления, 
- проверки их свойств
- и т.д.


## Буферизированные Классы в Java IO

Буферизированные классы в Java IO значительно повышают производительность за счёт уменьшения числа операций ввода-вывода.

Для использования `BufferedReader` и `BufferedWriter` важно понимать процесс их создания и конструкторы, которые они используют.

Эти классы обертывают другие потоки чтения и записи, такие как `FileReader` и `FileWriter`, для буферизации данных.

**Ключевым моментом** здесь является то, что `BufferedReader` и `BufferedWriter` являются обертками.

**Они не работают с файлами напрямую**, а используют другие потоки (как `FileReader`/`FileWriter`) для доступа к файлам.

Буферизация добавляет дополнительный слой, который улучшает производительность за счёт снижения количества обращений к источнику данных или месту назначения.



### 1. BufferedReader
- **Основное Применение:** Буферизированное чтение текстовых данных из потока ввода.
- **Важные Методы:**
   - `read()`: Читает один символ.
   - `read(char[] cbuf, int off, int len)`: Читает символы в массив.
   - `readLine()`: Читает строку текста.
   - `close()`: Закрывает поток.
- **Пример:**
  ```
  try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
      String line;
      while ((line = br.readLine()) != null) {
          System.out.println(line);
      }
  }
  ```

### 2. BufferedWriter
- **Основное Применение:** Буферизированная запись текстовых данных в поток вывода.
- **Важные Методы:**
   - `write(int c)`: Записывает один символ.
   - `write(char[] cbuf, int off, int len)`: Записывает массив символов.
   - `write(String s, int off, int len)`: Записывает строку.
   - `newLine()`: Добавляет перевод строки.
   - `flush()`: Сбрасывает буфер в поток вывода.
   - `close()`: Закрывает поток.
- **Пример:**
  ```
  try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
      bw.write("Some text");
      bw.newLine();
      bw.write("More text");
      bw.flush();
  }
  ```



<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>

Java IO (Input/Output) is a part of the Java Standard Edition API that provides mechanisms for working with data input and output, such as files, network streams, etc.

The java.io package includes a multitude of classes and interfaces for handling data I/O. They are divided into two main categories:

### Byte Streams:
- Used for working with binary data.
- Core classes: `InputStream` and `OutputStream`.
- Examples of classes: `FileInputStream`, `FileOutputStream`, `BufferedInputStream`, `BufferedOutputStream`, and others.

### Character Streams:
- Used for working with text data.
- Core classes: `Reader` and `Writer`.
- Examples of classes: `FileReader`, `FileWriter`, `BufferedReader`, `BufferedWriter`, and others.

Byte streams and character streams in Java IO have a similar structure and operate in comparable ways, but they differ in that character streams automatically convert binary data to characters and vice versa.

### Important Concepts in Java IO:

1. InputStream/OutputStream:
    - Fundamental classes for reading and writing bytes.
    - `InputStream` has methods like `read()`, `available()`, `close()`, and others.
    - `OutputStream` has methods like `write()`, `flush()`, `close()`, and others.

2. Reader/Writer:
    - Fundamental classes for reading and writing characters.
    - `Reader` has methods like `read()`, `close()`, and others.
    - `Writer` has methods like `write()`, `flush()`, `close()`, and others.

3. Buffering:
    - Buffering is used to increase performance when working with data I/O.
    - Buffered streams store data in a buffer, allowing large blocks of data to be read or written at once.
    - Examples of buffered streams: `BufferedInputStream`, `BufferedOutputStream`, `BufferedReader`, `BufferedWriter`.

4. Serialization:
    - Serialization is the process of converting an object into a sequence of bytes to save it to a file or send over a network.
    - Deserialization is the process of reconstructing an object from a sequence of bytes.
    - Classes for working with serialization: `ObjectInputStream`, `ObjectOutputStream`.

### File
The `java.io.File` class in Java represents an abstraction used for working with files and directories (folders). This class is not used for reading or writing data to files but is intended for managing information about files and directories: creating, deleting, checking their properties, etc.


</details>