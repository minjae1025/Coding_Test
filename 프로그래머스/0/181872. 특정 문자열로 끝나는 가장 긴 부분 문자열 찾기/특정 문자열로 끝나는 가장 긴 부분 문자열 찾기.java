class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        char alp = pat.charAt(pat.length()-1);
        int cnt = 0;
        for (int i = 0; i<myString.length(); i++) {
            char temp = myString.charAt(i);
            if (temp == alp) {
                cnt = i;
            }
        }
        for (int i = 0; i<=cnt; i++) {
            char temp = myString.charAt(i);
            answer += temp;
        }
         return answer;
    }
}