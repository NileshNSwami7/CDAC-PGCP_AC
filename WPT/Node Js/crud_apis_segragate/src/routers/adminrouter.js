import {Router} from "express";
import {save} from "../controllers/admincontroller.js";

const adminRouter = Router();
adminRouter.post("/admin",save);
export default adminRouter;
