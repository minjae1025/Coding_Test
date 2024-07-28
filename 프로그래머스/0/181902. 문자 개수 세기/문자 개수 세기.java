class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i = 0; i<my_string.length(); i++) {
            char temp = my_string.charAt(i);
            if (temp <= 'Z') {
                temp -= 'A';
            }
            else {
                temp -= 'a';
                temp += 26;
            }
            answer[temp]++;
        }
        return answer;
    }
}