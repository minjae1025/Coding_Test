const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split(" ");
let binary = input[0];

const toOctal = (num) => {
    let octal = "";
    while (num.length > 0) {
        let digit3 = num.slice(-3);
        num = num.slice(0, -3);
        if (digit3.length < 3) {
            digit3 = "0".repeat(3 - digit3.length) + digit3;
        }
        // console.log(digit3);
        let decimal = 0;
        for (let i = 0; i < digit3.length; i++) {
            decimal += Number(digit3[i]) * Math.pow(2, digit3.length - 1 - i);
        }
        octal = decimal + octal;
    }

    return octal;
}

console.log(toOctal(binary));