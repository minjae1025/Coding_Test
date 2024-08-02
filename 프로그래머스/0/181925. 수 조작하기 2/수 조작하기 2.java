class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for (int i = 1; i<numLog.length; i++) {
            int temp = numLog[i] - numLog[i - 1];
            if (temp == 1) {
                answer += "w";
            }
            else if (temp == -1) {
                answer += "s";
            }
            else if (temp == 10) {
                answer += "d";
            }
            else {
                answer += "a";
            }
        }
        return answer;
    }
}