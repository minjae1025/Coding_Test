const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split(" ");
let num1 = Number(input[0]);
let num2 = Number(input[1]);

let start = num1 > num2 ? num1 : num2;
let end = num1 > num2 ? num2 : num1;

const startRow = Math.ceil(start / 4);
const startCol = start % 4 === 0 ? 4 : start % 4;
const endRow = Math.ceil(end / 4);
const endCol = end % 4 === 0 ? 4 : end % 4;

const distance = Math.abs(startRow - endRow) + Math.abs(startCol - endCol);
console.log(distance);