import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] oyo = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            String temp = babbling[i];
            for (int j = 0; j < oyo.length; j++) {
                temp = temp.replaceAll(oyo[j], " ");
            }
            if (temp.trim().isEmpty()) { // 공백이 모두 제거된 경우 발음 가능
                answer++;
            }
        }
        return answer;
    }
}
