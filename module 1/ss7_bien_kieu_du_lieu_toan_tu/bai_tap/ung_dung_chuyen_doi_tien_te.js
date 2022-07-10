function changeMoney() {
let amount = document.getElementById("Amount").value;
let from = document.getElementById("From Currency").value;
let to = document.getElementById("To Currency").value;
let result;

if (from == "USD"&& to == "VND"){
    result="Result: " + (amount*23000)+ "VND";
}
else if(from == "VND"&& to == "USD"){
    result="Result: " + "$" + (amount/23000);
    }
else if(from == "VND"){
    result="Result: " + amount+" VND";
}
else {
result="Result:" + " $" + amount;
}
document.getElementById("Result").innerHTML=result;


}