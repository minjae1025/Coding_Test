import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        int[] answer = {7,7};
        for (int i = 0; i<lottos.length; i++) {
            if (lottos[i] == 0) {
                    answer[0]--;
                    continue;
            }
            for (int j = 0; j<win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    answer[1]--;
                    answer[0]--;
                }
            }
            
        }
        
        for (int i = 0; i<answer.length; i++) {
            if (answer[i]==7){
                answer[i]=6;
            }
        }
        return answer;
    }
}