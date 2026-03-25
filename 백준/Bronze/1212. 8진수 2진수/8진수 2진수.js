const fs = require('fs');
const input = fs.readFileSync(0).toString().trim();

if (input === "0") {
    console.log("0");
    return;
}

let result = "";

for (let i = 0; i < input.length; i++) {
    const num = parseInt(input[i], 8);
    let binary = num.toString(2);

    if (i > 0) {
        binary = binary.padStart(3, "0");
    }
    
    result += binary;
}

console.log(result);