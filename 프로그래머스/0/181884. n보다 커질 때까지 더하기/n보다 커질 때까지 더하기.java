class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int i = 0; i<numbers.length; i++) {
            if (answer<n+1)
                answer+=numbers[i];
            else 
                answer+=0;
            }
        return answer;
    }
}