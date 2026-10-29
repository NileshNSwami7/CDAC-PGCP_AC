import http from 'http'

const server  = http.createServer((req,res)=>{
    // console.log(req.url);
    // res.end("Routing request")

    if(req.url === '/wdm'){
        res.end("Welcom on wdm");
    }else if(req.url === '/page1'){
        res.end("Welcome on page 1.")
    }else{
        res.end("Invalid request.")
    }
});

const port = 1550;

server.listen(port,console.log(`Server requesting on port ${port}`));

