class Solution {
    public long solution(int n) {
        long[] num = new long[n + 1];
        
        num[1] = 1;
        if (n > 1) {
            num[2] = 2;
        }
        if (n > 2) {
            for (int i = 3; i <= n; i++) {
            num[i] = (num[i - 1] + num[i - 2]) % 1234567;
            }
        }
        

        return num[n];
    }
}