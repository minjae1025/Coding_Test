const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");

const [N, M] = input[0].split(" ").map(Number);
let map = input.slice(1).map(line => line.split(""));

let sum = 0;

function checkRow(i) {
    for (let j = 0; j < M; j++) {
        if (map[i][j] === "X") {
            return false;
        }
    }
    return true;
}

function checkCol(j) {
    for (let i = 0; i < N; i++) {
        if (map[i][j] === "X") {
            return false;
        }
    }
    return true;
}

for (let i = 0; i < N; i++) {
    for (let j = 0; j < M; j++) {
        if (map[i][j] !== "X") {
            if (checkRow(i) && checkCol(j)) {
                //console.log(i, j);
                map[i][j] = "X";
                sum++;
            }
        }
    }
}

for (let i = 0; i < N; i++) {
    for (let j = 0; j < M; j++) {
        if (map[i][j] !== "X") {
            if (checkRow(i) || checkCol(j)) {
                //console.log(i, j);
                map[i][j] = "X";
                sum++;
            }
        }
    }
}

//console.log(map.map(row => row.join("")).join("\n"));

console.log(sum);