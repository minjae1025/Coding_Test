class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 1;
        while (cnt <= n) {
            int temp = 0;
            int i = cnt;
            while (temp <= n) {
                temp += i;
                i++;
                if (temp == n) {
                    answer++;
                }
            }
            cnt++;
        }
        return answer;
    }
}