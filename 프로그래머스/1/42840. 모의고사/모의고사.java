import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] not_math = {0, 0, 0};
        
        int math1_cnt = 1;
        int math2_cnt = 1;
        int[] math3_answer = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int math3_cnt = 0;
        
        for (int i = 0; i<answers.length; i++) {
            if (math1_cnt > 5) {
                math1_cnt = 1;
            }
            if (math2_cnt > 5) {
                math2_cnt = 1;
            }
            if (math3_cnt >= math3_answer.length) {
                math3_cnt = 0;
            }
            
            if (math1_cnt == answers[i]) {
                not_math[0]++;
            }
            if (i % 2 == 0) {
                if (answers[i] == 2) {
                    not_math[1]++;
                }
            }
            else {
                if (math2_cnt == answers[i]) {
                    not_math[1]++;
                }  
                math2_cnt++;
                if (math2_cnt == 2) {
                    math2_cnt++;
                }
            }
            if (math3_answer[math3_cnt] == answers[i]) {
                not_math[2]++;
            }
            
            math1_cnt++;
            math3_cnt++;
            
        }
        int max = -1;
        for (int i = 0; i<not_math.length; i++) {
            if (not_math[i] > max) {
                max = not_math[i];
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i<not_math.length; i++) {
            if (not_math[i] == max) {
                list.add(i+1);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}