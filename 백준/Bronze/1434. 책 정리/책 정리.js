const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");

const [N, M] = input[0].split(" ").map(Number);
const box_list = input[1].split(" ").map(Number);
const book_list = input[2].split(" ").map(Number);

const box_sum = box_list.reduce((a, b) => a + b, 0);
const book_sum = book_list.reduce((a, b) => a + b, 0);

console.log(box_sum - book_sum);