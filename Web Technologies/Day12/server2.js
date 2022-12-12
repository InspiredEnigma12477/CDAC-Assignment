const http=require("http");
//function processRequest(req,resp){}
//http.createServer(processRequest)
server=http.createServer(function(req,resp){
resp.writeHeader(200,{'content-type':'text/html'});
console.log("url"+req.url)
if(req.url==="/home" && req.method==="GET"){
     resp.write("<h1>You selected home</h1>");
     resp.write("<h3>welcome to our system services</h3>");
     resp.end();
}else if(req.url==="/aboutus"){
    resp.write("<h1>You selected aboutus</h1>");
    resp.write("<h2>we deliver multiple services with best quality</h2>");
    resp.end();
}
});
server.listen(3000);
console.log("server running ar port 3000");