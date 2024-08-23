class Solution {
    public String solution(String code) {
        String answer = "";
        boolean flag = false;
        for (int i = 0; i<code.length(); i++) {
            char temp = code.charAt(i);
            if (temp == '1') {
                flag = !flag;
                continue;
            }
            if (flag == true && i%2==1) {
                answer += temp;
            }
            else if (flag == false && i%2==0) {
                answer += temp;
            }
        }
        if (answer.length() == 0) {
            return "EMPTY";
        }
        return answer;
    }
}