var datalist = document.getElementById("dataTable");

function emptytable(){
    datalist.innerHTML = "";
}

function firstMovie(){
    const Url = 'http://localhost:8080/magic';
    fetch(Url)
        .then(response => {return response.text().then( function (text){
            console.log(text); datalist.innerHTML = text;})})
}

function randomMovie(){
    const Url = 'http://localhost:8080/random';
    fetch(Url)
        .then(response => {return response.text().then( function (text){
            console.log(text); datalist.innerHTML = text;})})
}

function topTen(){
    const Url = 'http://localhost:8080/topten';
    fetch(Url)
        .then(response => {return response.text().then( function (text){
            console.log(text); datalist.innerHTML = text;})})
}

function topTenRandom(){
    const Url = 'http://localhost:8080/randomTopTen';
    fetch(Url)
        .then(response => {return response.text().then( function (text){
            console.log(text); datalist.innerHTML = text;})})
}

function comedieswithaward(){
    const Url = "/comedieswithaward"
    fetch(Url)
        .then(response => {return response.text().then( function (text){
            console.log(text); datalist.innerHTML = text;})})
}

