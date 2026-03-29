const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split(" ");
const start = Number(input[0]);
const end = Number(input[1]);

let count = 0;
let num = 1;
let sum = 0;
for (let i = 1; i <= end; i++) {
    if (i >= start) {
        sum += num;
    }
    count++;

    if (count >= num) {
        count = 0;
        num++;
    }
    // console.log(list);
}
console.log(sum);