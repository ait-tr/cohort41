// * Массивы: Arrays
// массивы в JS динамические

// два способа создать массив

const arr1 = [] // предпочтительный способ
const arr2 = new Array()

// создание массивов со значениями
const numbers = [1, 2, 5, 66]
const fruits = ['apple', 'orange', 'pear', 'melon']
const party = ['human', 42, undefined, ['man', 'woman']]

console.log(party)

// получение элементов из массива по индексам
console.log(fruits[0]) // первый элемент массива

// если обратиться к несуществующему индексу в массиве - придет undefined
console.log(fruits[10])

fruits[3] = 'watermelon'
console.log(fruits)

// * цикл for loop

// указываем переменную итератор и задаем ей значение
// пишем условие выхода из цикла
// приращиваем на каждом кругу приращивает по 1 к числу итератору

for (let i = 0; i < fruits.length; i++) {
  //   console.log(fruits[i]) // мы выводим кпо очереди все элементы в массиве
}

let i = 0

// * цикл while loop

// пока выполняется условия в круглых скобках, будет происходить действие в фигурных
// важно указать условие выхода, которое случится рано или поздно - иначе вы попадете в infinity loop

while (i <= 10) {
  //   console.log(i)
  // если бы не написали строчку ниже мы бы попали в бесконечный цикл
  i++
}

// * еще немного про строки и как получать символы по индексу

let loop = 'infinity loop'
console.log(loop[1]) // выводим второй элемент массива

// методом slice мы отрезаем символы строки / массива до нужного индекса
// через конкатенацию приращиваем новый символ
let newLoop = 'I' + loop.slice(1)
console.log(newLoop)

// создайте массив строк из пяти элементов - марок автомобилей
// выведите значение в консоль при помощи цикла for
// поменяйте первый и последний элементы местами
// и вновь распечатайте массив в консоли

const cars = ['Tesla', 'Lexus', 'Mercedes', 'BMW', 'Ferrari']

// for (let i = 0; i < cars.length; i++) {
//   console.log(cars[i])
// }

let car = cars[0]
cars[0] = cars[cars.length - 1]
cars[cars.length - 1] = car

for (let i = 0; i < cars.length; i++) {
  console.log(cars[i])
}

// * методы массивов: добавление и удаление элементов

// методы делятся на мутирущие и немутирующие
// первые изменяют исходный массив, вторые нет

// * 1. Push() - мутирующий метод, добавляет элемент в конец массива

const students = ['Marina', 'Alex', 'Ira', 'John']

// при этом возвращенное значение - это число, длинна нового массива
// ! не ошибитесь и не заведите переменную под это значение с расчетом что вам придет новый массив

// let returnedValue = students.push('Harry Potter')
// console.log(returnedValue);

students.push('Harry Potter')
console.log(students)

// * 2. Pop() - мутирующий метод, удаляет элемент из конца массива

// возвращенное значение - удаленный элемент из массива

let returnedPop = students.pop()

console.log(returnedPop)
console.log(students)

// * 3. Unshift() - мутирующий, добавляет элемент в начало массива

let returnedUnshift = students.unshift('Luke Skywalker')

console.log(returnedUnshift)
console.log(students)

// * 4. Shift() - мутирующий, удаляет первый элемент из массива

let returnedShift = students.shift()

console.log(returnedShift)
console.log(students)

// * Spread syntax

// удобный метод копирования одномерных, не вложенных массивов

const berries = ['blueberry', 'watermelon']

// можно забирать элементы из исходного массива, добавляя новые
const berries2 = ['strawberry', ...berries, 'raspberry']

// можно объединить два массива в один
const berries3 = [...berries, ...berries2]

console.log(berries3)

// * деструктуризация массивов
// это способ в одну строчку: объявить новые переменные, забрать данные из массива и положить их в новые переменные
// с массивами деструктуризация работает по индексу

let cities = ['Berlin', 'Hamburg', 'Leipzig', 'Potsdam']

const [berlin, hamburg, leipzig, potsdam] = cities

// если вы пропускаете элементы и не даете под них переменные, вы пропускаете их, но сколько пустых мест - столько и запятых

const [first, , ,last] = cities

console.log(first)
console.log(last)

console.log('hamburg  ==>', hamburg)
