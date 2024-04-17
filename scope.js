let x=11;
let y=12;
var z=14;
function f(){
    if(true){
        let x=12;
        const y=13;
        var z=20;
        console.log(x,y,z);
    }
    console.log(x, y,z);
}
f();
console.log(x,y,z);