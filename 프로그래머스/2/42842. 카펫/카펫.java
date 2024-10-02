import java.lang.Math;

class Solution {
    public int[] solution(int brown, int yellow) {
        
        int total = brown + yellow;
        int heigth = 0;
        int width = 0;
        for (int i = 3; i<total/2; i++) {
            if (total % i == 0) {
                heigth = i;
                width = total / i;
                if ((width - 2) * (heigth - 2) == yellow) {
                    break;
                }
            }
        }
        
        int[] answer = {width, heigth};
        return answer;
    }
}