function solution(n, computers) {
    let answer = 0;
    
    let connect_list = new Array(n).fill(false)
    
    function bfs(idx) {
        connect_list[idx] = true;
        for(let j = 0; j<n; j++) {
            if (computers[idx][j] == 1 && !connect_list[j]) {
                bfs(j)
            }
        }
    }
    
    connect_list.forEach((item, idx) => {
        if(!connect_list[idx]) {
            bfs(idx);
            answer++;
        }
    });
    
    
    return answer;
}