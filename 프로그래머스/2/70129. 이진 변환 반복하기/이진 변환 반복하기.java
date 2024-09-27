class Solution {
    public int[] solution(String s) {
        int zero_cnt = 0;
        int cnt = 0;

        while (!s.equals("1")) {
            String temp = s.replace("0", "");
            zero_cnt += s.length() - temp.length();
            s = Integer.toBinaryString(temp.length());
            cnt++;
        }

        int[] answer = {cnt, zero_cnt};
        return answer;
    }
}
