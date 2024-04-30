const formItems = document.querySelector('#formItems')
const content = document.querySelector('#content')
const productList = document.querySelector('#productList')
const loader = document.querySelector('#loader')

formItems.addEventListener('submit', e => {
  e.preventDefault()
  const amount = e.target.amount.value
  e.target.amount.value = ''
  // прежде чем добавить новые элементы мы сначала очищаем контейнер от элементов оставшихся с предыдущего запросы
  while (productList.firstChild) {
    productList.removeChild(productList.firstChild)
  }
  // проверяем есть ли у нас ошибка на странице
  const error = document.querySelector('.error')
  // и если ошибка есть мы ее удаляем (error проверяем на null)
  if (error) {
    content.removeChild(error)
  }
  // мы проверяем ввел ли пользователь число от 0 до 20
  if (amount > 0 && amount <= 20) {
    // включаем лоадер
    loader.style.display = 'block'
    // отсылаем fetch запрос
    fetch(`https://fakestoreapi.com/products?limit=${amount}`)
      .then(res => res.json())
      .then(data => {
        // немного замедляем искусственно работу нашей API
        setTimeout(() => {
          // убираем loader
          loader.style.display = 'none'
          // показываем контент
          content.style.display = 'block'
          data.map(item => {
            // создаем карточку
            const itemCard = document.createElement('section')
            itemCard.classList.add('itemCard')
            // наполняем карточку контентом
            const itemTitle = document.createElement('h4')
            itemTitle.textContent = item.title
            const desc = document.createElement('p')
            desc.textContent = item.description
            const img = document.createElement('img')
            img.src = item.image
            img.classList.add('cardImage')
            // добавляем элементы карточке
            itemCard.append(itemTitle, img, desc)
            productList.append(itemCard)
          })
        }, 2000)
      })
      // если произошла ошибка то мы не заходим в блок .then()
      // и заходим в .catch()
      .catch(error => {
        // показываем контент
        content.style.display = 'block'
        // убираем лоадер
        loader.style.display = 'none'
        // создаем html элемент под ошибку
        const serverError = document.createElement('p')
        // красим ошибку
        serverError.style.color = 'red'
        // добавляем текст
        serverError.textContent = `Ошибка на сервере! ${error.message}`
        // добавляем ошибку на страницу
        content.append(serverError)
      })
  } else {
    // показываем контент
    content.style.display = 'block'
    // создаем html элемент под ошибку
    const errorMessage = document.createElement('p')
    // красим ошибку
    errorMessage.style.color = 'orange'
    // добавляем ошибке класс, чтобы потом иметь к ней доступ и удалить
    errorMessage.classList.add('error')
    // добавляем текст
    errorMessage.textContent =
      'Ошибка на клиенте! Укажите число в диапазоне от 1 до 20'
    // добавляем ошибку на страницу
    content.append(errorMessage)
  }
  //включаем loader до fetch запроса
})
