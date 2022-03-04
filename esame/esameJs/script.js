var urlGet = "http://192.168.2.32:4000/getUserData" 
var urlSet = "http://192.168.2.32:4000/setUserData" 
var urlUpdate = "http://192.168.2.32:4000/updateUserData" 
var urlDelete = "http://192.168.2.32:4000/deleteUserData" 




function getDataForm(){
    var nome = document.getElementById("nome").value;
    console.log(nome);
    var cognome = document.getElementById("cognome").value;
    console.log(cognome);
    var eta = document.getElementById("eta").value;
    console.log(eta);
    var email = document.getElementById("email").value;
    console.log(email);
    var password = document.getElementById("password").value;
    console.log(password);
    var confPassword = document.getElementById("confPassword").value;
    console.log(confPassword);
    var sesso = getRadioValue();
   
    var regione = document.getElementById("regioni").value;
    console.log(regione);

    var data = {
        nome: nome,
        cognome: cognome,
        email: email,
        password: password,
        confPassword: confPassword,
        regione: regione,
        sesso: sesso,
        eta: eta
    };

    console.log(data);

    return data;
}

function set(method){
    let data = getDataForm();

    var p = new Promise(function(resolve, reject){
        var xmlhttp = new XMLHttpRequest();   
        xmlhttp.open(method, urlSet);
        xmlhttp.setRequestHeader("Content-Type", "application/json");
        xmlhttp.send(JSON.stringify(data));

        xmlhttp.onload = () => {
                if(data.password == data.confPassword){
                    resolve('Account creato correttamente')
                } else {
                    reject(xmlhttp.statusText)
                }
    
            };

    });
    p.then(res => {
        document.getElementById('resolve').innerHTML = res;
    }).catch((err) => {
        document.getElementById('reject').innerHTML = err;
    })
}


function get(method){

    var email = document.getElementById("email").value;
    console.log(email);
    var password = document.getElementById("password").value;
    console.log(password);

    var data = {
        email: email,
        password: password
    };

        var xmlhttp = new XMLHttpRequest();   
        xmlhttp.open(method, urlGet);
        xmlhttp.setRequestHeader("Content-Type", "application/json");
        xmlhttp.send(JSON.stringify(data));

        xmlhttp.onload = () => {
                if(xmlhttp.status === 200 ){
                    document.getElementById('esitoStatus').innerHTML = "get OK";
                } else if(xmlhttp.status === 403) {
                    document.getElementById('esitoStatus').innerHTML = xmlhttp.statusText;
                }
        };
}


function update(method){

        var data = getDataForm();

        var p = new Promise(function(resolve, reject){
            var xmlhttp = new XMLHttpRequest();   
            xmlhttp.open(method, urlUpdate);
            xmlhttp.setRequestHeader("Content-Type", "application/json");
            xmlhttp.send(JSON.stringify(data));
    
            xmlhttp.onload = () => {
                    if(xmlhttp.status === 200 ){
                        resolve(data)
                    } else {
                        reject(xmlhttp.statusText)
                    }       
                };
    
        });
        p.then(res => {
            document.getElementById('resolve').innerHTML = res;
        }).catch((err) => {
            document.getElementById('reject').innerHTML = err;
        })
}


function deletee(method){

    var email = document.getElementById("email").value;
    console.log(email);
    var password = document.getElementById("password").value;
    console.log(password);

    var data = {
        email: email,
        password: password
    };

        var xmlhttp = new XMLHttpRequest();   
        xmlhttp.open(method, urlGet);
        xmlhttp.setRequestHeader("Content-Type", "application/json");
        xmlhttp.send(JSON.stringify(data));

        xmlhttp.onload = () => {
                if(xmlhttp.status === 200 ){
                    document.getElementById('esitoStatus').innerHTML = data;
                } else if(xmlhttp.status === 403) {
                    document.getElementById('esitoStatus').innerHTML = xmlhttp.statusText;
                }

        };
}


function getRadioValue() {
    for (var i = 0; i < document.getElementsByName('sesso').length; i++) {
        if (document.getElementsByName('sesso')[i].checked) {
            return document.getElementsByName('sesso')[i].value;
        }
    }
}


