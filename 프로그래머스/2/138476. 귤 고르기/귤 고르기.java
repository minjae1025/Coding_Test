import java.util.Arrays;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        int size = tangerine.length;
        int[] c_num = new int[tangerine[size-1]];
        
        for (int i = 0; i<size; i++) {
            c_num[tangerine[i]-1]++;
        }
        
        Arrays.sort(c_num);
        int cnt = 0;
        
        for (int i = c_num.length-1; i>=0; i--) {
            if (cnt >= k) {
                break;
            }
            else {
                cnt += c_num[i];
                answer++;
            }
        }
        
        return answer;
    }
}