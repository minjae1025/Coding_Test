const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");

const [n, l, d] = input[0].split(" ").map(Number);

let time = 0;
let isPlaying = true;
let musicCount = 1;
let currentMusicTime = 0;
let callCount = 0;
let breakTime = 0;
let isEnd = false;

const maxTime = n * l + (n - 1) * 5;
while (time <= maxTime) {
    if (isPlaying) {
        if (currentMusicTime === l) {
            isPlaying = false;
            currentMusicTime = 0;
            musicCount++;
        }
        currentMusicTime++;
    }
    else {
        if (breakTime < 4) {
            breakTime++;
        }
        else {
            isPlaying = true;
            breakTime = 0;
        }
    }

    if (time % d === 0) {
        if (!isPlaying) {
            console.log(time);
            isEnd = true;
            break;
        }
        callCount++;
    }

    // console.log(`Time: ${time}, Music: ${isPlaying ? musicCount : 'Break'}, Call Count: ${callCount}`);

    time++;
}

if (!isEnd) {
    console.log(d * callCount);
}