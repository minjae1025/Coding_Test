class Solution {
    public String solution(int age) {
        String answer = "";
        while (true) {
            int alp = age%10;
            String temp = answer;
            answer = ""+(char)(alp+97);
            answer += temp;
            age /= 10;
            if (age<1) {
                break;
            }
        }
        return answer;
    }
}