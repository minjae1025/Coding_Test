const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");

const N = Number(input[0]);
const F = Number(input[1]);

let lastOne = Number(String(N).slice(-1)); // N의 마지막 두 자리
let lastTwo = Number(String(N).slice(-2, -1)); // N의 마지막 한 자리
const prefix = Math.floor(N / 100); // N의 앞 부분

for (let i = 0; i <= 9; i++) {
    for (let j = 0; j <= 9; j++) {
        const candidate = prefix * 100 + i * 10 + j;
        // console.log(candidate);
        if (candidate % F === 0) {
            console.log(String(i) + String(j));
            return;
        }
    }
}   