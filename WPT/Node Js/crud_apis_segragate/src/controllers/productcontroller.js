import { sqlConnectionPool} from "../config/dbconfig.js";

export async function save (request,response){

    try{
        const {product_id,product_name,product_price,product_desc,product_qty} = request.body;

        const insertQry = "INSERT INTO product {product_id,product_name,product_price,product_desc,product_qty} values (?,?,?,?,?)";

        const [result] = await sqlConnectionPool.query(insertQry,[product_id,product_name,product_price,product_desc,product_qty]);

        console.log(result);

        response.status(200).send({message:"Data saved successfully"});
    }
    catch(error){
        console.log(error);
        response.status(500).send({message:"Something went wrong"});
    }
}

export async function getAll(request,response){
    try{
        const getAllQry = "SELECT * FROM product";

        const[result] = await sqlConnectionPool.query(getAllQry);

        if(result.length > 0 ){
            console.log(result);
        }else{
            response.statsu(404).send({message:"No data Availabel."})
        }

        response.status(200).send({message:"Fetch data successfully"});
    }
    catch(error){
        console.log("error");
        response.status(500).send({message:"Something went wrong"});
    }
}

export async function getById(request,response){
   try{
    const {id} = request.params;
    const getByIdQry = "SELECT * FROM getqury where product_id = ?";
    const [result] = await sqlConnectionPool.query(getByIdQry,[id]);

    console.log(result);

    return response.status(200).send({message:`The Product id  ${id} is not found`});
   }
   catch(error){
    console.log("error");
    return response.status(500).send({message:"Something went wrong"});
   }
}

export async function deleteById(request,response){
    try{
        const {id} = request.params;

        const deleteByIdQery = "DELETE FROM product where product_id = ?";

        const [result] = await sqlConnectionPool.query(deleteByIdQery,[id]);

        console.log(result);
        return response.statsu(200).send({message:"Data delete successfully"});
    }catch(error){
        console.log("error");
        response.statsu(500).send({message:"Something went wrong"});
    }
}