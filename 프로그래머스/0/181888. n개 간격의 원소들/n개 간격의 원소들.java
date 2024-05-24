class Solution {
    public int[] solution(int[] num_list, int n) {
        int num = 0;
        for (int i = num_list.length; i>0; i-=n){
            num++;
        }
        int[] answer = new int[num];
        int count = 0;
        for (int i = 0; i<num_list.length; i++) {
            if (i == 0 || i%n==0) {
                answer[count] = num_list[i];
                count++;
            }
        }
        return answer;
    }
}