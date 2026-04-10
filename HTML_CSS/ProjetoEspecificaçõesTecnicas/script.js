const butonAI = document.querySelector('button');
const areaResultado = document.querySelector('#resultado');
const retornoTextarea = document.querySelector('textarea');

butonAI.addEventListener("click", () => {
  /* if (areaResultado.classList.contains('desativado')) {
    areaResultado.classList.remove('desativado')
  } else {
    areaResultado.classList.add('desativado')
  } 
  
  Código acima evoluido para:
  */

  areaResultado.classList.toggle('desativado');
  depurarTexto(retornoTextarea);
})

function depurarTexto(elemeto) {
  const texto = elemeto.value;
  const partes = texto.split(".");

  console.log(partes[0]);

}