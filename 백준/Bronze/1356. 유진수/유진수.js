const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");
const n = input[0];

for (let i = 1; i < n.length; i++) {
    let num1 = n.slice(0, i);
    let num2 = n.slice(i);

    let num1_list = num1.split("").map(Number);
    let num2_list = num2.split("").map(Number);

    let sum1 = num1_list.reduce((a, b) => a * b, 1);
    let sum2 = num2_list.reduce((a, b) => a * b, 1);

    if (sum1 === sum2) {
        console.log("YES");
        return;
    }
}
console.log("NO");