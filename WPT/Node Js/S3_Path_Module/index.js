import path from 'path'

const fullPath = path.join('/path','test.jsx','test,java');

console.log("Combine path = ",fullPath);

const absoluteform = path.resolve();

console.log(absoluteform);

const extname = path.extname('abc.pdf');

console.log(extname);

if(extname === '.docx'){
    console.log("Ok");
}else{
    console.log("Not Match")
}