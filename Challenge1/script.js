// Challenge1: Your age in days
function ageInDays(){

    var birthyear= prompt("What year are u born?")
    var Days = (2022-birthyear)*365;
    console.log(Days);
    /*Now the age is printed in the console 
    but this age has to be printed on page 
    how do u do that
    ?? -> dom 
    */
   var h1 = document.createElement('h1'); 
   var display = document.createTextNode('You are'+Days +' days old');
   h1.setAttribute('id','ageInDays');
   h1.appendChild(display);
   document.getElementById('flex-box-result').appendChild(h1);
   
}

function reset(){
    document.getElementById('flex-box-result').remove();
}

function generateCat(){
    var image = document.createElement('img');
    var div = document.getElementById('flex-cat-gen');
    image.src="https://cdn2.thecatapi.com/images/de8.gif";
    div.appendChild(image);
}

//Challenge 3
function rpsGame(yourChoice){
console.log(yourChoice);
//console.log(yourChoice.src);
var humanChoice,botChoice;
humanChoice = yourChoice.id;

botChoice =numberToChoice(randToRpsInt()) ;
console.log('Computer Choice:',botChoice);

results = decideWinner(humanChoice,botChoice);
console.log(results);

message = finalMessage(results);
console.log(message);

rpsFrontEnd(yourChoice.id,botChoice,message);
}

function randToRpsInt(){ 
    return Math.floor(Math.random()*3) ;
}

function numberToChoice(number){
    return['rock','paper','scissors'][number]
}
function decideWinner(yourChoice,computerChoice){
    var rpsDatabase ={
        'rock':{'scissors':1,'rock':0.5,'paper':0},
        'paper':{'rock':1,'paper':0.5,'scissors':0},
        'scissors':{'paper':1,'scissors':0.5,'rock':0}
    }

    var yourScore =rpsDatabase[yourChoice][computerChoice];
    var computerScore = rpsDatabase[computerChoice][yourChoice];

    return [yourScore,computerScore];
}

function finalMessage([yourScore,computerScore]){
    if(yourScore===0){
        return {'message':'You Lost','color':'red'};
    }
    else if(yourScore ===0.5){
        return{'message':'You tied','color':'yellow'}
    }
    else{
        return{'message':'You Won','color':'green'}
    }
}

function rpsFrontEnd(humanImageChoice,botImageChoice,finalMessage){
    varimagesDatabase={
        'rock':document.getElementById('rock').src,
        'paper':document.getElementById('paper').src,
        'scissors':document.getElementById('scissors').src
    }
    //lets remove all the images from screen
    document.getElementById('rock').remove();
    document.getElementById('paper').remove();
    document.getElementById('scissors').remove();

    // creating few divs is left
    var humanDiv = document.createElement('div');
    var botDiv = document.createElement('div');
    var messageDiv = document.createElement('div');

    humanDiv.innerHTML ="<img src='"+imagesDatabase[humanImageChoice]+"'height =150 width =150 style ='box-shadow:0px 10px 50px rgba(37,50,233,1);'>"
    messageDiv.innerHTML ="<h1 style ='color:" +finalMessage['color']+"; font-size: 60px; padding :30px;'>"+finalMessage['message']+"</h1>"
    botDiv.innerHTML ="<img src='"+imagesDatabase[botImageChoice]+"'height =150 width =150 style ='box-shadow:0px 10px 50px rgba(243,38,233,1);'>"

    document.getElementById('flex-box-rps-div').appendChild(humanDiv);
    document.getElementById('flex-box-rps-div').appendChild(messageDiv);
    document.getElementById('flex-box-rps-div').appendChild(botDiv);
    
}