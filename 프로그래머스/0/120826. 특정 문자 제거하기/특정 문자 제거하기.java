class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char del = letter.charAt(0);
        for (int i = 0; i<my_string.length(); i++) {
            char temp = my_string.charAt(i);
            if (temp!=del) {
                answer += temp;
            }
        }
        return answer;
    }
}