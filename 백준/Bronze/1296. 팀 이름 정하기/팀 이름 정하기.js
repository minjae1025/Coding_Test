const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");
const name = input[0];
const team = input.slice(2);
team.sort((a, b) => a.localeCompare(b));

const name_count = { 'L': 0, 'O': 0, 'V': 0, 'E': 0 };
for (let char of name) {
    if (name_count[char] !== undefined) {
        name_count[char]++;
    }
}

const alp_count = [];
for (let word of team) {
    let count = { 'L': 0, 'O': 0, 'V': 0, 'E': 0 };
    for (let char of word) {
        if (count[char] !== undefined) {
            count[char]++;
        }
    }

    count['L'] += name_count['L'];
    count['O'] += name_count['O'];
    count['V'] += name_count['V'];
    count['E'] += name_count['E'];

    alp_count.push(count);
}

const score = [];
for (let count of alp_count) {
    const total = ((count['L'] + count['O']) * (count['L'] + count['V']) * (count['L'] + count['E']) * (count['O'] + count['V']) * (count['O'] + count['E']) * (count['V'] + count['E'])) % 100;
    score.push(total);
}

console.log(team[score.indexOf(Math.max(...score))]);