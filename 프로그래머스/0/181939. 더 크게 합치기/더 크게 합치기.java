class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String A = Integer.toString(a);
        String B = Integer.toString(b);
        String num1 = A+B;
        String num2 = B+A;
        if (Integer.parseInt(num1)>Integer.parseInt(num2))
            return Integer.parseInt(num1);
        else
            return Integer.parseInt(num2);
    }
}