class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            // 콜라를 받을 수 있는 횟수 계산
            int newCoke = (n / a) * b;
            // 남은 빈 병 개수 계산 (교환 후 남은 병 + 새로 받은 병)
            n = (n % a) + newCoke;
            answer += newCoke;
        }

        return answer;
    }
}
