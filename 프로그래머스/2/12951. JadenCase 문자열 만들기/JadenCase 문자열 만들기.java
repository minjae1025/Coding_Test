import java.lang.String;

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        String answer = "";
        
        if (s.length() == 1) {
            s = s.toUpperCase();
            return s;
        }
        char[] Lower = s.toCharArray();
        for (int i = 0; i<Lower.length-1; i++) {
            if ((i == 0 && Lower[i] >= 'a') || i == Lower.length-1 && Lower[i] >= 'a') {
                Lower[i] -= 32;
            }
            if (Lower[i] == ' ' && Lower[i+1] >= 'a') {
                Lower[i+1] -= 32;
            }
        }
        answer = String.valueOf(Lower);
        return answer;
    }
}