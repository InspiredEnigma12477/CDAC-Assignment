function f1(){
    console.log("in function f1")
    f4();
    addition(12,13)
}
function addition(a,b){
    console.log("in function addition",(a+b));
}
function f2(){
    console.log("in function f2")
}
function f3(){
    console.log("in function f3")
}
function f4(){
    console.log("in function f4")
}

//f1()
//f2()
//f3()


setTimeout(f1,1000);
setTimeout(f2,500);
f3()
