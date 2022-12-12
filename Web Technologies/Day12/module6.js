exports.factorial=function(num1){
    var num=parseInt(num1);
    f=1;
    for(var i=1;i<=num;i++){
        f=f*i;
    }
    return f;
}