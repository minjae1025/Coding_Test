class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String temp = "";
        for (int i = 0; i<letter.length(); i++) {
            if (letter.charAt(i)==' ') {
                for (int j = 0; j<morse.length; j++) {
                    if (temp.equals(morse[j])) {
                        answer += (char)(j+97);
                    }
                }
                temp = "";
            }
            else {
                temp += letter.charAt(i);
            }
        }
        return answer;
    }
}