const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split(/\s+/);
const n = parseInt(input[0]);
const results = [];

for (let i = 0; i < n; i++) {
  const a = parseInt(input[1 + i * 2]);
  const b = parseInt(input[2 + i * 2]);
  results.push([a, b]);
}

// console.log(results);

for (const result of results) {
    const [a, b] = result;
    const base = a % 10; // a의 마지막 자리
    if (base === 0) {
        console.log(10); // a가 0인 경우 0 출력
    }
    else {
        const exponent = b % 4 === 0 ? 4 : b % 4; // b를 4로 나눈 나머지
        console.log(Math.pow(base, exponent) % 10); // 나머지가 0인 경우 4로 처리하여 계산
    }
}