import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for (int i = 0; i<targets.length; i++) {
            for (int j = 0; j<targets[i].length(); j++) {
                char temp = targets[i].charAt(j);
                int cnt = Integer.MAX_VALUE;
                for (int k = 0; k<keymap.length; k++) {
                    if (keymap[k].contains(String.valueOf(temp))) {
                        for (int m = 0; m<keymap[k].length(); m++) {
                            if (keymap[k].charAt(m) == temp && m < cnt) {
                                cnt = m+1;
                            }
                        }
                    }
                }
                if (cnt == Integer.MAX_VALUE) {
                    answer[i] = -1;
                    break;
                }
                else {
                    answer[i] += cnt; 
                }
            }
        }
        return answer;
    }
}