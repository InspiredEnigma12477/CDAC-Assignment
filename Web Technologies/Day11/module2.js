var f1=function(){
    console.log("in function f1");
}
var f3=function(){
    console.log("in function f3");
}
var f2=function(){
    console.log("in function f2");
    f3();
}

user={id:123,name:"Rajan",desg:"designer"};

module.exports={
    function1:f1,
    function2:f2,
    user:user
}
