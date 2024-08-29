class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] turn = new int[3];
        int cnt = 0;
        int min = 1;
        
        while (true) {
            for (int i = 0; i<rank.length; i++) {
                if (rank[i] == min) {
                    if (attendance[i] == true) {
                        turn[cnt] = i;
                        cnt++;
                        min++;
                        break;
                    }
                    else {
                        min++;
                    }
                }
            }
            if (cnt == 3) {
                break;
            }
        }
        answer = turn[0]*10000 + turn[1]*100 + turn[2];
        return answer;
    }
}