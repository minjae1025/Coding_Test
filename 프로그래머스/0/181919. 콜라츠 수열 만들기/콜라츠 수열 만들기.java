class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        int temp = n;
        while (temp > 1) {
            if (temp % 2 == 0) {
                temp /= 2;
            }
            else {
                temp *= 3;
                temp++;
            }
            cnt++;
        }
        int[] answer = new int[cnt+1];
        for (int i = 0; i<cnt; i++) {
            if (n % 2 == 0) {
                answer[i] = n;
                n /= 2;
            }
            else {
                answer[i] = n;
                n *= 3;
                n++;
            }
        }
        answer[cnt] = 1;
        return answer;
    }
}