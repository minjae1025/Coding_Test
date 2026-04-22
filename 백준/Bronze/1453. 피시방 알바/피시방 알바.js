const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");

const N = Number(input[0]);
const list = input[1].split(" ").map(Number);
const seat_list = [];
let count = 0;

for (let i = 0; i < N; i++) {
    if (seat_list.includes(list[i])) {
        count++;
        continue;
    }
    seat_list.push(list[i]);
}

console.log(count);