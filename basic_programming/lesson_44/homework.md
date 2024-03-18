#### Task 1

Дан файл `text.txt`:
```text
Lorem ipsum dolor sit amet, consectetur adipisicing.
Lorem ipsum dolor sit amet.
Lorem ipsum dolor sit amet, consectetur adipisicing elit.
Lorem, ipsum dolor.
Lorem ipsum dolor sit amet consectetur adipisicing elit. Officia.
Lorem, ipsum.
Lorem ipsum dolor sit amet consectetur adipisicing elit.
Lorem ipsum dolor sit.
Lorem ipsum dolor sit amet consectetur adipisicing elit. Nemo!
```

Ваша задача используя классы пакета `java.io` создать файл с именем 'copy.txt' и скопировать в него все данные из файла 'text.txt'


#### Task 2

Дан файл с историей поступлений денег на счета пользователей за некий период времени:
```text
user1:2050
user2:1200
user1:1700
user3:1800
user1:1300
user4:2100
user2:750
```

Данные в виде:  `<имяПользователя>:<суммаПоступления>`.


Ваше задание прочитать данные из файла и обработать их.

Результат обработки должен быть записан в два файла:
- `less.txt` список тех, кому **в сумме** перечисленно меньше 2000
- `more.txt` список тех, кому **в сумме** перечисленно 2000 и больше

Output:

`less.txt`
```text
user2:1950
user3:1800
```

`more.txt:`
```text
user1:5050
user4:2100
```







