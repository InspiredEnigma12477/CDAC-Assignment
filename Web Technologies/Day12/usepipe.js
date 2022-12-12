const fs=require("fs");
rs=fs.createReadStream("testdata.txt");
ws=fs.createWriteStream("samplecopy.txt");
//rs is source of data and ws is a destination of data
rs.pipe(ws)