const http=require("http");
server=http.createServer(function(req,resp){
    console.log("req.url"+req.url);
    resp.writeHeader(200,{'content-type':'text/html'});
    switch(req.url){
        case "/home":
           resp.write("<h1>you selected home</h1>");
           resp.write("<h1>welcome to ousr application</h1>");
           resp.end();
           break;
        case "/aboutus":
            resp.write("<h1>you selected aboutus</h1>");
            resp.write("<h1>we provide good services</h1>");
            resp.end("<h3>end of response</h3>");
            break;
        default:
            resp.write("<h1>you are in default case</h1>");
            resp.write("<h1>welcome</h1>");
            resp.end("<h3>end of response</h3>");
    }
});
server.listen(3000);
console.log("server is running at port 3000");
