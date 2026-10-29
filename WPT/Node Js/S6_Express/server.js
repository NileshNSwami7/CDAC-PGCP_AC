import express from  express;
import { createPool } from "mysql2/promise";

const app = express();
app.use(express.json);

const sqlConnectionPool = createPool({
    host:"localhost",
    port:3306,
    user:"root",
    password:"Tiger@1",
    database:"frontt_product",
    connectionLimit:10,
    queueLimit:0

});

app.get("/",(request,response)=>{
 console.log("Welcome to node crud apis");   
})

app.listen(6000);