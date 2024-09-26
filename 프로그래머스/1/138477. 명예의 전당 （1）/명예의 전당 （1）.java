import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] k_s = new int[k];
        
        for (int i = 0; i<score.length; i++) {
            if (i<k) {
                k_s[i] = score[i];
            }
            else {
                if (score[i] > k_s[0]) {
                    k_s[0] = score[i];
                }   
            }
            
            if (i < k-1) {
                Arrays.sort(k_s, 0, i+1);
                answer[i] = k_s[0];
            }
            else {
                Arrays.sort(k_s);
                answer[i] = k_s[0];
            }
            
        }
        return answer;
    }
}