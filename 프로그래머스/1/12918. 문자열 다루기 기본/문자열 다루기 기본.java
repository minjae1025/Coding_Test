class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() != 6 && s.length() != 4) {
            return false;
        }
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) < 58 && s.charAt(i) > 47) {
                answer = true;
            }
            else {
                return false;
            }
        }
        return answer;
    }
}