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
        }
    }
    xmlhttp.open("GET", envURI+"/gameId/"+gameID, true);
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





