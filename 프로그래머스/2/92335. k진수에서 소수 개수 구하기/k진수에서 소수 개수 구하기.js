function solution(n, k) {
    var answer = 0;

    let remains = [];
    let num = n;
    while (num > 0) {
        remains.push(num % k);
        num = Math.floor(num / k);
    }

    const k_num = remains.reverse().join("");

    const k_num_list = k_num.split("0").filter(x => x !== "");

    for (let i = 0; i < k_num_list.length; i++) {
        const num = parseInt(k_num_list[i]);
        if (num < 2) continue;
        let is_prime = true;
        for (let j = 2; j <= Math.sqrt(num); j++) {
            if (num % j === 0) {
                is_prime = false;
                break;
            }        
        }
        if (is_prime) answer++;
    }

    return answer;
}