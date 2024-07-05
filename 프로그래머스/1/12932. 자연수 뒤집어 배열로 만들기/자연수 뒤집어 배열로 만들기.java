class Solution {
    public int[] solution(long n) {
        int cnt = 0;
        long temp = n;
        while (temp>0) {
            temp/=10;
            cnt++;
        }
        int[] answer = new int[cnt];
        int i = 0;
        while(cnt > i){
            answer[i++] = (int)(n%10);
            n/=10;
        }
        return answer;
    }
}