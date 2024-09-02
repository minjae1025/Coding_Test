class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] ctrl = s.split(" ");
        for (int i = 0; i<ctrl.length; i++) {
            if (ctrl[i].charAt(0) <= '9') {
                answer += Integer.parseInt(ctrl[i]);
            }
            else {
                answer -= Integer.parseInt(ctrl[i-1]);
            }
        }
        return answer;
    }
}