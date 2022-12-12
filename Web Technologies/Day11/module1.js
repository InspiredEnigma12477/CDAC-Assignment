exports.factorial=function(n){
    f=1;
    for(var i=1;i<=n;i++){
        f=f*i;
    }
    return f;
}

exports.add=function(a,b){
     a=a+10;
     b=b+20;
     return a+b;
}
