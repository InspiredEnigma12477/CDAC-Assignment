const express=require("express");
var app=express();
var bodyparser=require("body-parser");
var m5=require("./module5");

//this line will separate parts of url and gives the 
//data in query object
//extended:false will use querystring module to parse the data

app.use(bodyparser.urlencoded({extended:false}));

app.get("/home",function(req,resp){
   resp.sendFile("public/hello.html",{root:__dirname})
});

app.get("/aboutus",function(req,resp){
    resp.send("<h2>about us</h2>")
 });
app.get("/displayform",function(req,resp){

resp.sendFile("public/addition.html",{root:__dirname})
});
app.post("/submit_data",function(req,resp){
     var num1=req.body.num1;
     var num2=req.body.num2;
     var result=m5.addition(num1,num2);
     resp.send("<h2>result : "+result+"</h2>")
})
 app.listen(3000);
 console.log("server running at port 3000");
