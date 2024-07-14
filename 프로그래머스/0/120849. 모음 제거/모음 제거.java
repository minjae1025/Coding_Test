class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i<my_string.length(); i++) {
            char temp = my_string.charAt(i);
            switch (temp) {
                case 'a': case 'e': case 'i': case 'o': case 'u': continue;
                default: answer += temp;
            }
        }
        return answer;
    }
}