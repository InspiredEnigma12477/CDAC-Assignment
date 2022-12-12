const http=require("http");
const fs=require("fs");
const url=require("url");
const m5=require("./module5");
server=http.createServer(function(req,resp){
    //parse function will separate the portions of url into pathname and query string
    // in parse function if second parameter is true then it will also parse the query string
     //url will be assigned to pathname property 
    //and querystring will be assigned to query property
    var q=url.parse(req.url,true);
    console.log(q);
    switch(q.pathname){
        //display addition.html form in the browser
        case "/home":
               rs=fs.createReadStream("./public/addition.html");
               resp.writeHeader(200,{'content-type':'text/html'});
               rs.pipe(resp);
               /*rs.on("error",function(){
               })*/
               break;
        case "/submit_data":
            resp.write("<h1> in submite_data");
            resp.write("num1: "+q.query.num1+'  num2: '+q.query.num2);
            var ans=m5.addition(q.query.num1,q.query.num2)
            resp.write("<h1>Addition : "+ ans+"</h1>")
            resp.end();

    }

});
server.listen(3000);
console.log("server running on port 3000");