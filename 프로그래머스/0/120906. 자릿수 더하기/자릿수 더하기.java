class Solution {
    public int solution(int n) {
        int answer = 0;
        String temp = Integer.toString(n);
        for (int i = 0; i<temp.length(); i++) {
            char num = temp.charAt(i);
            answer += num-48;
        }
        return answer;
    }
}