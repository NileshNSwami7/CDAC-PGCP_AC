import { createPool } from "mysql2/promise";

export const sqlConnectionPool = createPool({
    host:"localhost",
    port:3306,
    user:"root",
    password:"Tiger@1",
    database:"front_product",
    connectionLimit:10,
    queueLimit: 0
});