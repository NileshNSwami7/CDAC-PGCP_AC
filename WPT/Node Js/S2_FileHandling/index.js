import {readFile,writeFile,appendFile,mkdir} from 'fs/promises';

const read_FIle = async (filename) => {
    const data = await readFile(filename,"UTF-8");
    console.log(data);
}

read_FIle('sample.txt');

const create_file = async(filename,content)=>{
    await writeFile(filename,content)
    console.log("File created. ");
}

create_file('SampleWrite.txt',"Create File for testing filehandling");


const append_file = async(filename,content)=>{
    await appendFile(filename,content)
    console.log("File append Successfully");
}

append_file("SampleWrite.txt"," Extra content add successfully.");

const create_dir = async(dir)=>{
  await mkdir(dir,{recursive:true});  
}

create_dir('src/Reactjs');