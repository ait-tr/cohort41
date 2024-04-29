const catFact = document.getElementById('catFact')
const catFactLength = document.querySelector('#catFactLength')

async function loadFact() {
  const res = await fetch('https://catfact.ninja/fact')
  const data = await res.json()
  const { fact, length } = data
  catFact.textContent = `Cat fact: ${fact}`
  catFactLength.textContent = `Length: ${length}`
}

loadFact()
