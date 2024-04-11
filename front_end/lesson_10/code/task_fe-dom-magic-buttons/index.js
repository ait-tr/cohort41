// найдем первую кнопку по id
const btn = document.getElementById('magic-btn')
// скопируем ее - получилась вторая кнопка. Ее можно использовать.
const clonedBtn = btn.cloneNode(true)
// задали id
clonedBtn.id = 'magic-btn-2'
clonedBtn.innerText = 'Я изменю тебя'
clonedBtn.style.backgroundColor = '#a78b71'
clonedBtn.style.color = 'white'
clonedBtn.setAttribute('type', 'button')
// clonedBtn.className = 'second-btn'
// clonedBtn.className = 'alien-btn second-btn'
clonedBtn.classList.add("second-btn");

btn.addEventListener('click', () => {
  document.body.appendChild(clonedBtn)
  console.log(clonedBtn)
})

clonedBtn.addEventListener('click', () => {
  btn.style.backgroundColor = '#9c4a1a'
  btn.style.color = 'black'
})
