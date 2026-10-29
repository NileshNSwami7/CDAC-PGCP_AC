import { sqlConnectionPool } from "../config/dbconfig.js";

export async function save(request, response) {
  try {
    const { name, phone, password } = request.body;

    const insertQry = "INSERT INTO admin (name,phone,password) values(?,?,?)";

    const [result] =  await sqlConnectionPool.query(insertQry, [
      name,
      phone,
      password,
    ]);
    return response.status(200).send({ message: "Admin create successfully." });
  } catch (error) {
    console.log("error");
    response.status(500).send({ message: "Something went wrong" });
  }
}
