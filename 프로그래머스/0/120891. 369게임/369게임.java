class Solution {
    public int solution(int order) {
        int answer = 0;
        String num = Integer.toString(order);
        for (int i = 0; i<num.length(); i++) {
            char temp = num.charAt(i);
            if (temp == '3' || temp == '6' || temp == '9') {
                answer++;
            }
        }
        return answer;
    }
}