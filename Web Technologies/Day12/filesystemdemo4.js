const fs=require("fs");
fs.stat("testdata.txt",function(err,status){
    if(err){
        console.log("error occured",err);
    }
    else{
        fs.open("testdata.txt","r",function(err,fd){
            if(err){
                console.log("error occured",err);
            }else{
                buffer=Buffer.alloc(10);
                //fs.read(filedescriptor,strat buffer,number of bytes to read,offset in file,callbckfunction)
                fs.read(fd,buffer,0,10,null,function(err,bytesread,buffer){
                    console.log(buffer.toString());
                    fs.close(fd);
                });
            } 

        })
    }

});

