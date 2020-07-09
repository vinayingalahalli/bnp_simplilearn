//var let const
/*
var is global
let is local
const is local and non modifiable
*/
var x = 10;
function hello() {
    for (var i = 0; i < 10; i++) {
        x = x + i;
    }
    console.log("x=" + x);
}
console.log("x=" + x);
hello();
