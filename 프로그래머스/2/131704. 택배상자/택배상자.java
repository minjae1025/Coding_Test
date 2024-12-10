import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> belt = new Stack<>();
        // int[] main_belt = new int[order.length];
        // for (int i = 0; i<order.length; i++) {
        //     main_belt[i] = i+1;
        // }
        
        int j = 0;
        for (int i = 0; i<order.length; i++) {
            if (i+1 == order[j]) {
                answer++;
                j++;
            }
            else {
                belt.push(i+1);
            }
            while (!belt.empty() && belt.peek() == order[j]) {
                belt.pop();
                answer++;
                j++;
            }
        }
        return answer;
    }
}