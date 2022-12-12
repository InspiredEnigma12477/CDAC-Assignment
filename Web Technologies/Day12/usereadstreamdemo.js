const fs=require("fs");
rs=fs.createReadStream("testdata.txt");
//by default buffer is 65536
//to change the size of the buffer use highWaterMark option
//rs=fs.createReadStream("testdata.txt","utf8",{highWaterMark:70000});
var d="";
//when data gets populated in the stream then data event occurs
rs.on("data",function(chunk){
    d=d+chunk;
    console.log("data event occured"+chunk.length)
});

//when data ends
rs.on("end",function(){
    console.log("data : "+d);
    console.log("in end event");
});

//if error occurs
rs.on("error",function(err){
    console.log("error occured");
});
console.log("after all events handler definition")
console.log("reaching to end");
