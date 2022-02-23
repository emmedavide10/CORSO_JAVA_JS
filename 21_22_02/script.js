/*function isANumber(){
    var stringa = document.form.stringa.value;
    console.log(stringa);

    for (let index = 0; index < stringa.length; index++) {
        //let asciiString = stringa.charCodeAt(stringa[index]);
        //console.log(asciiString);
        console.log(stringa[index]);
        var char = stringa[index];
        var charParsedInt = parseInt(char);
        if(charParsedInt>=0 && charParsedInt<=9){
            continue;
        }else{
            alert("la stringa NON e' un numero");
            return;
        }     
    }
    alert("la stringa e' un numero");
    return;
}*/


/*function isCointained(){
    var stringa1 = document.form.stringa1.value;
    var stringa2 = document.form.stringa2.value;

    console.log(stringa1);
    console.log(stringa2);

    var lung1 = stringa1.length;
    var lung2 = stringa2.length;

    if(lung1<=lung2)
    check(stringa2,stringa1);
    else if(lung1>lung2)
    check(stringa1,stringa2);
    }


    function check(stringa1,stringa2){    
        
        var i = 0;
        while(i<stringa1.length){
            for (let j = 0; j < stringa2.length; j++) {
                if(stringa2[j]!=stringa1[i]){
                    break;
                }else{
                    continue;
                }
            }
            alert("la stringa "+stringa2+ " e' contenuta nella stringa "+stringa1);
            i++;
            return;
        }
        alert("la stringa "+stringa2+ " NON e' contenuta nella stringa "+stringa1);
    }*/


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
    
    
    /*checkSelectAteneo(){
        var uni = document.getElementsByName("ateneo")[0].value;
        console.log(uni);

        for (let index = 0; index < uni.length; index++) {
            if(uni[index]!=null && uni[index]!= "" && uni[index]!=undefined){
                return;
            }else{
                alert("ERRORE!!")
                return;
            }            
        }
    }*/
    
    