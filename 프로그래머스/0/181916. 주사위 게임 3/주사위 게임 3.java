class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] num_cnt = new int[6];
        num_cnt[a-1]++;
        num_cnt[b-1]++;
        num_cnt[c-1]++;
        num_cnt[d-1]++;
        
        boolean duplication = false;
        int dup_num = 0;
        int max = 0;
        int max_idx = 0;
        int num = 0;
        for (int i = 0; i<num_cnt.length; i++) {
            if (num_cnt[i] > max) {
                max = num_cnt[i];
                max_idx = i;
                num = i+1;
            }
        }
        
        for (int i = 0; i<num_cnt.length; i++) {
            if (num_cnt[i] == 2 && i != max_idx) {
                dup_num = i+1;
                duplication = true;
            }
        }
        
        if (max == 4) {
            String temp = Integer.toString(num);
            String num_temp = temp+temp+temp+temp;
            return Integer.parseInt(num_temp);
        }
        
        else if (max == 3) {
            int one = 0;
            for (int i = 0; i<num_cnt.length; i++) {
                if (num_cnt[i] == 1) {
                    one = i+1;
                }
            }
            int temp = 10*num+one;
            return temp*temp;
        }
        
        else if (duplication) {
            int one = dup_num + num;
            int two = dup_num - num;
            if (two == 0) {
                two++;
            }
            if (two < 0) {
                two *= -1;
            }
            return one * two;
        }
        else if (max == 2) {
            int one = 0;
            int two = 0;
            boolean flag = true;
            for (int i = 0; i<num_cnt.length; i++) {
                if (num_cnt[i] == 1) {
                    if (flag) {
                        one = i + 1;
                        flag = false;
                    }
                    else {
                        two = i + 1;
                    }
                }
            }
            return one * two;
        }
        else {
            int min = 6;
            for (int i = 0; i<num_cnt.length; i++) {
                if (num_cnt[i] == 1 && i < min) {
                    min = i;
                }
            }
            return min+1;
        }
    }
}