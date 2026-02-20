function toggleMode() {
  const html = document.documentElement

  /* if (html.classList.contains('light')) {
    html.classList.remove('light')
  } else {
    html.classList.add('light')
  } 
    Essa opção é mais longa, podendo preferir por uma mais curta como a de baixo
  */

  html.classList.toggle('light')

  const img = document.querySelector('#profiler img')

  if (html.classList.contains('light')) {
    img.setAttribute('src', './assets/avatar-light.png')
    img.setAttribute(
      'alt',
      alert('Imagem Perfil de fundo azul e óculos de sol')
    )
  } else {
    img.setAttribute('src', './assets/avatar.png')
    img.setAttribute(
      'alt',
      alert('Imagem Perfil de fundo amarelo e óculos de grau')
    )
  }
}
