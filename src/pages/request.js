var intervalId = window.setInterval(function(){
    loadData();
}, 1000);

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
    };
    xmlhttp.open("GET", "http://localhost:9191/gameId/1", true);
    xmlhttp.send();
}


