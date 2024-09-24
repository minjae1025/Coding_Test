class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] idx = new int[board.length];
        int[] cnt = new int[moves.length];
        int top = -1; // 스택의 최상단을 가리키는 인덱스
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] > 0) {
                    idx[i] = j;
                    break;
                }
            }
        }

        for (int i = 0; i < moves.length; i++) {
            int column = moves[i] - 1;
            if (idx[column] < board.length && board[idx[column]][column] > 0) {
                cnt[++top] = board[idx[column]][column];
                board[idx[column]][column] = 0;
                idx[column]++;
                
                if (top > 0 && cnt[top] == cnt[top-1]) {
                    answer += 2;
                    top -= 2;
                }
            }
        }
        
        return answer;
    }
}
