class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char equals = alp.charAt(0);
        for (int i = 0; i<my_string.length(); i++) {
            char temp = my_string.charAt(i);
            if (temp == equals) {
                temp -= 32;
            }
            answer += temp;
        }
        return answer;
    }
}