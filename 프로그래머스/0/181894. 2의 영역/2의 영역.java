import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -1;

        // 배열에서 첫 번째와 마지막 2의 인덱스를 찾습니다.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == -1) {
                    start = i; 
                }
                end = i;  
            }
        }
        if (start == -1) {
            return new int[]{-1};
        }

        int[] answer = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            answer[i - start] = arr[i];
        }
        return answer;
    }
}
