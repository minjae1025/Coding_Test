class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int[] count = new int[right-left+1];
        int idx = 0;
        for (int i = left; i<=right; i++) {
            for (int j = 1; j<=i; j++) {
                if (i%j == 0) {
                    count[idx]++;
                }
            }
            if (count[idx] % 2 == 0) {
                answer += i;
            }
            else {
                answer -= i;
            }
            idx++;
        }
        return answer;
    }
}