## Ветвления в Git
Ветвление в Git позволяет разработчикам изолированно работать над новыми функциями или исправлениями, не влияя на основную кодовую базу.
Это ключевая особенность, которая делает Git мощным инструментом для командной разработки.
Вот основы и шаги для работы в команде над одним проектом с использованием веток в Git.

### Основы ветвления в Git
**Ветки** в Git — это просто указатели на определенные коммиты.
Когда вы создаете новую ветку, Git создает новый указатель, который можно перемещать независимо от других веток.

- **`master` или `main` ветка**: Традиционно основная ветка, где хранится стабильная версия проекта.
- **Функциональные ветки (Feature branches)**: Используются для разработки новых функций или исправлений, обычно одна ветка на функцию или исправление.
- **Ветки исправлений (Hotfix branches)**: Для срочных исправлений в основной кодовой базе.

## git branch
Работа с ветками в репозитории

- `git branch` - показывает список веток
- `git branch branch-name` - создает новую ветку branch-name
- `git branch -D branch-name` — удаляет ветку branch-name
- `git checkout` - Переключается на другую ветку
- `git checkout branch-name` — переключается на последний коммит в ветке branch-name
- `git checkout -b branch-name` - создает и переключается на ветку branch-name

Переименование ветки в Git зависит от того, находитесь ли вы в этой ветке или хотите переименовать другую ветку.
- `git branch -m new-branch-name` - переименование текущей ветки
- `git branch -m old-branch-name new-branch-name` - переименовать ветку, находясь в другой ветке
- `git push origin -u branch-name` - Отправить новую ветку в удалённый репозиторий и установите её как upstream
- `git push origin --delete branch-name` - Удалить ветку из удалённого репозитория

--- 

## Модели совместной разработки
Разберем две основные модели совместной разработки в контексте использования Git и GitHub (или аналогичных систем управления версиями и платформ):
- **модель с общим репозиторием** (Shared-repository model)
- **модель с форками и пулл-реквестами** (Forks and Pull Requests model).

Обе модели имеют свои преимущества и недостатки и подходят для разных сценариев работы.

### 1. Модель с общим репозиторием (Shared-repo model)

В этой модели все участники команды имеют прямой доступ на запись в один общий репозиторий. Они могут клонировать репозиторий, создавать новые ветки, делать коммиты и пушить изменения напрямую в общий репозиторий.

**Когда лучше использовать:**
- В небольших командах, где все разработчики знакомы друг с другом и доверяют друг другу.
- В приватных проектах или организациях, где управление доступом строго контролируется.
- Когда нужна простота управления и меньше оверхеда с настройкой доступов.

**Преимущества:**
- Простота и быстрота внесения изменений, не требуется создавать форки.
- Удобно для небольших команд, где требуется тесное взаимодействие и быстрая итерация.

**Недостатки:**
- Больший риск случайного повреждения основной ветки (`main` или `master`), особенно без строгих правил ревью кода.
- Требуется доверие между всеми участниками команды, так как каждый имеет полный доступ.

### 2. Модель с форками и пулл-реквестами (Forks and Pull Requests model)

В этой модели участники не имеют прямого доступа на запись в основной репозиторий.
Вместо этого они создают свои собственные копии (форки) репозитория, работают в этих форках, а затем предлагают свои изменения через пулл-реквесты.

**Когда лучше использовать:**
- В проектах с открытым исходным кодом, где участвует широкий круг незнакомых разработчиков.
- Когда необходим строгий контроль над изменениями в основном репозитории.
- Для обеспечения код-ревью и обсуждения изменений перед их внедрением.

**Преимущества:**
- Высокий уровень контроля за качеством и безопасностью кода.
- Возможность широкого обсуждения и рецензирования изменений перед их принятием.
- Безопасность основного репозитория от случайных повреждений.

**Недостатки:**
- Больше шагов для внесения изменений (нужно создать форк, поддерживать его в актуальном состоянии, создавать пулл-реквесты).
- Может быть менее удобно для небольших команд или проектов, где все разработчики доверяют друг другу и хорошо знакомы с процессами.

