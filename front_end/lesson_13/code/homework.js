// * Задание 1
// Создайте стрелочную функцию, которая бы принимала массив и цифру, возвращала бы элемент массива под этим индексом. Если такого индекса нет в массиве - выведите в консоль "No such index in array"

// const getElementByIndex = (arr, index) => arr[index]

const getElementByIndex = (arr, index) => {
  // мы проверяем негативную ситуацию
  if (index < 0 || index >= arr.length) {
    console.log('No such index in array')
    return undefined
  }
  return arr[index]
}

console.log(getElementByIndex([1, 22, 6], 2))

// * Задание 2
// Создайте функцию, которая бы принимала бы следующие параметры:

// код погоды
// функция decode, которая дает расшифровку погоды по коду.
// Функция должна возвращать строку, описывающую погоду.

// Таблица соответствия код-описание:
// SQ – шквал
// PO – пыльный вихрь
// FC - пыльный вихрь
// BR – дымка (видимость от 1 до 9 км)
// HZ – мгла (видимость менее 10 км)
// FU – дым (видимость менее 10 км)
// DS - пыльная буря (видимость менее 10 км)
// SS - песчаная буря (видимость менее 10 км)
// Подсказка: удобно использовать в одном из методов switch-case:

// switch (expression) {
//     case value1:
//         <код>
//     case value2:
//         <код>
// // …
//     case valueN:
//         <код>
//     default:
//         <код>
// }

const decode = code => {
  // switch - переключатель
  switch (code) {
    // если выражение удовлетворяет условию вы переходите к return, если нет идете дальше вплоть до default
    case 'SQ':
      return 'шквал'
    case 'PO':
      return 'пыльный вихрь'
    case 'FC':
      return 'пыльный вихрь'
    case 'BR':
      return 'дымка (видимость от 1 до 9 км)'
    case 'HZ':
      return 'мгла (видимость менее 10 км)'
    case 'FU':
      return 'дым (видимость менее 10 км)'
    case 'DS':
      return 'пыльная буря (видимость менее 10 км)'
    case 'SS':
      return 'песчаная буря (видимость менее 10 км)'
    // вариант по умолчанию, если предыдущие case не сработали
    default:
      return 'no such code :('
  }
}

console.log(decode('dddd'))

// * Задание 3
// Напишите функцию sumNumbers, которая принимает на вход массив чисел и возвращает строку, в которой перечислены все числа из массива и их сумма. Используйте синтаксис function expression, цикл while, шаблонные строки.

// console.log(sumNumbers(numbers)); // Ожидаемый результат: "Числа: 1, 2, 3, 4, 5. Сумма: 15."

const sumNumbers = function (numbers) {
  // заводим переменную под сумму всех элементов
  let sum = 0
  // переменная под строку из чисел
  let answer = ''
  // итератор для выхода из цикла
  let i = 0
  // пока условие в скобках верно - цикл будет продолжаться
  while (i < numbers.length) {
   // считаем сумму
    sum += numbers[i]
    // конкатенируем строку
    answer += numbers[i]
    // ставим запятую и пробел всем элементам кроме последнего
    if (i < numbers.length - 1) {
      answer += ', '
    }
    // приращиваем итератор, чтобы не сделать infinity loop
    i++
  }
  // выводим ответ через шаблонную строку
  return `Числа: ${answer}. Сумма: ${sum}.`
}

const numbers = [22, 100, 2, 99]

console.log(sumNumbers(numbers))

// если хочется посмотреть визуализацию кода:
// https://pythontutor.com/
