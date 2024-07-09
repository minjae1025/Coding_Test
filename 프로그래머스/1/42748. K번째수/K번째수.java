class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int i = 0; i<commands.length; i++) {
            int[] temp = new int[commands[i][1]-commands[i][0]+1];
            idx = 0;
            for (int j = commands[i][0]-1; j<commands[i][1]; j++) {
                temp[idx++] = array[j];
            }
            for (int j = 0; j<temp.length; j++) {
                for (int k = 0; k<temp.length; k++) {
                   if (temp[j] < temp[k]) {
                       int trash = temp[j];
                       temp[j] = temp[k];
                       temp[k] = trash;
                   } 
                }
            }
            answer[i] = temp[(commands[i][2]-1)];
        }
        return answer;
    }
}