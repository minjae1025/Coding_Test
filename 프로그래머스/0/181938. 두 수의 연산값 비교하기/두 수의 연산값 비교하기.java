class Solution {
    public int solution(int a, int b) {
        String A = Integer.toString(a);
        String B = Integer.toString(b);
        String temp = A+B;
        int num1 = Integer.parseInt(temp);
        int num2 = 2*a*b;
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
}