const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");

const [N, Q] = input[0].split(" ").map(Number);
const music = input.slice(1, N + 1).map(Number);
const time = input.slice(N + 1, N + 1 + Q).map(Number);

for (let i = 0; i < Q; i++) {
    const t = time[i];
    let isFind = false;
    let second = 0;
    for (let j = 0; j < N; j++) {
        for (let k = 0; k < music[j]; k++) {
            if (t === second && !isFind) {
                console.log(j+1);
                isFind = true;
                break;
            }
            second++;
        }
    }
    if (!isFind) {
        console.log(1);
    }
}