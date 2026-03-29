const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split(" ");
const start = Number(input[0]);
const end = Number(input[1]);

// 1번째부터 k번째 칸까지의 누적 합을 구하는 함수
function getSumUpTo(k) {
    if (k === 0) return 0;
    
    // 1. k번째 칸이 속한 숫자(그룹) n을 찾습니다.
    // n(n+1)/2 <= k 를 만족하는 최대 정수 n (근의 공식 활용)
    let n = Math.floor((-1 + Math.sqrt(1 + 8 * k)) / 2);
    
    // 2. n까지 온전히 꽉 채워진 그룹들의 총합 (제곱의 합 공식)
    // 예: n이 3이면 1^2 + 2^2 + 3^2 = 14
    let sumOfFullGroups = (n * (n + 1) * (2 * n + 1)) / 6;
    
    // 3. n그룹까지 채우고 사용된 총 칸 수
    let countUpToN = (n * (n + 1)) / 2;
    
    // 4. k번째 칸까지 가기 위해 추가로 남은 칸 수
    let remainder = k - countUpToN;
    
    // 5. 꽉 채워진 합 + (남은 칸 수 * 다음 들어갈 숫자)
    return sumOfFullGroups + remainder * (n + 1);
}

// 최종 계산: (end까지의 전체 합) - (start 바로 앞까지의 합)
console.log(getSumUpTo(end) - getSumUpTo(start - 1));