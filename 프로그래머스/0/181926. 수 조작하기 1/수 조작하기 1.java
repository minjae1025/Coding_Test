class Solution {
    public int solution(int n, String control) {
        int answer = n;
        for (int i = 0; i<control.length(); i++) {
            char temp = control.charAt(i);
            if (temp == 'w') {
                answer += 1;
            }
            else if (temp == 's') {
                answer -= 1;
            }
            else if (temp == 'd') {
                answer += 10;
            }
            else {
                answer -= 10;
            }
        }
        return answer;
    }
}