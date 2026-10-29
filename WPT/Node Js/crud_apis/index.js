import express from "express";
import { createPool } from "mysql2/promise";

const app = express();
app.use(express.json());

const sqlConnectionPool = createPool({
  host: "localhost",
  port: 3306,
  user: "root",
  password: "Tiger@1",
  database: "front_product",
  connectionLimit: 10,
  queueLimit: 0,
});

app.get("/", (request, response) => {
  return response.send({ message: "Welcome to node js crud apis" });
});

app.post("/product", async (request, response) => {
  try {
    const {
      product_id,
      product_name,
      product_price,
      product_desc,
      product_qty,
    } = request.body;
    const insertQry = `INSERT into product  (product_id,product_name,product_price,product_desc,product_qty) VALUES(?,?,?,?,?)`;
    const [result] = await sqlConnectionPool.query(insertQry, [
      product_id,
      product_name,
      product_price,
      product_desc,
      product_qty,
    ]);
    console.log(result.insertId);
    return response.send({
      message: "Product inserted",
      InsertdId: result.insertId,
    });
  } catch (error) {
    console.log("error");
    return response.status(500).send({ message: "Something went wrong" });
  }
});

app.get("/product/:id", async (request, response) => {
  try {
    const { id } = request.params;
    const selectqry = "SELECT * FROM product where product_id = ?";
    const [result] = await sqlConnectionPool.query(selectqry, [id]);
    
    if(result.length>0){
        response.send(result[0]);
    }
    else{
        return response.status(404).send({message:`Product with id ${ id } is not available`});
    }
  } catch (error) {
    console.log("error");
    return response.status(500).send({message:"Something went wrong"});
  }
});

app.get("/product",async(request,response)=>{
    try{
        const fetchAllQry = "SELECT * FROM product";
        const [result] = await sqlConnectionPool.query(fetchAllQry);

        if(result.length > 0 ){
            response.status(200).send(result);
        }else{
            return response.status(404).send({message:'Product data is not avaialable'})
        }
    }catch(error){
        console.log("error");
        return response.status(500).send({message:"Something wnet wrong"});
    }
})
app.delete("/product/:id",async(request,response)=>{
    try{
const { id } = request.params;
    const deleteQry = "DELETE FROM product where product_id = ? ";
    const [result] = await sqlConnectionPool.query(deleteQry,[id]);
    console.log(result);
    response.status(200).send({message:`Product item delete sucessfully`});
    }
    catch(error){
        console.log("error");
        response.status(500).send({message:"Something went wrong"});
    }
})
app.listen(6000);
