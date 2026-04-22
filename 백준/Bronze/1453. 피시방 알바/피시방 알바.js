const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");

const N = Number(input[0]);
const list = input[1].split(" ").map(Number);
const seat_set = new Set(list);

console.log(N - seat_set.size);