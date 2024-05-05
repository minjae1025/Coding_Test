class Solution {
    public int[] solution(int[] num_list) {
        int leng = num_list.length;
        int[] answer = new int[leng];
        for (int i = 0; i<leng; i++)
            answer[i]=num_list[leng-i-1];
        return answer;
    }
}