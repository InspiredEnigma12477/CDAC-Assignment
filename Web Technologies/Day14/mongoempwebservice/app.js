///define express object
var express=require("express");
var app=express();
/// var cookieparser=require("cookie-parser");
//for setting to specify path
var path=require("path");
var bodyparser=require("body-parser");
var routes=require("./routes/routers")
//mogodb connectivity
var mongoose=require("mongoose");
//to assign nodejs promise object to mongoose promise
//promise object accepts 2 functions if success then what 
//to do and if failure then whta to do
mongoose.promise=global.promise;

//connection url
        // mongodb://<server ip address>:port/<databse name>
const url='mongodb://0.0.0.0:27017/test'

//to make mongodb connection asynchronously
mongoose.connect(url,{
    //useMongoClient:true,
    connectTimeoutMS:1000
},function(err,result){
    if(err){
        console.log("error connecting mogodb");
        console.log(err);
    }
    else{
        //console.log(result);
        console.log("connection done with test database")
    }
});


///define middleware
app.use(bodyparser.json())
app.use(bodyparser.urlencoded({extended:false}))
app.use(express.static(path.join(__dirname,"public")))
///define all routes
//routing will be handled by router.js file
app.use("/",routes);

//start the server
app.listen(3000);
console.log("server started at port 3000")
module.exports=app;