class Solution {
    public long solution(long price, int money, int count) {
        long play_price = 2;
        long first = price;
        for (int i = 1; i<count; i++) {
            price += first * play_price;
            play_price++;
        }
        long answer = price - money;
        
        if (answer <= 0) {
            return 0;
        }

        return answer;
    }
}