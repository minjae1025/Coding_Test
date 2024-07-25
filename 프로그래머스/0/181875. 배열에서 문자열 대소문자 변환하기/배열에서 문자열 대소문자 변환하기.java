class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for (int i = 0; i<strArr.length; i++) {
            answer[i] = "";
            for (int j = 0; j<strArr[i].length(); j++) {
                char alp = strArr[i].charAt(j);
                if (i%2 == 0) {
                    if (alp >= 65 && alp <= 90) {
                        alp += 32;
                    }
                }
                else {
                    if (alp >= 97 && alp<= 122) {
                        alp -= 32;
                    }
                }
                answer[i] += alp;
            }
        }
        return answer;
    }
}