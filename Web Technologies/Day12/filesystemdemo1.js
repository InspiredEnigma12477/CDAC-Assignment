const fs=require("fs");
data=fs.readFileSync("testdata.txt");
console.log(data.toString());
fs.writeFileSync("test.txt","Hello world!!");
data1=fs.readFileSync("test.txt");
console.log(data1.toString());
