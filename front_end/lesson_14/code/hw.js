// Homework
// Задание 1
// Ваша задача - написать программу, которая принимает массив объектов-людей и вычисляет общий возраст.

// Создайте функцию calculateTotalAge, которая принимает массив объектов. Каждый объект в массиве представляет одного человека и имеет ключи: name и age В теле цикла, используйте деструктуризацию объекта для получения значения age и name. Верните общий возраст.

function calculateTotalAge(people) {
  let total = 0
  // for .. of это способ итерации по массивам / строкам, без специфического выхода из цикла
  for (let person of people) {
    const { age } = person
    total += age
  }
  return total
}

const people = [
  { name: 'Alice', age: 30 },
  { name: 'Bob', age: 25 },
  { name: 'Charlie', age: 35 }
]

console.log(calculateTotalAge(people)) // 90

// Задание 2
// Создайте функцию compareObjects, которая принимает два объекта в качестве аргументов и проверяет их на равенство (все ключи и значения должны быть одинаковыми). Верните true, если объекты равны, и false в противном случае.

const alice = { name: 'Alice', age: 30 }
const alice1 = { name: 'Alice', age: 30 }

const compareObjects = (obj1, obj2) => {
  let keys1 = Object.keys(obj1)
  let keys2 = Object.keys(obj2)

  // проверяем что длина равна
  if (keys1.length !== keys2.length) {
    return false
  }

  // проверяем что ключи равны
  for (i = 0; i < keys1.length; i++) {
    if (keys1[i] !== keys2[i]) {
      return false
    }
  }

  // мы проверяем значения по ключам
  for (let key of keys1) {
    if (obj1[key] !== obj2[key]) {
      return false
    }
  }

  // если все проверки пройдены возвращаем true
  return true
}

console.log(compareObjects(alice, alice1))

/// Задание 3
// Напишите функцию findKeyByValue, которая принимает объект и значение в качестве аргументов и возвращает первый ключ, соответствующий переданному значению. Если значение не найдено, верните null.

const magician = { name: 'Gendalf', age: 1000, hasMagic: true }

function findKeyByValue(obj, value) {
  // сделали массив из всех ключей объекта
  let keys = Object.keys(obj)
  // итерируемся по массиву ключей
  for (const key of keys) {
    // проверяем равно ли значение в объекте переданному значению
    if (obj[key] === value) {
      // возвращаем ключ если условие верное
      return key
    }
  }
  // null если не совпали
  return null
}

console.log(findKeyByValue(magician, 1000))

function findKeyByValueByForIn(obj, value) {
  // если нужно перебрать объект вы можете использовать for..in
  for (const key in obj) {
    if (obj[key] === value) {
      return key
    }
  }
  return null
}

console.log(findKeyByValueByForIn(magician, true))

// Задание 4
// У вас есть объект productInfo с информацией о продукте, включая его наименование, цену и наличие на складе. Напишите функцию printProductDetails, которая принимает этот объект в качестве аргумента и выводит в консоль сообщение вида: "<товар> - <цена>, товар на складе: <да/нет>", где "да" или "нет" зависит от наличия товара на складе.

const printProductDetails = productInfo => {
  const { name: productName, price, 'in stock': inStock } = productInfo
  let available
  if (inStock) {
    available = 'да'
  } else {
    available = 'нет'
  }
  console.log(`${productName} - $${price}, товар на складе: ${available}`)
}

const productInfo = {
  name: 'Smartphone',
  price: 699,
  'in stock': true
}

const printProductDetailsTern = productInfo => {
  const { name: productName, price, 'in stock': inStock } = productInfo

  // тернарный оператор - это по сути if / else в одну строчку
  // вы пишите выражение и если оно верно, то срабатывает код после '?'
  // если не верно, то после ':'

  let available = inStock ? 'да' : 'нет'
  console.log(`${productName} - $${price}, товар на складе: ${available}`)
}

printProductDetails(productInfo)

printProductDetailsTern(productInfo)
