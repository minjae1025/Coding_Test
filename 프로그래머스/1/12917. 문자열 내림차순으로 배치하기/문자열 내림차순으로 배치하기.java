import java.util.*;

class Solution {
    public String solution(String s) {
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        Stack<Character> list = new Stack<>();
        for (int i = 0; i<temp.length; i++) {
            list.push(temp[i]);
        }
        String answer = "";
    
        for (int i = 0; i<temp.length; i++) {
            answer += list.pop();
        }
        return answer;
    }
}