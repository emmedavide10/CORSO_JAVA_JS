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



function changeLettereStringa(){

    var stringaOld = document.getElementsByName("stringa")[0].value;
    var cConvertedAsciiSucc=0;
    var cConvertedAscii=0;
    var c="";
    var cSucc="";
    var stringaNuova = "";

    for (let i = 0; i < stringaOld.length; i++) {
        c = stringaOld[i];
        console.log(c);
        cSucc = stringaOld[i++];
        console.log(cSucc);

        cConvertedAscii = c.charCodeAt(i);
        cConvertedAsciiSucc = c.charCodeAt(i++);
        console.log(cConvertedAscii);
        console.log(cConvertedAsciiSucc);

        
        if(cConvertedAscii==32){
            stringaNuova+=" ";
            if(cConvertedAscii>=97 && cConvertedAscii<=122){
                cConvertedAsciiSucc=(cConvertedAscii[i++])-32;
                console.log(cConvertedAsciiSucc);
                stringaNuova+=String.fromCharCode(cConvertedAsciiSucc);
                console.log(stringaNuova);
                continue;
            }
            else if(cConvertedAscii>=65 && cConvertedAscii<=90){
                cConvertedAsciiSucc=(cConvertedAscii[i++])+32;
                console.log(cConvertedAsciiSucc);
                stringaNuova+=String.fromCharCode(cConvertedAsciiSucc);
                console.log(stringaNuova);
                continue;
            }
        }
    }
    alert(stringaNuova);
    return stringaNuova;
}