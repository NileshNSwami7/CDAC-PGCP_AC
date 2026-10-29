import{Router} from "express";
import{welcome} from "../controllers/welcomcontroller.js"

const welcomeRouter = Router();
welcomeRouter.get("/",welcome);

export default welcomeRouter;