class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for (int i = 0; i<s.length(); i++) {
            char alp = s.charAt(i);
            for (int j = 0; j<index; j++) {
                alp++;
                if (skip.contains(alp+"")) j--;
                if (alp > 'z') {
                    alp = 'a';
                    if(skip.contains(alp+"")) j--;
                }
            }
            answer += alp;
        }
        return answer;
    }
}