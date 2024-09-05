import java.math.*;

class Solution {
    public int solution(int[][] dots) {
        int heigth_max = -256;
        int heigth_min = 256;
        int width_max = -256;
        int width_min = 256;
        for (int i = 0; i<dots.length; i++) {
            heigth_min = Math.min(heigth_min, dots[i][0]);
            heigth_max = Math.max(heigth_max, dots[i][0]);
            width_min = Math.min(width_min, dots[i][1]);
            width_max = Math.max(width_max, dots[i][1]);
        }
        int answer = (heigth_max - heigth_min) * (width_max - width_min);
        
        return answer;
    }
}