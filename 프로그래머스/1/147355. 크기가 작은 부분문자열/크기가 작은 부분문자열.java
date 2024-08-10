class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i<=t.length()-p.length(); i++) {
            String temp = t.substring(i, i+p.length());
            long num = Long.parseLong(temp);
            if (Long.parseLong(p) >= num) {
             answer++;
            }
        }
        return answer;
    }
}