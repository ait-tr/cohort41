const heroes = [
  { hero: 'Iron Man', name: 'Tony Stark', age: 50, isAvenger: true },
  { hero: 'Captain America', name: 'Steve Rogers', age: 110, isAvenger: true },
  { hero: 'Thor', name: 'Thor Odinson', age: 1500, isAvenger: true }
]

const villains = [
  { hero: 'Thanos', name: 'Thanos', age: 1000, isAvenger: false },
  { hero: 'Loki', name: 'Loki Laufeyson', age: 1052, isAvenger: false }
]

// * Задание 1

// Объедините два массива героев в один и отсортируйте по возрасту

const einheim = heroes.concat(villains).sort((a, b) => a.age - b.age)

console.log(einheim)

// spread

const einheim2 = [...heroes, ...villains].sort((a, b) => b.age - a.age)

console.log(einheim2)

// * Задание 2

// Замените имя героя "Captain America" на "The First Avenger" и увеличьте его возраст на 10 лет

// const heroes1 = heroes.find(hero => hero.hero === 'Captain America')

const heroes2 = heroes.map(hero => {
  if (hero.hero === 'Captain America') {
    return { ...hero, hero: 'The First Avenger', age: hero.age + 10 }
  }
  return hero
})

console.log(heroes2)

heroes.forEach(hero => {
  if (hero.hero === 'Captain America') {
    hero.hero = 'The First Avenger'
    hero.age += 10
  }
})

console.log(heroes)

// * Задание 3

function getRandomCharacter(arr) {
  const randomNumber = Math.floor(Math.random() * arr.length)
  let character = arr[randomNumber]
  character.isAvenger
    ? console.log(`Congratulations! You got a hero: ${character.hero}`)
    : console.log(`Attention! ${character.hero}!! Call the Avengers!`)

  return character
}

getRandomCharacter(einheim)

// * Задание 4

// Создайте функцию getHeroAges(heroes), которая принимает массив героев

// Функция должна выполнить следующие действия:

// Отфильтровать героев, чьи имена начинаются с буквы "T". Отсортировать отфильтрованных героев по возрастанию их возраста. Получить массив возрастов отсортированных героев. Вывести полученный массив возрастов в обратном порядке.

const getHeroAges = heroes => {
  const filteredHeroes = heroes
    .filter(hero => hero.name.startsWith('T'))
    .sort((a, b) => a.age - b.age)
    .map(hero => hero.age)
    .reverse()
  console.log(filteredHeroes)
}

// getHeroAges([...heroes, ...villains])
