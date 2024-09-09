class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        for (int i = 0; i<board.length; i++) {
            for (int j = 0; j<board[i].length; j++) {
                if (board[i][j] == 1) {
                    for (int k = -1; k<=1; k++) {
                        for (int l = -1; l<=1; l++) {
                            if (i + k < 0 || j + l < 0) {
                                continue;
                            }
                            else if (i + k >= board.length || j + l >= board[j].length) {
                                continue;
                            }
                            else if (k == 0 & l == 0) {
                                continue;
                            }
                            else if (board[i+k][j+l] == 1) {
                                continue;
                            }
                            else {
                                board[i+k][j+l] = 2;
                            }
                        }
                    }
                } 
            }
        }
        for (int i = 0; i<board.length; i++) {
            for (int j = 0; j<board[i].length; j++) {
                if (board[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}