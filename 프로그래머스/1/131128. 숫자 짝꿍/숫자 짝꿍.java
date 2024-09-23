import java.util.*;
import java.lang.StringBuilder;

class Solution {
    public String solution(String X, String Y) {
        // char[] c_x = X.toCharArray();
        // char[] c_y = Y.toCharArray();
        // Arrays.sort(c_x);
        // Arrays.sort(c_y);
        
        int[] x_cnt = new int[10];
        int[] y_cnt = new int[10];
        
        for (int i = 0; i<X.length(); i++) {
            x_cnt[X.charAt(i)-'0']++;
        }
        
        for (int i = 0; i<Y.length(); i++) {
            y_cnt[Y.charAt(i)-'0']++;
        }
        
        StringBuilder answer = new StringBuilder();
        for (int i = 9; i>=0; i--) {
            if (x_cnt[i] == 0 || y_cnt[i] == 0) {
                continue;
            }
            int min = 0;
            if (y_cnt[i] < x_cnt[i]) {
                min = y_cnt[i];
            }
            else {
                min = x_cnt[i];
            }
            for (int j = 0; j<min; j++) {
                answer.append(Integer.toString(i));
            }
        }
        if ((answer.toString()).equals("")) {
            return "-1";
        }
        
        if ((answer.toString()).charAt(0) == '0') {
            return "0";
        }
        
        return (answer.toString());
    }
}