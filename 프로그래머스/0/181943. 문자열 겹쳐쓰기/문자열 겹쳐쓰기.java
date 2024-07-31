class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int cnt = 0;
        for (int i = 0; i<my_string.length(); i++) {
            char temp = my_string.charAt(i);
            if (i>=s && cnt<overwrite_string.length()) {
                answer += overwrite_string.charAt(cnt++);
            }
            else {
                answer += temp;
            }
        }
        return answer;
    }
}