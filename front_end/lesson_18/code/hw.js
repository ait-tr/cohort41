// Создайте классы: Plant, Rose.
// Роза должна наследовать Растение. Пусть у растения будут поля:

// рост,
// возраст.
// И метод grow, который увеличивает его рост на 10 см.

// У розы должно быть поле - количество бутонов (numberOfFlowers). Создайте объект класса розы, вызовите метод.

// * var 1
class Plant {
  constructor() {
    this.height = 50
    this.age = 5
  }
  grow() {
    this.height += 10
  }
}

class Rosa extends Plant {
  constructor() {
    super()
    this.numberOfFlowers = 10
  }
}

const rose = new Rosa()

rose.grow()

console.log(rose)

// * var 2

class ExoticPlant {
  constructor(height, age) {
    this.height = height
    this.age = age
  }
  grow() {
    this.height += 10
  }
}

class Liana extends ExoticPlant {
  constructor(height, age, numberOfFlowers) {
    super(height, age)
    this.numberOfFlowers = numberOfFlowers
  }
}

const myFavoriteLiana = new Liana(10, 5, 1)

myFavoriteLiana.grow()
myFavoriteLiana.grow()

console.log(myFavoriteLiana)
