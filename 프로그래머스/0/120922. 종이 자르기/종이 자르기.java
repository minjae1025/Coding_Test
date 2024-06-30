class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        int size = M * N;
        int count = 0;
        for (int i = 0; i<size-1; i++) {
            count++;
        }
        answer = count;
        return answer;
    }
}