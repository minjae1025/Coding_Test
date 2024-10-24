import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> list = new HashMap<String, Integer>();
        Set<String> keys = new HashSet<String>();
        for (int i = 0; i<clothes.length; i++) {
            String key = clothes[i][1];
            if (!list.containsKey(clothes[i][1])) {
                list.put(key, 1);
            }
            else {
                list.put(key, list.get(key) + 1);
            }
        }
        Collection<Integer> values = list.values();
        List<Integer> cloth_cnt = new ArrayList<>(values);
        int answer;
        if (list.size() == 1) {
            answer = cloth_cnt.get(0);
        }
        else {
            int temp = 1;
            for (int i = 0; i<cloth_cnt.size(); i++) {
                temp *= cloth_cnt.get(i)+1;
            }
            answer = temp-1;
        }
        return answer;
    }
}