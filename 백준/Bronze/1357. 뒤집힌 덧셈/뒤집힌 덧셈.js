const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split(" ");
const num1 = Number(input[0]);
const num2 = Number(input[1]);

function reverse(num) {
    const reversed = num.toString().split("").reverse().join("");
    return parseInt(reversed);
}

const reversedNum1 = reverse(num1);
const reversedNum2 = reverse(num2);
console.log(reverse(reversedNum1 + reversedNum2));