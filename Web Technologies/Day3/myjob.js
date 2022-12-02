var i=1;
function myfunction(){
     i=i*100;
     postMessage(i);
     setTimeout(myfunction,500);
}
myfunction();