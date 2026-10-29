console.log("Node js practice");
console.log(2+3);
console.log(20*300);

console.log("Nodemon installed");


setTimeout(()=>{
    console.log("function one");
    setTimeout(() => {
        console.log("fetching user info");
        setTimeout(()=>{
            console.log("fetching user friendlist");
        },5000)
    }, 3000)
},2000);