const countriesContainer = document.querySelector('#countriesContainer')

async function getCountries() {
    const res = await fetch('https://yevhbrosl.github.io/Countries-api/countries.json')
    const data = await res.json()
    data.map(country => {
        const { name, landmark, image } = country
        const card = document.createElement('div')
        card.classList.add('countryCard')
        const cardHeading = document.createElement('h3')
        cardHeading.textContent = name.charAt(0).toUpperCase() + name.slice(1)
        cardHeading.classList.add('countryCard__heading')
        const cardDesc = document.createElement('p')
        cardDesc.textContent = landmark
        const cardImage = document.createElement('img')
        cardImage.src = image
        cardImage.classList.add('cardImg')
        card.append(cardHeading, cardDesc, cardImage)
        countriesContainer.append(card)
    })
}

getCountries()