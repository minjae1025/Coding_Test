class Solution {
    public long solution(long n) {
        long answer = 0;
        for (long i = 0; i<=n/2+1; i++) {
            if (i*i == n)
                return (i+1) * (i+1);
            else 
                answer = -1;
        }
        return answer;
    }
}