import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 0;
        int total_cnt = 0;
        int day = 1;
        while (total_cnt < progresses.length) {
            for (int i = total_cnt; i<progresses.length; i++) {
                progresses[i] += speeds[i];
            }
            for (int i = total_cnt; i<progresses.length; i++) {
                if (progresses[i] >= 100) {
                    cnt++;
                    total_cnt++;
                }
                else {
                    break;
                }
            }
            
            if (cnt > 0) {
                list.add(cnt);
                cnt = 0;
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}