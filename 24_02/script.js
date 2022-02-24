//moltiplicare elementi dell'arrray v per d (numero)

var array = [];

const source = document.getElementById('source');
const result = document.getElementById('result');

const inputHandler = function(e) {
  result.innerHTML = e.target.value;
  console.log("posizione: "+array.push(e.target.value)+ " valore: "+ e.target.value);
}

source.addEventListener('input', inputHandler);
source.addEventListener('propertychange', inputHandler);



function prendiNum(){
    var num = document.getElementById('numero').value;
    console.log(num)
    return num;
}


function stampaArray(array,prendiNum){
  var arrayFinale = [];
  console.log(array.length);
  for (let index = 0; index < array.length; index++) {
    let num = array[index];
    num *= prendiNum();
    arrayFinale.push(num);
  }
  console.log(arrayFinale);
  alert(arrayFinale);
  return arrayFinale;
}