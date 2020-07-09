//var let const
/*
var is global
let is local
const is local and non modifiable
*/
var x: number = 10;
function hello() {
    const m:number=100;
    var z:number=1000;
    for (let i = 0; i < 10; i++) {
        
        x=x+i+m;
    }
    if(m==10){
        console.log("z = "+z); // var is global to block
      //  console.log("i = "+i); // let & consta re local to block
    }
    console.log("x="+x);
    console.log("m = "+m);
    console.log("z = "+z);
}
console.log("x="+x);
//console.log("z = "+z); //remains local
//console.log("m = "+m); const is a local scope
hello();

const i1:number=100;
//i1++; its constant cannot be modified