В целом, выбор между этими моделями зависит от размера команды, типа проекта (открытый или закрытый), необходимости контроля над изменениями и предпочтений в работе.

---

# Общий порядок (схема) работы в режиме с доступом на запись

1. Открыть имеющийся репо (или создать новый)
2. Добавить членов команды
3. Настройка защиты ветки `main`
4. Клонировать репо (скачать на компьютер)
5. Открыть репо любимом редакторе
6. Создать отдельную ветку под задачу
    - `git checkout -b new-branch-name`
    - `git checkout -b sergey/create-hello-file`
7. Решаем задачу (вносим правки в проект)
8. Фиксация изменений
    - `git add .`
    - `git commit -m 'update'`
9. Выгрузить ветку (изменения) на GitHub
    - `git push -u origin ветка`
10. Оформить “заявку на улучшение” (Pull Request, PR, запрос на слияние)
11. **(доп/шаг)** Выгрузить изменения с GitHub себе на компьютер
    1. переключиться на `main`
    2. `git pull`


___

___

## Optional

Класс `Optional` в Java - это контейнерный класс, используемый для представления необязательных значений, которые могут быть `null`. 
Он был введен в Java 8 как часть java.util пакета и предлагает удобный способ работать с значениями, которые могут отсутствовать, без явного использования `null` проверок, что уменьшает возможность возникновения `NullPointerException`.

Вот основные характеристики и методы класса `Optional`:

### Создание объекта Optional

- `Optional.empty()`: возвращает пустой `Optional` объект.
- `Optional.of(value)`: возвращает `Optional` с не-null значением. Если значение `null`, то будет выброшено исключение `NullPointerException`.
- `Optional.ofNullable(value)`: возвращает `Optional`, который содержит значение, если оно не `null`, и пустой `Optional`, если значение `null`.

### Проверка наличия значения

- `isPresent()`: возвращает `true`, если значение присутствует в `Optional`.
- `isEmpty()`: возвращает `true`, если значение отсутствует в `Optional` (появился в Java 11).

### Получение значения

- `get()`: возвращает значение, если оно присутствует, иначе выбрасывает `NoSuchElementException`.
- `orElse(defaultValue)`: возвращает значение, если оно присутствует, иначе возвращает `defaultValue`.
- `orElseGet(supplier)`: возвращает значение, если оно присутствует, иначе вызывает функцию `supplier` для генерации значения по умолчанию.
- `orElseThrow(exceptionSupplier)`: возвращает значение, если оно присутствует, иначе выбрасывает исключение, созданное с помощью `exceptionSupplier`.

### Работа со значениями

- `ifPresent(consumer)`: выполняет действие `consumer`, если значение присутствует.
- `ifPresentOrElse(consumer, emptyAction)`: выполняет действие `consumer`, если значение присутствует, иначе выполняет `emptyAction` (добавлен в Java 9).
- `stream()`: если значение присутствует, возвращает поток с одним элементом, иначе возвращает пустой поток (добавлен в Java 9).
- `filter(predicate)`: если значение присутствует и удовлетворяет условию `predicate`, возвращает `Optional` этого значения, иначе возвращает пустой `Optional`.
- `map(function)`: если значение присутствует, применяет функцию `function` и возвращает `Optional` результата.
- `flatMap(function)`: если значение присутствует, применяет функцию `function`, которая сама возвращает `Optional`, и затем возвращает этот `Optional` напрямую, избегая дополнительной обертки `Optional<Optional<T>>`.

### Примеры использования

```
// Создание Optional объекта
Optional<String> optional = Optional.of("Hello");

// Использование map для преобразования содержимого, если оно присутствует
optional.map(String::toUpperCase).ifPresent(System.out::println); // Выведет "HELLO"

// Получение значения с альтернативой
String nullSafe = optional.orElse("Default Value");

// Использование orElseThrow для генерации исключения, если значение отсутствует
String value = optional.orElseThrow(IllegalStateException::new);


```

Использование класса `Optional` помогает писать более чистый код, уменьшая необходимость в проверках на `null` и явных `null` значениях. Это может привести к уменьшению ошибок, связанных с отсутствием значений, и улучшить читаемость кода.

