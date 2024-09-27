class Solution {
    public int solution(int n) {
        int answer = 0;
        String n_bin = Integer.toBinaryString(n);
        int one_cnt = 0;
        for (int i = 0; i<n_bin.length(); i++) {
            if (n_bin.charAt(i) == '1') {
                one_cnt++;
            }
        }
        while (true) {
            String temp = Integer.toBinaryString(++n);
            int one_temp = 0;
            for (int i = 0; i<temp.length(); i++) {
                if (temp.charAt(i) == '1') {
                    one_temp++;
                }
            }
            if (one_temp == one_cnt) {
                answer = n;
                break;
            }
        }
        return answer;
    }
}