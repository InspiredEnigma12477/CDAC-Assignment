const fs=require("fs");
fs.stat("testdata.txt",function(err,status){
    if(err){
        console.log("error occured",err);
    }
    else{
        console.log(status);
        console.log("done");
        console.log("is file"+status.isFile());
        console.log("is directory :"+status.isDirectory());
        console.log("size of file :"+status.size)
    }
})
console.log("after fs.state");