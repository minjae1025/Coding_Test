class Solution {
    public int solution(String s) {
        int answer = 0;
        // int x_cnt = 0;
        // int n_cnt = 0;
        boolean end = false;
        
        for (int i = 0; i<s.length(); i++) {
            if (!end) {
                char x = s.charAt(i);
                int x_cnt = 1;
                int n_cnt = 0;
                while (true) {
                    i++;
                    if (i >= s.length()) {
                        answer++;
                        break;
                    }
                    if (s.charAt(i) == x) {
                        x_cnt++;
                    }
                    else if (s.charAt(i) != x) {
                        n_cnt++;
                    }
                    if(n_cnt == x_cnt) {
                        answer++;
                        break;
                    }
                    
                }
            }
        }
        return answer;
    }
}