import express from "express";
import adminRouter from "./src/routers/adminrouter.js";
import productRouter from "./src/routers/productrouter.js";
import welcomeRouter from "./src/routers/welcomerouter.js";

const app = express();
app.use(express.json());

app.use("/",adminRouter);
app.use("/",productRouter);
app.use("/",welcomeRouter);

app.listen(7000);