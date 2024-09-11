import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 0;
        list.add(arr[0]);
        for (int i = 1; i<arr.length; i++) {
            if (list.get(cnt) != arr[i]) {
                list.add(arr[i]);
                cnt++;
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}