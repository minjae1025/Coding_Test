const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");

let o, w;
let i = 0;
let isDead = false;
let count = 0;
while (true) {
    let [n, m] = input[i++].split(" ");
    // console.log(o, w);
    if (n === "0") {
        break;
    }

    if (!isNaN(n)) {
        [o, w] = [Number(n), Number(m)];
        isDead = false;
        count++;
    }
    else {
        if (isDead) {
            continue;
        }

        [n, m] = [n, Number(m)];
        if (n === 'E') {
            w -= m;
        }
        else if (n === 'F') {
            w += m;
        }

        if (w <= 0) {
            console.log(`${count} RIP`);
            isDead = true;
        }
        else {
            if (n === '#') {
                if (w > o / 2 && w < o * 2) {
                    console.log(`${count} :-)`);
                }
                else {
                    console.log(`${count} :-(`);
                }
            }
        }

    }
}
