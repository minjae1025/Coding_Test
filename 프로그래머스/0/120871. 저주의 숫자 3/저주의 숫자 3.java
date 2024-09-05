class Solution {
    public int solution(int n) {
        int answer = 1;
        for (int i = 1; i<=n; i++) {
            String temp = Integer.toString(answer);
            while (answer%3==0 || answer%10==3 || answer/10==3 || answer/10==13) {
                answer++;
            }
            answer++;
        }
        return answer-1;
    }
}