/*function nCaratteriStringa(){
    var stringa = document.getElementsByName("stringa")[0].value; 
    var numero = document.getElementsByName("numero")[0].value;
    console.log(numero);
    console.log(stringa);
    var parola="";
    if((isNaN(numero)) || (numero == "") || (numero == "undefined") && (stringa == "") || (stringa == "undefined"))  {
        alert("inserire un numero e una stringa correttamente. Il numero non deve essere maggiore della lunghezza della stringa");
    }else{
        for (let index = 0; index < numero; index++) {
            var lettera = stringa[index];
            parola += lettera;
        }
        alert(parola);
        return;
    }
}*/


/*function seqFibonacci(){
    var nVolte = document.getElementsByName("nVolte")[0].value; 
    console.log(nVolte);
    var fibonacci = [];
    if(nVolte==0) alert();
    else if(nVolte==1) alert(1);
    else if(nVolte>1){
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (var i = 2; i < nVolte; i++) {
            fibonacci[i] = parseInt(fibonacci[i - 2]) + parseInt(fibonacci[i - 1]);
        }
        console.log(fibonacci);
        alert(fibonacci);
    }
}*/

   
function maiuscMinusc() {
  var stringaOld = document.getElementsByName("stringa")[0].value;
  var parola = stringaOld.split(" ");
  var stringaFinale = "";

  console.log(parola);

  //controllo maiuscolo/minuscolo dell'iniziale della parola, ciclo finche non finisce la frase
  for (var i = 0; i < parola.length; i++) {
    let asciiIniziale = parola[i].charAt(0);

    if (asciiIniziale >= "A" && asciiIniziale <= "Z") {
      //se il codice ascii della prima lettera è compreso tra la MAIUSCOLE
      let asciiInizialeConverted = parola[i].charCodeAt(0);
      stringaFinale += String.fromCharCode(asciiInizialeConverted);
    }
    if (asciiIniziale >= "a" && asciiIniziale <= "z") {
        // se il carattere e' minuscolo allora diventa maiuscolo
      let asciiInizialeConverted = parola[i].charCodeAt(0);
      asciiInizialeConverted -= 32;
      stringaFinale += String.fromCharCode(asciiInizialeConverted);
    }
    console.log(parola[i].length);

    //controllo maiuscolo/minuscolo degli altri caratteri della parola, ciclo finche non finisce la parola
    for (let j = 1; j < parola[i].length; j++) {
      let asciiSucc = parola[i].charAt(j);

      if (asciiSucc >= "a" && asciiSucc <= "z") {
        // se è tra le MINUSCOLEB
        let asciiSuccConverted = parola[i].charCodeAt(j);
        stringaFinale += String.fromCharCode(asciiSuccConverted);
      }
      if (asciiSucc >= "A" && asciiSucc <= "Z") {
        // se il carattere e' maiuscolo allora diventa minuscolo
        let asciiSuccConverted = parola[i].charCodeAt(j);
        asciiSuccConverted += 32;
        stringaFinale += String.fromCharCode(asciiSuccConverted);
      }
    }
    stringaFinale += " ";
  }

  console.log(stringaFinale);
  alert(stringaFinale);
}