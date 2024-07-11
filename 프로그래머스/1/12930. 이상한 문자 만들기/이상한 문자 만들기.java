class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        for (int i = 0; i<s.length(); i++) {
            char temp = s.charAt(i);
            if (temp != 32) {
                if (idx%2 == 0) {
                    if (temp > 96)
                        temp -= 32;
                }
                else {
                    if (temp < 91)
                        temp += 32;
                }
                answer += (char)temp;
                idx++;
            }
            else if (temp == 32) {
                idx = 0;
                answer += " ";
            }
        }
        return answer;
    }
}