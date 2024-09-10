class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int cnt = 1;
        int width = n - 1;
        int height = n - 1;
        int row = 0, col = 0; //행, 열
        int move = 0; // 0: 오른쪽, 1: 아래, 2: 왼쪽, 3: 위쪽

        while (cnt <= n * n) {
            if (move == 0) { // 오른쪽으로 이동
                for (int i = col; i <= width; i++) {
                    answer[row][i] = cnt++;
                }
                row++; // 아래쪽으로 한 칸 내려감
                move = 1; // 방향을 아래로 전환
            } 
            else if (move == 1) { // 아래로 이동
                for (int i = row; i <= height; i++) {
                    answer[i][width] = cnt++;
                }
                width--; // 오른쪽 경계를 한 칸 줄임
                move = 2; // 방향을 왼쪽으로 전환
            } 
            else if (move == 2) { // 왼쪽으로 이동
                for (int i = width; i >= col; i--) {
                    answer[height][i] = cnt++;
                }
                height--; // 아래쪽 경계를 한 칸 줄임
                move = 3; // 방향을 위쪽으로 전환
            } 
            else if (move == 3) { // 위쪽으로 이동
                for (int i = height; i >= row; i--) {
                    answer[i][col] = cnt++;
                }
                col++; // 왼쪽 경계를 한 칸 줄임
                move = 0; // 방향을 다시 오른쪽으로 전환
            }
        }
        return answer;
    }
}
