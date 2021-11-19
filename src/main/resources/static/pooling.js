var intervalId = window.setInterval(function(){
    loadData();
}, 150);

function loadData() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
           var myObj = JSON.parse(this.responseText);
           document.getElementById("first-team-name").innerText = myObj.firstTeamName;
           document.getElementById("first-team-score").innerText = myObj.firstTeamScore;
           document.getElementById("first-team-set-score").innerText = myObj.firstTeamSetScore;
           document.getElementById("second-team-set-score").innerText = myObj.secondTeamSetScore;
           document.getElementById("second-team-score").innerText = myObj.secondTeamScore;
           document.getElementById("second-team-name").innerText = myObj.secondTeamName;
        }
    }
    xmlhttp.open("GET", "http://37.252.67.92:9191/gameId/1", true);
    xmlhttp.send();
}

function incrementFirstTeamScoreFunction() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST", "http://37.252.67.92:9191/increment/1/1", true);
    xmlhttp.send();
}

function reduceFirstTeamScoreFunction() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST", "http://37.252.67.92:9191/reduce/1/1", true);
    xmlhttp.send();
}

function incrementSecondTeamScoreFunction() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST", "http://37.252.67.92:9191/increment/1/2", true);
    xmlhttp.send();
}

function reduceSecondTeamScoreFunction() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST", "http://37.252.67.92:9191/reduce/1/2", true);
    xmlhttp.send();
}

function incrementFirstTeamSetFunction() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST", "http://37.252.67.92:9191/incrementSet/1/1", true);
    xmlhttp.send();
}

function reduceFirstTeamSetFunction() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST", "http://37.252.67.92:9191/reduceSet/1/1", true);
    xmlhttp.send();
}

function incrementSecondTeamSetFunction() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST", "http://37.252.67.92:9191/incrementSet/1/2", true);
    xmlhttp.send();
}

function reduceSecondTeamSetFunction() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST", "http://37.252.67.92:9191/reduceSet/1/2", true);
    xmlhttp.send();
}

function setsFunction() {
    const x = document.getElementById("setSetting");
    const v = document.getElementById("scoreSetting")
    v.style.display = "none"
    if (x.style.display != "block") {
        x.style.display = "block";
    } else {
        x.style.display = "none";
    }
}

function scoresFunction() {
    const y = document.getElementById("scoreSetting");
    const z = document.getElementById("setSetting")
    z.style.display = "none"
    if (y.style.display != "block") {
        y.style.display = "block";
    } else {
        y.style.display = "none";
    }
}





