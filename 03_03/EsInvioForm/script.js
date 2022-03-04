
let methodGet = 'GET'
let methodPost = 'POST'
let url = 'http://192.168.2.32:4000/test'


function getDataForm(){
    var nome = document.getElementById("nome").value;
    console.log(nome);
    var cognome = document.getElementById("cognome").value;
    console.log(cognome);
    var email = document.getElementById("email").value;
    console.log(email);
    var numero = document.getElementById("numero").value;
    console.log(numero);
    var descrizione = document.getElementById("descrizione").value;
    console.log(descrizione);
    var indirizzo = document.getElementById("indirizzo").value;
    console.log(indirizzo);

    let data = {
        nome: nome,
        cognome: cognome,
        email: email,
        numero: numero,
        descrizione: descrizione,
        indirizzo: indirizzo
    };

    console.log(data);

    return data;
}

function sendDataPost(methodPost,url){

    let data = getDataForm();

    return new Promise((resolve,reject) => {
        var xmlhttp = new XMLHttpRequest();   
        xmlhttp.open(methodPost, url);
        xmlhttp.setRequestHeader("Content-Type", "application/json");
        xmlhttp.send(JSON.stringify(data));
        xmlhttp.responseType = "json"

        xmlhttp.onload = () => {
            if(xmlhttp.status==200){
                resolve(xmlhttp.response);
                console.log(xmlhttp.response);
                alert("INVIO CORRETTO");
            }
        }
    });
}