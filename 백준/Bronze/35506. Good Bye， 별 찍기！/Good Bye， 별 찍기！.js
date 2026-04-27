const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");

const N = Number(input[0]);

let isTop = true;
let circle_count = N - 1;
for (let i = 0; i < N * 2; i++) {
    let line = "";
    for (let j = 0; j < N * 2; j++) {
        if (j === N * 2 - i - 1) {
            line += "*";
        }
        else {
            line += " ";
        }
    }
    let count = 0;
    line += " ";
    for (let j = 0; j < N; j++) {
        if (j === circle_count) {
            line += "*";
        }
        else {
            line += " ";
        }
    }
    line += " ";
    for (let j = 0; j < N; j++) {
        if (j === N - circle_count - 1) {
            line += "*";
        }
        else {
            line += " ";
        }
    }
    // line += ` circle_count: ${circle_count}`;
    console.log(line);
    if (circle_count === 0 && isTop) {
        isTop = false;
    }
    else if (isTop) {
        circle_count--;
    } else {
        circle_count++;
    }
}