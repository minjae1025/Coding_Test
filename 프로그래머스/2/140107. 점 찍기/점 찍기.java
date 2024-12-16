class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        int x = 0;
        double d_pow = Math.pow(d, 2);
        while (x <= d) {
            int dot = (int)Math.sqrt(d_pow-Math.pow(x, 2));
            answer += 1 + dot/k;
            x+=k;
        }
        return answer;
    }
}