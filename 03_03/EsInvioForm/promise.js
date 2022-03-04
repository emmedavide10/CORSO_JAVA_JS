let methodGet = 'GET'
let methodPost = 'POST'
let url = 'http://192.168.2.32:4000/test'
let data = {
    email: 'discepolo1@dalgiorno0.master',
    numero: '777'
};


async function promiseGetData(method, url){
    return new Promise((resolve,reject) => {
        var request = new XMLHttpRequest();
        request.open(method,url);
        request.send();

        request.onload = () => {
            resolve(request.response);
            console.log(request.response);
        }

        /*request.onerror = () => {
            reject(request.error);
        }*/
    })
}

console.log(promiseGetData(methodGet,url));



function sendDataPost(method, url){
    return new Promise((resolve,reject) => {
        var xmlhttp = new XMLHttpRequest();   
        xmlhttp.open(method, url);
        xmlhttp.setRequestHeader("Content-Type", "application/json");
        xmlhttp.send(JSON.stringify(data));
    
        xmlhttp.onload = () =>{
            if(xmlhttp.status >= 400){
                reject(xmlhttp.reject);
                console.log("NOOO")
            }else{
                console.log("DAJEEE");
                resolve(xmlhttp.resolve);
            }
        }
    });
}


sendDataPost(methodPost,'http://192.168.2.32:4000/test?nome=Davide&cognome=Mirra')

