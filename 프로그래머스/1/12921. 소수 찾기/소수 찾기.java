class Solution {
    public int solution(int n) {
        
        int answer = 1;
        
        for (int i = 3; i <= n; i += 2) {
            boolean Prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    Prime = false;
                    break;
                }
            }
            if (Prime == true) {
                answer++;
            }
        }
        
        return answer;
    }
}
