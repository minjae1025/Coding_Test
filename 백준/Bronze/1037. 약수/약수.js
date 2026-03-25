const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split(/\s+/);
const n = parseInt(input[0]);

const results = (input.slice(1, n + 1).map(Number));

console.log(Math.max(...results) * Math.min(...results));