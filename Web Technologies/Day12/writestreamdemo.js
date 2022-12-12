const fs=require("fs");
ws=fs.createWriteStream("myfile.dat");
var data="this is data line 1";
var data1="this is data line 2";
ws.write(data,'utf8');
ws.write(data1,'utf8');
ws.end();

ws.on("finish",function(){
    console.log("writing is finished");
})
ws.on("error",function(err){
    console.log("error occured",err);
})
