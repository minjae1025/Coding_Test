class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;

        if (s.charAt(0) == ')' || s.charAt(s.length()-1) == '(' || s.length()%2 == 1) {
            return false;
        }
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                cnt++;
            }
            else if (s.charAt(i) == ')' && cnt > 0) {
                cnt--;
            }
        }
        
        if (cnt > 0) {
            return false;
        }

        return answer;
    }
}