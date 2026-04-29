function solution(n) {
    let number = new Array(n + 1).fill(0);
    number[0] = 1;
    number[1] = 1;

    for (let i = 2; i <= n; i++) {
        number[i] = (number[i - 2] + number[i - 1]) % 1000000007;
    }

    return number[n];
}