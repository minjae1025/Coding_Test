class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i<my_string.length(); i++) {
            char temp = my_string.charAt(i);
            boolean flag = false;
            for (int j = 0; j<answer.length(); j++) {
                char duplication = answer.charAt(j);
                if (temp == duplication) {
                    flag = true;
                }
            }
            if (flag == false) {
                answer += temp;
            }
        }
        return answer;
    }
}