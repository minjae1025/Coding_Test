import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        char[] text = dartResult.toCharArray();
        int[] p_score = new int[3];
        int cnt = 0;
        int temp = 0;

        for (int i = 0; i < text.length; i++) {
            if (text[i] >= '1' && text[i] <= '9') {
                temp = text[i] - '0';
            } 
            else if (text[i] == '0' && i>0 && text[i-1] == '1') {
                temp = 10;
            } 
            else if (text[i] == '0') {
                temp = 0;
            } 
            else if (text[i] == 'S' || text[i] == 'D' || text[i] == 'T') {
                if (text[i] == 'S') {
                } 
                else if (text[i] == 'D') {
                    temp = temp * temp;
                } 
                else {
                    temp = temp * temp * temp;
                }
                answer += temp;
                p_score[cnt++] = temp;
            } 
            else if (text[i] == '*') {
                answer += p_score[cnt-1];
                if (cnt > 1) {
                    answer += p_score[cnt-2];
                }
                p_score[cnt-1] *= 2;
                if (cnt > 1) {
                    p_score[cnt-2] *= 2;
                }
            } 
            else if (text[i] == '#') {
                answer -= 2 * p_score[cnt-1];
                p_score[cnt-1] *= -1;
            }
        }
        return answer;
    }
}
