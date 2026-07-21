function solution(m, n, puddles) {
    var answer = 0;
    
    let map = Array(n).fill(0).map(row => Array(m).fill(0));
    
    puddles.forEach((item, idx) => {
        map[item[1]-1][item[0]-1] = -1
    })
    
    map[0][0] = 1;
    
    for (let i = 0; i<n; i++) {
        for (let j = 0; j<m; j++) {
            if (i === 0 && j === 0) continue;
            if (map[i][j] === -1) continue;
            let count = 0;
            if (j > 0 && map[i][j-1] !== -1) count += map[i][j-1];
            if (i > 0 && map[i-1][j] !== -1) count += map[i-1][j];
            
            map[i][j] += count % 1000000007;
        }
    }
    return map[n-1][m-1] % 1000000007;
}