const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split(" ");
const start = Number(input[0]);
const end = Number(input[1]);

let list = [];
let count = 0;
let num = 1;
for (let i = 1; i <= end; i++) {
    if (i >= start) {
        list.push(num);
    }
    count++;

    if (count >= num) {
        count = 0;
        num++;
    }
    // console.log(list);
}
console.log(list.reduce((a, b) => a + b, 0));