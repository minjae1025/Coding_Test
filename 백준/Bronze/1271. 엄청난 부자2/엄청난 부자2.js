const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split(" ");
const n = BigInt(input[0]);
const m = BigInt(input[1]);

console.log((n / m).toString());
console.log((n % m).toString());