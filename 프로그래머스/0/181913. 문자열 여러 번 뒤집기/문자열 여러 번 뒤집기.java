import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        for (int i = 0; i<queries.length; i++) {
            Stack<String> list = new Stack<>();
            String start = my_string.substring(0, queries[i][0]);
            String end = my_string.substring(queries[i][1]+1, my_string.length());
            String mid = my_string.substring(queries[i][0], queries[i][1]+1);
            String[] temp = mid.split("");
            for (int j = 0; j<temp.length; j++) {
                list.push(temp[j]);
            }
            mid = "";
            for (int j = 0; j<temp.length; j++) {
                mid += list.pop();
            }
            my_string = start+mid+end;
        }
        String answer = my_string;
        return answer;
    }
}