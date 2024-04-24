const formElement = document.querySelector('#todo-form')
const listElement = document.querySelector('#todo-list')

const tasks = []

formElement.addEventListener('submit', event => {
  event.preventDefault()
  // забираем данные из формы и чистим форму
  const task = event.target.task.value
  const desc = event.target.desc.value
  event.target.task.value = ''
  event.target.desc.value = ''
  // добавляем данные из формы в массив + пишем новый ключ isDone с булевым значением
  // если isDone true у нас будет стоять галочка в checkbox
  tasks.push({ task, desc, isDone: false })
  console.log(tasks)
  // до итерации по массиву нужно очистить ol от элементов
  // чтобы при новой итерации по списку старые элементы исчезали из DOM
  while (listElement.hasChildNodes()) {
    listElement.firstChild.remove()
  }
  // итерируемся по массиву и создаем элементы
  tasks.forEach(task => {
    const li = document.createElement('li')
    // добавим input типа checkbox
    const checkBox = document.createElement('input')
    // делаем из input checkbox
    checkBox.type = 'checkbox'
    // обращаемся к свойству checked и связываем его с данными из массива
    checkBox.checked = task.isDone
    // вешаем обработчик события на чекбокс, чтобы при нажатии менять значение checked на противоположное
    // этот блок кода сработает при нажатии на конкретный checkbox
    checkBox.onclick = () => {
      task.isDone = !task.isDone
      console.log(tasks);
    }
    // добавляем к li checkBox
    li.append(checkBox)
    // создали отдельно текстовый узел, чтобы не перезаписать все содержимое li
    const textNode = document.createTextNode(`${task.task}, ${task.desc}`)
    // добавляем textNode к li
    li.append(textNode)
    // добавляем li на страницу
    listElement.appendChild(li)
  })
})
