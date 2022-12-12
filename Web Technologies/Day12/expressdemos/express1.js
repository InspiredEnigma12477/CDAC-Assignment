//create package.json
//npm init
//install expressjs locally
//npm install express --save
//install body-parser 
//npm install body-parser
//impoort express and create its object
const express=require("express");
const app=express();

//define middleware
app.use(function(req,resp,next){
   console.log("url : "+req.url+"method: "+req.method);
   next();
})
app.use(function(req,resp,next){
    console.log("in second moddleware");
    next();
 });


///router functions
app.get("/",function(req,resp){
resp.send("<h1>In / url</h1>")
});
app.get("/aboutus",function(req,resp){
    resp.send("<h1>in aboutus url</h1>")
});
app.get("/home",function(req,resp){
    resp.send("<h1>In home url</h1>")
});

app.listen(3000);
console.log("server is running at port 3000")