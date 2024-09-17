class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] divisor = new int[number];

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    divisor[i - 1]++; // j는 약수
                    if (j != i / j) { // j와 i / j가 다르면 추가
                        divisor[i - 1]++;
                    }
                }
            }
        }

        for (int i = 0; i < divisor.length; i++) {
            if (divisor[i] > limit) {
                answer += power;
            } else {
                answer += divisor[i];
            }
        }

        return answer;
    }
}
