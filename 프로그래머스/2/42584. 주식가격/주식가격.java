class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int length = prices.length;
        for (int i = 0; i<length; i++) {
            int now_m = prices[i];
            for (int j = i+1; j<length; j++) {
                answer[i]++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
        }
        return answer;
    }
}