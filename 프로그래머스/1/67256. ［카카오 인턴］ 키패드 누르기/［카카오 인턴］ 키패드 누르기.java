class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int L_x = 0, L_y = 3;
        int R_x = 2, R_y = 3;
        
        boolean R_human = hand.equals("right");

        for (int i = 0; i < numbers.length; i++) {
            int tmp_num = numbers[i];
            int num_x, num_y;
            
            if (tmp_num == 0) {
                num_x = 1;
                num_y = 3;
            } 
            else {
                num_x = (tmp_num - 1) % 3;
                num_y = (tmp_num - 1) / 3;
            }
            
            if (num_x == 0) {
                answer += "L";
                L_x = num_x;
                L_y = num_y;
            }
            else if (num_x == 2) {
                answer += "R";
                R_x = num_x;
                R_y = num_y;
            }
            else {
                double L_length = getDistance(num_x, num_y, L_x, L_y);
                double R_length = getDistance(num_x, num_y, R_x, R_y);
                
                if (L_length < R_length) {
                    answer += "L";
                    L_x = num_x;
                    L_y = num_y;
                } 
                else if (R_length < L_length) {
                    answer += "R";
                    R_x = num_x;
                    R_y = num_y;
                } 
                else {
                    if (R_human) {
                        answer += "R";
                        R_x = num_x;
                        R_y = num_y;
                    } else {
                        answer += "L";
                        L_x = num_x;
                        L_y = num_y;
                    }
                }
            }
        }
        
        return answer;
    }

    static double getDistance(int x, int y, int x1, int y1) {
        return Math.abs(x1 - x) + Math.abs(y1 - y);
    }
}
