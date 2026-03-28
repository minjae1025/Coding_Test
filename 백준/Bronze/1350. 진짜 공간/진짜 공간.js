const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");
const n = Number(input[0]);
const list = input[1].split(" ").map(Number);
const cluster = Number(input[2]);

let total = 0;

for (let i = 0; i < list.length; i++) {
    const cnt = Math.ceil(list[i] / cluster);
    total += cnt;
}
console.log(total*cluster);
