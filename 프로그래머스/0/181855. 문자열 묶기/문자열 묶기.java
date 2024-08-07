class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] leng = new int[31];
        for (int i = 0; i<strArr.length; i++) {
            leng[strArr[i].length()]++;
        }
        int max = 0;
        for (int i = 0; i<leng.length; i++) {
            if (leng[i] > max) {
                max = leng[i];
            }
            answer = max;
        }
        return answer;
    }
}