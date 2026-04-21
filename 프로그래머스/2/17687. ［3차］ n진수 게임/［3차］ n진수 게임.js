function solution(n, t, m, p = 0) {
    var answer = "";

    let n_num = "";
    let num = 0;
    let turn = 0;
    let count = 0;
    while (answer.length < t) {
        let num = count;
        if (num === 0) n_num = "0";
        while (num > 0) {
            if (n >= 10) {
                if (num % n >= 10) {
                    n_num = String.fromCharCode((num % n) - 10 + "A".charCodeAt(0)) + n_num;
                }
                else {                    
                    n_num = (num % n) + n_num;
                }
            }
            else {
                n_num = (num % n) + n_num;
            }
            num = Math.floor(num / n);
        }
        for (let digit of n_num.split("")) {
            if (turn % m === p-1) {
                answer += digit;
            }
            if (answer.length === t) break;
            turn++;
        }
        count++;
        n_num = "";
    }

    return answer;
}