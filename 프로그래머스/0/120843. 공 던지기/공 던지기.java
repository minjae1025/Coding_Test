class Solution {
    public int solution(int[] numbers, int k) {
        int n = numbers.length;
        int cnt = 0;
        
        for (int i = 1; i < k; i++) {
            cnt = (cnt + 2) % n; 
        }
        
        return numbers[cnt];
    }
}
