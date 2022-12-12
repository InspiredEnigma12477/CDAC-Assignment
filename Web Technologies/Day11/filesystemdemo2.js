const fs=require("fs");
console.log("at the beginning of the code")
fs.readFile("myfile.txt",function(err,data){
     if(err){
        console.log("Error occured",err);
     }
     else{
        console.log(data.toString());
     }
});
fs.readFile("testdata.txt",function(err,data){
    if(err){
       console.log("Error occured",err);
    }
    else{
       console.log(data.toString());
    }
});
console.log("after synchronous function");
console.log("at the end of the code");
