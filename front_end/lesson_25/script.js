const form = document.getElementById('cityForm')
const citySelect = document.getElementById('citySelect')

form.addEventListener('submit', event => {
  event.preventDefault()
  // данные забираются у select через value
  const selectedValue = citySelect.value
  console.log(selectedValue)
})
