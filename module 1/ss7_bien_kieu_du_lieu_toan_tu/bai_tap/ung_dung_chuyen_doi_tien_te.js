function changeMoney() {
let Amount = document.getElementById("Amount").value;
let From = document.getElementById("From Currency").value;
let To = document.getElementById("To Currency").value;
let Result;

if (From == "USD"&& To == "VND"){
    Result="Result: " + (Amount*23000)+ "VND";
}
else if(From == "VND"&& To == "USD"){
    Result="Result: " + "$" + (Amount/23000);
    }
else if(From == "VND"){
    Result="Result: " + Amount+" VND";
}
else {
Result="Result:" + " $" + Amount;
}
document.getElementById("Result").innerHTML=Result;


}