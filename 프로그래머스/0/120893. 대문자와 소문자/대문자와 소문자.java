class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i<my_string.length(); i++) {
            char alp = my_string.charAt(i);
            if (alp >= 65 && alp <= 90) {
                alp += 32;
            }
            else {
                alp -= 32;
            }
            answer += alp;
        }
        return answer;
    }
}