class Solution {
    public int solution(int num) {
        int answer = 0;
        double n = num;
        while (true) {
            if (n == 1) {
                return answer;
            }
            if (answer >= 500) {
                return -1;
            }
            if (n%2 == 0) {
                n/=2;
            }
            else {
                n*=3;
                n++;
            }
            answer++;
        }
    }
}