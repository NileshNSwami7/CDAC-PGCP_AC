import http from 'http';

const server = http.createServer((req,res)=>{
    res.end("You are requested for something");
});

const port = 3000;

server.listen(port,()=>console.log(`Server is runnign on ${port}`));