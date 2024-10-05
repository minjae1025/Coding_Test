import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] fail = new double[N];
        int user = stages.length;
        
        for (int i=0; i<N; i++) {
            int f_cnt = 0;
            for (int j = 0; j<stages.length; j++) {
                if (stages[j] == i+1) {
                    f_cnt++;
                }
            }
            if (user > 0) {
                fail[i] = (double)f_cnt/user;
            } else {
                fail[i] = 0;
            }
            user -= f_cnt;
            answer[i] = i+1;
        }
        
        Integer[] stageOrder = new Integer[N];
        for (int i = 0; i < N; i++) {
            stageOrder[i] = answer[i];
        }
        
        Arrays.sort(stageOrder, Comparator.comparing((Integer a) -> fail[a - 1]).reversed().thenComparing(a -> a));

        for (int i = 0; i < N; i++) {
            answer[i] = stageOrder[i];
        }

        return answer;
    }
}
