import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> list = new Stack<>();
        int i = 0;
        while (i<arr.length) {
            if (list.isEmpty()) {
                list.push(arr[i]);
                i++;
            }
            else if (list.peek() >= arr[i]) {
                list.pop();
            }
            else if (list.peek() < arr[i]){
                list.push(arr[i]);
                i++;
            }
        }
        if (list.isEmpty()) {
          return new int[] {-1};  
        }
        int[] answer = new int[list.size()];
        for (int j = answer.length-1; j >= 0; j--) {
            answer[j] = list.pop();
        }
        return answer;
    }
}