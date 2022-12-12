const http=require("http");
const fs=require("fs");
const url=require("url");
const m6=require("./module6");
server=http.createServer(function(req,resp){
var q=url.parse(req.url,true);
resp.writeHeader(200,{'content-type':'text/html'})
switch(q.pathname){
  case "/home":
    resp.write("<h1>Welcome to home page</h1>");
    resp.end();
    break;
 case "/fact":
    rs=fs.createReadStream("./public/fact.html");
    rs.pipe(resp);
    break;
case "/find_fact":
    resp.write("<h3>Factorial finding</h3>");
    var ans=m6.factorial(q.query.num1);
    resp.write("<h4>Factorial : "+ans+"</h4>");
    resp.end();
    break;

}
});
server.listen(3000);
console.log("server running on port 3000");