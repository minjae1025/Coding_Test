import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int cnt = 0;
        while (cnt <= discount.length - 10) {
            Map<String, Integer> list = new HashMap<>();

            for (int i = 0; i < want.length; i++) {
                list.put(want[i], 0);
            }

            for (int i = cnt; i < cnt + 10; i++) {
                String item = discount[i];
                if (list.containsKey(item)) {
                    list.put(item, list.get(item) + 1);
                }
            }

            boolean flag = true;
            for (int i = 0; i < want.length; i++) {
                if (list.get(want[i]) < number[i]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                answer++;
            }

            cnt++;
        }
        return answer;
    }
}
