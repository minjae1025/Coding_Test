import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = l; i<=r; i++) {
            String temp = Integer.toString(i);
            if (temp.contains("1") || temp.contains("2") || temp.contains("3") || temp.contains("4") || temp.contains("6") || temp.contains("7") || temp.contains("8") || temp.contains("9")) {
                continue;
            }
            else {
                list.add(i);
            }
        }
        if (list.size() == 0) {
            int[] tmp = {-1};
            return tmp;
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}