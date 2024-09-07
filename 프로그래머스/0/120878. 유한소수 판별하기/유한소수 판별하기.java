import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int gcd = findGCD(a, b);
        a /= gcd;
        b /= gcd;
        ArrayList <Integer> list = new ArrayList<>();
        while (1 < b) {
            for (int i = 2; i<=b; i++) {
                if (b%i == 0) {
                    b/=i;
                    list.add(i);
                    break;
                }
            }
        }
        
        int[] temp = new int[list.size()];
        for (int i = 0; i<temp.length; i++) {
            temp[i] = list.get(i);
        }
        
        for (int i = 0; i<temp.length; i++) {
            if (temp[i] != 2 && temp[i] != 5) {
                return 2;
            }
        }
        return 1;
    }
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b); // 재귀적으로 나머지를 사용
    }
}