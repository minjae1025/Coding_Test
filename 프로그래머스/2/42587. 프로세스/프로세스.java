import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        int cnt = 1;
        ArrayList<Integer> list = new ArrayList<>();
        int[] num_cnt = new int[10];
        for (int i = 0; i<priorities.length; i++) {
            num_cnt[priorities[i]]++;
        }
        
        for (int i = 9; i>=0; i--) {
            if (num_cnt[i] > 0) {
                list.add(i);
            }
        }
        
        int[] order = new int[list.size()];
        for (int i = 0; i<list.size(); i++) {
            order[i] = list.get(i);
        }
        int max = order[0];
        int idx = 1;
        int i = 0;
        
        while (true) {
            i %= priorities.length;
            if (num_cnt[max] == 0) {
                if (idx < order.length) {
                    max = order[idx++];
                }
            }
            
            if (priorities[i] == max && i == location) {
                break;
            }
            else if (priorities[i] == max) {
                cnt++;
                num_cnt[max]--;
            }
            i++;
        }
        return cnt;
    }
}