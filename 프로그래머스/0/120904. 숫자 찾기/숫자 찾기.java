class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str_num = Integer.toString(num);
        for (int i = 0; i<str_num.length(); i++) {
            char temp = str_num.charAt(i);
            if (temp-48 == k) {
                answer = i+1;
                break;
            }
            else {
                answer = -1;
            }
        }
        return answer;
    }
}