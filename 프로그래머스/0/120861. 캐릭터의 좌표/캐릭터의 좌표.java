class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int p_x = board[0]/2;
        int p_y = board[1]/2;
        int m_x = board[0]/2*-1;
        int m_y = board[1]/2*-1;
        
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left")) {
                if (answer[0] > m_x) {
                    answer[0]--;
                }
            } else if (keyinput[i].equals("right")) {
                if (answer[0] < p_x) {
                    answer[0]++;
                }
            } else if (keyinput[i].equals("up")) {
                if (answer[1] < p_y) {
                    answer[1]++;
                }
            } else if (keyinput[i].equals("down")) {
                if (answer[1] > m_y) {
                    answer[1]--;
                }
            }
        }
        
        return answer;
    }
}
