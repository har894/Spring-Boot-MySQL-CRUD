var intervalId = window.setInterval(function(){
    loadData();
}, 150);

var gameID = 2;
var envURI = "http://37.252.67.92:9191";

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

           document.getElementById("score-first-team-increment").innerText = myObj.firstTeamName + "+";
           document.getElementById("score-first-team-reduce").innerText = myObj.firstTeamName + "-";
           document.getElementById("score-second-team-increment").innerText = myObj.secondTeamName + "+";
           document.getElementById("score-second-team-reduce").innerText = myObj.secondTeamName + "-";
           document.getElementById("set-first-team-increment").innerText = myObj.firstTeamName + "set +";
           document.getElementById("set-first-team-reduce").innerText = myObj.firstTeamName + "set -";
           document.getElementById("set-second-team-increment").innerText = myObj.secondTeamName + "set +";
           document.getElementById("set-second-team-reduce").innerText = myObj.secondTeamName + "set -";
        }
    }
    xmlhttp.open("GET", envURI+"/gameId/"+gameID, true);
    xmlhttp.send();
}

//Reset Score
function resetScore() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST", envURI+"/resetScore", true);
    xmlhttp.send();
}

function resetSet() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST", envURI+"/resetSet", true);
    xmlhttp.send();
}

//Increment Scores
function incrementFirstTeamScoreFunction() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST", envURI+"/increment/"+gameID+"/1", true);
    xmlhttp.send();
}

function incrementSecondTeamScoreFunction() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST", envURI+"/increment/"+gameID+"/2", true);
    xmlhttp.send();
}

//Reduce scores
function reduceFirstTeamScoreFunction() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST", envURI+"/reduce/"+gameID+"/1", true);
    xmlhttp.send();
}

function reduceSecondTeamScoreFunction() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST", envURI+"/reduce/"+gameID+"/2", true);
    xmlhttp.send();
}

//Increment functions
function incrementFirstTeamSetFunction() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST", envURI +"/incrementSet/"+gameID+"/1", true);
    xmlhttp.send();
}

function incrementSecondTeamSetFunction() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST", envURI +"/incrementSet/"+gameID+"/2", true);
    xmlhttp.send();
}

function reduceFirstTeamSetFunction() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST", envURI+"/reduceSet/"+gameID+"/1", true);
    xmlhttp.send();
}

function reduceSecondTeamSetFunction() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST", envURI+"/reduceSet/"+gameID+"/2", true);
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





