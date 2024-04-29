class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int total = (n * 12000) + (k * 2000);
        int cola = n / 10;
        if (cola > 0)
            total = total - (cola * 2000);
        answer = total;
        return answer;
    }
}