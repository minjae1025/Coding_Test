class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        int i;
        for (i = 0; i<length; i++) {
            if (i>=length-4) {
                answer += phone_number.charAt(i);
            }
            else {
                answer += "*";
            }
        }
        return answer;
    }
}