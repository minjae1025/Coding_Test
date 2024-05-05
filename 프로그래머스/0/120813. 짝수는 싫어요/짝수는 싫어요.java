class Solution {
    public int[] solution(int n) {
        int[] answer;
        if (n%2==1)
            answer = new int[n/2+1];
        else
            answer = new int[n/2];
        int j=1;
        for (int i=0; i<answer.length; i++) {
            answer[i]=j;
            j=j+2;
        }
        return answer;
    }
}