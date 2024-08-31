import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] temp = myStr.split("a|b|c");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i<temp.length; i++) {
            if (temp[i].equals("")) {
                continue;
            }
            else {
                list.add(temp[i]);
            }
        }
        if (list.size() == 0) {
            String[] re = {"EMPTY"};
            return re;
        }
        String[] answer = new String[list.size()];
        for (int i = 0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}