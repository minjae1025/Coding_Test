import java.util.*;

class Solution {
    public int solution(String number) {
        int answer = 0;
        char[] num = number.toCharArray();
        int sum = 0;
        for (int i = 0; i<num.length; i++) {
            sum += num[i]-'0';
        }
        int rest = sum%9;
        return rest;
    }
}