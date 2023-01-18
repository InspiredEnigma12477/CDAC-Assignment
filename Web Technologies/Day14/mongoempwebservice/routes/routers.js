var express=require("express");
const { modelNames } = require("mongoose");
var mongoose=require("mongoose");
var schema=mongoose.Schema;
var router=express.Router();

//design model using mongoose schema
var empschema=new schema({
   // _id:Number,
    empid:String,
    ename:{type:String,trim:true,required:true},
    sal:String
//sal:{type:Number,validate:/[0-9]*/}
})

//retireve data from emptab collection and 
//its schema is defined using empschema
//model(name,schema object, collection name)
//collection name is optional if model name and collection name is same
var Emp=mongoose.model('emptab',empschema,'emptab');

router.get("/employee",function(req,resp){
    Emp.find().exec(function(err,data){
        if(err){
            resp.status(500).send("no data found");
        }
        else{
            resp.send(data);
        }
    })

});

router.get("/employee/:empid",function(req,resp){
    console.log("empid: "+req.params.empid);
    Emp.find({empid:req.params.empid}).exec(function(err,data){
        if(err){
            resp.status(500).send("no data found");
        }
        else{
            resp.send(data);
        }
    })
    

});

//to add data handle post request
router.post("/employee",function(req,resp){
    var empob=new Emp({empid:req.body.empid,ename:req.body.ename,sal:req.body.sal})
    empob.save(function(err,data){
           if(err){
            console.log(err);
             resp.status(500).send("no data added");
           }else{
            resp.send(data);
           }
    })
});


//update the document retrived with id and modify it in the database
router.put("/employee/:empid",function(req,resp){
    console.log(req.body);
    Emp.findOne({empid:req.body.empid},function(err,doc){
        if(err){
            resp.status(500).send("no data updated");
        }
        else{
            console.log("in else")
            doc.empid=req.body.empid;
            doc.ename=req.body.ename;
            doc.sal=req.body.sal;
            doc.save(function(err,data){
                if(err){
                    console.log(err);
                    resp.status(500).send("no data updated");
                }
                else{
                    resp.send(data)
                }
                
            })
        }
       
    })
});
//delete the document with given id and go back to the table
http://localhost:3000/employee/12
router.delete("/employee/:empid",function(req,resp){
    Emp.remove({empid:req.params.empid},function(err,doc){
        if(err){
            resp.status(500).send("no data deleted");
        }
        
        resp.status(200).send("deleted successfully");
    });
});


module.exports=router;