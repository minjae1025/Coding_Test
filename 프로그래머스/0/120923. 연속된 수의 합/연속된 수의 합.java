class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int first_num = total/num;
        while (true) {
            int sum = 0;
            for (int i = 0; i<num; i++) {
                sum += (i+first_num);
            }
            if (sum == total) {
                break;
            }
            else {
                sum = 0;
                first_num--;
            }
        }
        for (int i = 0; i<answer.length; i++) {
            answer[i] = first_num+i;
        }
        return answer;
    }
}