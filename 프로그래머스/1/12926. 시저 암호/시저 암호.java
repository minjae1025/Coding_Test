class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i<s.length(); i++) {
            char temp = s.charAt(i);
            if (temp != 32) {
                for (int j = 0; j<n; j++) {
                    temp++;
                    if (temp > 122) {
                        temp = 97;
                    }
                    else if (temp == 91) {
                        temp = 65;
                    }
                }
            }
            answer += (char)temp;
        }
        return answer;
    }
}