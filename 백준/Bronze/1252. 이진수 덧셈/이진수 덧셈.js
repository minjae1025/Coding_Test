const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split(" ");
const n = input[0];
const m = input[1];

//이진수 덧셈
function addBinary(a, b) {
    let carry = 0;
    let result = "";
    const maxLength = Math.max(a.length, b.length);     
    a = a.padStart(maxLength, "0");
    b = b.padStart(maxLength, "0");

    for (let i = maxLength - 1; i >= 0; i--) {
        const sum = parseInt(a[i]) + parseInt(b[i]) + carry;
        result = (sum % 2) + result;
        carry = Math.floor(sum / 2);
    }

    if (carry) {
        result = "1" + result;
    }

    let allZero = true;
    for (let i = 0; i < result.length; i++) {
        if (result[i] === "1") {
            allZero = false;
            break;
        }
    }

    if (allZero) {
        return "0";
    }


    return result.replace(/^0+/, ""); // 앞의 불필요한 0 제거
}

console.log(addBinary(n, m));