import{Router} from "express";
import {getAll,getById,save,deleteById} from "../controllers/productcontroller.js";

const productRouter = Router();

productRouter.get("/rpoduct",getAll);

productRouter.get("/product/:id",getById);

productRouter.post("/product",save);

productRouter.delete("/product/:id",deleteById);

export default productRouter;