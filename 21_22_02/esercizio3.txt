function checkCap(){
    var cap=document.form.cap.value;
    console.log(cap)
    var capString = cap.toString();
    if (capString.length!=5) {
        alert ("inserire numero di cinque cifre");
        return;
    }
}


function checkNomeCognome(){
    var nominativo =document.form.nominativo.value;
    if(!isNaN(nominativo)){
        alert ("il campo non puo' contenere numeri");
        return;
    }
}


function nominativoNotBlank(){
    var nominativo=document.form.nominativo.value;
    if (nominativo!="") {
        alert ("il campo non può essere vuoto");
        return;
        
    }
}

function checkSesso(){
    var check= null;
    var sessoM = document.getElementById("M").value;
    var sessoF = document.getElementById("F").value;
    console.log(sessoF);
    console.log(sessoM);

}


checkSelectAteneo(){
    var uni = document.form.at
}

