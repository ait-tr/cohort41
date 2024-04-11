// console.log('welcome to JS');

// через let можно переопределять значения переменной
// можно создать переменную без значения

let x
x = 'word'
x = 'another word'

// console.log(x);

// через const запрещено переопределять значение переменной

const fruit = 'orange'
// fruit = 'pear'

// javascript динамически типизируемый язык
// это значит что вы можете переназначать в переменные данные другого типа

x = 42

// Примитивные типы данных:

// * 1. String - строка

let planet = 'Earth'
planet = 'Mercury'
planet = `Mars`

// * 2. Number - число

let n1 = 9
let n2 = 8.5

// самое большое safe число, которое может быть использовано в js
// console.log(Number.MAX_SAFE_INTEGER);

// * 3. Bigint - большое число

let n3 = 9n

// console.log(typeof n3)

// * 4. Boolean - булевое значение

// true / false

// рекомендуется для читабельности кода называть переменную
// с вопросительного слова

let isDrink = false
let hasMother = true

// * 5. Undefined - неопределенный тип данных

let u1 = undefined
// например, если не задали значение переменной
let u2

console.log(u2)

// * 6. Null

let null1 = null

// * 7. Symbol

let s1 = Symbol('smth')
console.log(s1)

// * NaN - Not A Number не отдельный тип данных, а специальное значение
// результат невыполнимых математических операций

// ** чтобы узнать тип данных переменной используйте оператор typeof

let result = 10 / 'привет'
console.log(result)

// тип NaN - это number...
console.log('тип NaN:', typeof result)

// просто пример
console.log(1 + 1)

// Конкатенация - сложение строк в одну
console.log('1' + 1)

// * Преобразование типов:

// 1. Преобразование в строку

// неявное
let s2 = 5 + ''
console.log(99 + +'1') // будет 100

console.log(s2, '- это:', typeof s2)

// явное
// мы превратили булевое значение в строку
let s3 = String(false)
console.log(typeof s3)

// 2. Преобразования в числа

// неявное
let s4 = +'42'
console.log(typeof s4)

// c оператором вычитания мы приводим строку к числу
let s7 = 5 - '2'
console.log(s7, typeof s7)


// сначала 9 преобразуется в строку, после 999 в число
console.log('99' + 9 - 5) // 994

//явное

let s5 = Number('777dfdsf')

// если Number() встретит непревращаемые в число символы
// он выведет NaN

// console.log(typeof s5)

// parseInt() будет превращать в число символы пока не встретит непревращаемый

let s6 = parseInt('9999usd')

console.log(s6)

// 3. Логическое преобразование

// число в boolean

// 0 будет равен false
let l5 = Boolean(0)
console.log(l5)

// положительные числа это будет true
let l6 = Boolean(-5)
console.log(l6)

// странно, но отрицательные также true
let l7 = Boolean(-5)
console.log(l7)

// NaN в булевом значении будет false
let l8 = Boolean(NaN)
console.log(l8)

// Операторы:

// - арифметические

let l9 = 12 + 48 // + сложение
let l10 = 10 - 2 // - вычитание
let l11 = 4 * 8 // - умножение
let l12 = 8 / 2 // - деление

let l13 = 9 % 4 // - остаток от целочисленного деления

console.log(l13)

let l14 = 9 ** 3 // - возведение в степень

// - операторы сравнения

// >, <, >=, <=

// coercion - неявное преобразование типов

// == - это равенство с приведением типов
// 'ленивое' равенство, чтобы не приводить строку к числу

// строка 9 преобразуется к числу
// js будет сравнивать числа

console.log(9 == '9')

console.log('home' == 'home')

// === - это строгое
// без приведения типов

console.log(9 === '9')

// знак неравенства !==
console.log(9 !== '9')

let number = 'a'
console.log(typeof (number ** 3))




