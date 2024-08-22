import java.util.*;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        String answer = "";
        char[] temp = my_string.toCharArray();
        Arrays.sort(temp);
        for (int i = 0; i<temp.length; i++) {
            answer += temp[i];
        }
        return answer;
    }
}