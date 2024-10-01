class Solution {
    public int solution(int n) {
        if (n <= 1) {
            return n;
        }
        int num1 = 0, num2 = 1;
        for (int i = 2; i <= n; i++) {
            int next = num1 + num2;
            num1 = num2;
            num2 = next % 1234567;
        }
        int answer = num2;
        return answer;
        
    }
}