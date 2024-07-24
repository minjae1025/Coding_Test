class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = 0; i<myString.length(); i++) {
            char alp = myString.charAt(i);
            if (alp >= 97 && alp <= 122) {
                alp -= 32;
            }
            answer += alp;
        }
        return answer;
    }
}