Однако **следует избегать использования `Optional` для полей классов или в качестве аргументов методов**, так как это увеличивает сложность и не соответствует первоначальной цели класса `Optional`, которой является предоставление ясного и удобного способа работы с методами, которые могут возвращать `null`.


<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>

## Branching in Git
Branching in Git allows developers to work on new features or fixes in isolation without affecting the main codebase.
This is a key feature that makes Git a powerful tool for team development.
Here are the basics and steps for working as a team on a project using branches in Git.

### Basics of Branching in Git
**Branches** in Git are simply pointers to specific commits.
When you create a new branch, Git creates a new pointer that can be moved independently of other branches.

- **`master` or `main` branch**: Traditionally the main branch where the stable version of the project is stored.
- **Feature branches**: Used for developing new features or fixes, usually one branch per feature or fix.
- **Hotfix branches**: For urgent fixes in the main code base.

## git branch
Working with branches in the repository

- `git branch` - shows the list of branches
- `git branch branch-name` - creates a new branch named branch-name
- `git branch -D branch-name` — deletes the branch named branch-name
- `git checkout` - Switches to another branch
- `git checkout branch-name` — switches to the last commit in the branch named branch-name
- `git checkout -b branch-name` - creates and switches to the branch named branch-name

Renaming a branch in Git depends on whether you are in that branch or want to rename another branch.
- `git branch -m new-branch-name` - renames the current branch
- `git branch -m old-branch-name new-branch-name` - rename a branch while in another branch
- `git push origin -u branch-name` - Push the new branch to the remote repository and set it as upstream
- `git push origin --delete branch-name` - Delete a branch from the remote repository

---

## Models of Collaborative Development
Let's discuss two main models of collaborative development in the context of using Git and GitHub (or similar version control systems and platforms):
- **shared-repository model**
- **forks and pull requests model**

Both models have their advantages and disadvantages and are suitable for different work scenarios.

### 1. Shared-Repository Model (Shared-repo model)

In this model, all team members have direct write access to a single shared repository. They can clone the repository, create new branches, make commits, and push changes directly to the shared repository.

**When to use:**
- In small teams where all developers are familiar with and trust each other.
- In private projects or organizations where access management is strictly controlled.
- When simplicity and less overhead with access setup are needed.

**Advantages:**
- Simplicity and speed of making changes, no need to create forks.
- Convenient for small teams where close interaction and fast iteration are required.

**Disadvantages:**
- Higher risk of accidentally damaging the main branch (`main` or `master`), especially without strict code review rules.
- Requires trust among all team members, as everyone has full access.

### 2. Forks and Pull Requests Model

In this model, participants do not have direct write access to the main repository.
Instead, they create their own copies (forks) of the repository, work in these forks, and then propose their changes through pull requests.

**When to use:**
- In open-source projects with a wide range of unfamiliar developers.
- When strict control over changes in the main repository is needed.
- To ensure code review and discussion of changes before their implementation.

**Advantages:**
- High level of control over code quality and security.
- The possibility of wide discussion and review of changes before acceptance.
- Security of the main repository from accidental damages.

**Disadvantages:**
- More steps to make changes (need to create a fork, keep it up to date, create pull requests).
- May be less convenient for small teams or projects where all developers trust each other and are familiar with the processes.

Overall, the choice between these models depends on the size of the team, the type of project (open or closed), the need for control over changes, and working preferences.

---

# General Procedure (Scheme) for Working with Write Access

1. Open an existing repo (or create a new one)
2. Add team members
3. Configure protection for the `main` branch
4. Clone the repo (download to your computer)
5. Open the repo in your favorite editor
6. Create a separate branch for the task
    - `git checkout -b new-branch-name`
    - `git checkout -b sergey/create-hello-file`
7. Solve the task (make changes to the project)
8. Commit the changes
    - `git add .`
    - `git commit -m 'update'`
9. Upload the branch (changes) to GitHub
    - `git push -u origin branch`
10. Submit an “improvement request” (Pull Request, PR, merge request)
11. **(optional step)** Download changes from GitHub to your computer
    1. switch to `main`
    2. `git pull`

</details>