buf=Buffer.alloc(26);
for(var i=0;i<26;i++){
    buf[i]=i+97;
}
console.log(buf.toString("ascii"));
console.log(buf.toString("utf8",0,5));
console.log(buf.toString("utf8",5,8));

buff2=new Buffer("node");
console.log("buffer 2: "+buff2.toString());

buff3=Buffer.alloc(buff2.length);
buff2.copy(buff3);
console.log("buffer3 : "+buff3.toString());