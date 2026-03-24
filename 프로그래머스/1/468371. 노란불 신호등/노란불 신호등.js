function solution(signals) {
    var answer = 1;
    while(true) {
        let all_yellow = true;
        for (signal of signals) {
            let [G, Y, R] = signal;
            let time_in_cycle = (answer-1) % (G + Y + R);
            if (time_in_cycle >= G && time_in_cycle < G + Y) {
            }
            else {
                all_yellow = false;
                break;
            }
        }
        if (all_yellow) {
            break;
        }
        answer++;
        if (answer > 3000000) {
            return -1;
        }
        
    } 
    return answer;
}