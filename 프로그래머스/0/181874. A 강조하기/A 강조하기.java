class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = 0; i<myString.length(); i++) {
            char alp = myString.charAt(i);
            if (alp == 'a') {
                alp = 'A';
            }
            if (alp > 65 && alp <= 90) {
                alp += 32;
            }
            answer += alp;
        }
        return answer;
    }
}