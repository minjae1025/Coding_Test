class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int t = i; t<=j; t++) {
            String temp = Integer.toString(t);
            for (int n = 0; n<temp.length(); n++) {
                if (temp.charAt(n)==k+48) {
                    answer++;
                }
            }
        }
        return answer;
    }
}