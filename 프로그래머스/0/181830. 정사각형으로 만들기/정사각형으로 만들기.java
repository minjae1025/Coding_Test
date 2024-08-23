class Solution {
    public int[][] solution(int[][] arr) {
        int width = arr.length;
        int heigth = arr[0].length;
        int length = width>heigth? width: heigth;
        int[][] answer = new int[length][length];
        for (int i = 0; i<width; i++) {
            for (int j = 0; j<heigth; j++) {
                if (i > arr.length && j > arr[i].length) {
                    answer[i][j] = 0;
                }
                else {
                    answer[i][j] = arr[i][j];
                }
            }
        }
        return answer;
    }
}