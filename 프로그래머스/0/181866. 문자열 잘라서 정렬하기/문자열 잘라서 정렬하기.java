import java.util.*;

class Solution {
    public String[] solution(String myString) {
        List<String> list = new ArrayList<>();
        
        String[] str = myString.split("x");
        for (int i = 0; i<str.length; i++) {
            if (!str[i].isEmpty()) {
                list.add(str[i]);
            }
        }
        String[] answer = new String[list.size()];
        for (int i = 0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}