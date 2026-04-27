const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");

const T = Number(input[0]); // 테스트 케이스 수
let index = 1;
let result = [];

for (let i = 0; i < T; i++) {
    const N = Number(input[index++]);
    
    let maxA = 0n;
    let maxB = 0n;
    let maxC = 0n;
    let isPossible = true;

    for (let j = 0; j < N; j++) {
        const [a, b, c, p] = input[index++].split(" ").map(BigInt);

        if (isPossible) {
            if (a > maxA) maxA = a;
            if (b > maxB) maxB = b;
            if (c > maxC) maxC = c;
            let day = BigInt(j + 1) + maxA + maxB + maxC;

            if (day > p) {
                isPossible = false;
                index += (N - 1 - j);
                break;
            }
        }
    }
    
    result.push(isPossible ? "YES" : "NO");
}

console.log(result.join("\n"));