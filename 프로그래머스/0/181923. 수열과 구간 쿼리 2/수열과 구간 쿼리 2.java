import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int minVal = 1000000;
            
            for (int j = s; j <= e; j++) {
                if (arr[j] > k && arr[j] < minVal) {
                    minVal = arr[j];
                }
            }
            if (minVal == 1000000) {
                answer[i] = -1;
            } else {
                answer[i] = minVal;
            }
        }
        
        return answer;
    }
}
