class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        int temp = 0;
        for (int i = 0; i<num_list.length-1; i++) {
            for (int j = i; j<num_list.length; j++) {
                if (num_list[i] > num_list[j]) {
                    temp = num_list[i];
                    num_list[i] = num_list[j];
                    num_list[j] = temp;
                }
            }
        }
        temp = 0;
        for (int i = 5; i<num_list.length; i++) {
            answer[temp++] = num_list[i];
        }
        return answer;
    }
}