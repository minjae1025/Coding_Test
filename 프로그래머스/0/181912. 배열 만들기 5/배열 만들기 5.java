import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i<intStrs.length; i++) {
            String temp = intStrs[i].substring(s, s+l);
            int num_tmp = Integer.parseInt(temp);
            if (num_tmp > k) {
                list.add(num_tmp);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}