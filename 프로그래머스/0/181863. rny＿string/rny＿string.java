class Solution {
    public String solution(String rny_string) {
        String answer = "";
        for (int i = 0; i<rny_string.length(); i++) {
            char alp = rny_string.charAt(i);
            if (alp == 'm') {
                answer += "rn";
            }
            else {
                answer += alp;
            }
        }
            
        return answer;
    }
}