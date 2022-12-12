const http=require("http");
var server=http.createServer(function(req,resp){
    console.log("req.url"+req.url+", Request method : "+req.method);
    //console.log(req);
    resp.writeHeader(200,{"content-type":'text/html'});
    resp.write("<h1>Hello world!!</h1>")
    resp.write("<h2>Welcome to nodejs programming</h2>");
    resp.end();
});
server.listen(3000);
console.log("server is running ar port 3000");

