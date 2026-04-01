const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");

let count = {};

for (item of input) {
    item = item.replace(/\s/g, "");
    for (char of item) {
        if (char in count) {
            count[char]++;
        }
        else {
            count[char] = 1;
        }
    }
}
// console.log(count);

let max = 0;
for (key in count) {
    if (count[key] > max) {
        max = count[key];
    }
}

console.log(Object.keys(count).filter(key => count[key] === max).sort().join(""));