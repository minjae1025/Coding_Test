import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> list = new Stack<>();
        int cnt = 0;
        for (int i = 0; i<arr.length; i++) {
            if (list.isEmpty()) {
                list.push(arr[i]);
            }
            else if (list.peek() == arr[i]) {
                list.pop();
            }
            else if (list.peek() != arr[i]){
                list.push(arr[i]);
            }
        }
        if (list.isEmpty()) {
          return new int[] {-1};  
        }
        int[] answer = new int[list.size()];
        for (int i = answer.length-1; i >= 0; i--) {
            answer[i] = list.pop();
        }
        return answer;
    }
}