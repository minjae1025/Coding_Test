const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");

let T = Number(input[0]);
let idx = 2;
for (let i = 1; i <= T; i++) {
    idx++;
    let sejun = input[idx++].split(" ").map(Number);
    let sebi = input[idx++].split(" ").map(Number);
    idx++;

    let sorted_sejun = sejun.sort((a, b) => a - b);
    let sorted_sebi = sebi.sort((a, b) => a - b);

    while (sorted_sejun.length > 0 && sorted_sebi.length > 0) {
        if (sorted_sejun[0] == sorted_sebi[0]) {
            sorted_sebi.shift();
            continue;
        }

        if (sorted_sejun[0] > sorted_sebi[0]) {
            sorted_sebi.shift();
        }
        else {
            sorted_sejun.shift();
        }
    }

    if (sorted_sejun.length > 0) {
        console.log("S");
    } else if (sorted_sebi.length > 0) {
        console.log("B");
    } else {
        console.log("C");
    }
}