class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int max_b = Math.max(bill[0], bill[1]);
        int min_b = Math.min(bill[0], bill[1]);
        int max_w = Math.max(wallet[0], wallet[1]);
        int min_w = Math.min(wallet[0], wallet[1]);
            
        
        while (true) {
            max_b = Math.max(bill[0], bill[1]);
            min_b = Math.min(bill[0], bill[1]);
            max_w = Math.max(wallet[0], wallet[1]);
            min_w = Math.min(wallet[0], wallet[1]);
            if (max_b <= max_w && min_b <= min_w) {
                break;
            }
            if (max_b > max_w && max_b > min_b) {
                max_b /= 2;
            }
            else if (min_b > min_w) {
                min_b /= 2;
            }
            if (bill[0] > bill[1]) {
                bill[0]/=2;
            }
            else {
                bill[1]/=2;
            }
            answer++;
        }
        
        return answer;
    }
}
