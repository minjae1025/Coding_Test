import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        
        ArrayList<String> filterArr = new ArrayList<>();
        
        int cnt = 0;
        int flag = 1;
        for (int i = 0; i<strArr.length; i++) {
            for (int j = 0; j<strArr[i].length()-1; j++) {
                char temp1 = strArr[i].charAt(j);
                char temp2 = strArr[i].charAt(j+1);
                String temp = Character.toString(temp1) + Character.toString(temp2);
                if (temp.equals("ad")) {
                    flag = 0;
                }
            }
            if (flag == 1) {
                filterArr.add(strArr[i]);
            }
            flag = 1;
        }
        String[] answer = new String[filterArr.size()];
        for (int i = 0; i<answer.length; i++) {
            answer[i] = filterArr.get(i);
        }
        return answer;
    }
}