class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int h_max = 0;
        int w_max = 0;
        for (int i = 0; i<sizes.length; i++) {
            int w = sizes[i][0];
            int h = sizes[i][1];
            if (w < h) {
                int temp = w;
                w = h;
                h = temp;
            }
            if (w > w_max) {
                w_max = w;
            }
            if (h > h_max) {
                h_max = h;
            }
        }
        return h_max*w_max;
    }
}