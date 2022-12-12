const express=require("express");
var app=express();
var bodyparser=require("body-parser");
const memparr=require("./moduleemparr");

app.use(bodyparser.urlencoded({extended:false}));


app.get("/",function(req,resp){
  resp.sendFile("public/empform.html",{root:__dirname});
});

app.get("/empdata",function(req,resp){
  if(req.query.btn==="add"){
        var id=parseInt(req.query.id);
        var name=req.query.name;
        var desg=req.query.desg;
        var ob={id,name,desg};
        memparr.isertEmp(ob);
        console.log(memparr.getlength());
        resp.send("<h1>added successfully</h1>")
  }
  else{
    var id=req.query.id;
    var ob=memparr.searchEmp(id);
    if(ob!=null){
      resp.send(JSON.stringify(ob));
      //resp.send("id: "+ob.id+"<br>name: "+ob.name+"<br> Desg : "+ob.desg);
    }
    else{
      resp.send("Employee not found");
    }

  }
  })
  
  app.listen(3000);
  console.log("server running at port 3000");


