class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] clothes = new int[n];
        for (int i = 0; i<n; i++) {
            clothes[i] = 1;
        }
        for (int i = 0; i<lost.length; i++) {
            clothes[lost[i]-1]--;
        }
        for (int i = 0; i<reserve.length; i++) {
            clothes[reserve[i]-1]++;
        }
        
        for (int i = 0; i<n; i++) {
            if (clothes[i] == 0) {
                if (i > 0 && clothes[i-1] == 2) {
                    clothes[i]++;
                    clothes[i-1]--;
                }
                else if (i < n-1 && clothes[i+1] == 2) {
                    clothes[i]++;
                    clothes[i+1]--;
                }
            }
        }
        
        for (int i = 0; i<n; i++) {
            if (clothes[i] >= 1) {
                answer++;
            }
        }
        return answer;
    }
}