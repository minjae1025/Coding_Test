class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int h = (n%w == 0)? n/w: n/w+1;
        int[][] boxs = new int[h][w];
        
        int cnt = 1;
        int start;
        int end;
        while (cnt <= n) {
            h--;
            for (int i = 0; i<w; i++) {
                if (cnt > n) {
                    break;
                }
                boxs[h][i] = cnt;
                cnt++;
            }
            
            if (h <= 0) {
                break;
            }
            
            h--;
            for (int i = w-1; i>=0; i--) {
                if (cnt > n) {
                    break;
                }
                boxs[h][i] = cnt;
                cnt++;
            }
        }
        
        // for (int i = 0; i<boxs.length; i++) {
        //     for (int j = 0; j<boxs[i].length; j++) {
        //         System.out.print(" "+boxs[i][j]);
        //     }
        //     System.out.println();
        // }
        
        int box_x = 0;
        int box_y = 0;
        
        for (int i = 0; i<boxs.length; i++) {
            for (int j = 0; j<boxs[i].length; j++) {
                if (boxs[i][j] == num) {
                    box_x = j;
                    box_y = i;
                }
            }
        }
        
        while (true) {
            if (box_y >= 0 && boxs[box_y][box_x] != 0) {
                answer++;
                box_y--;
            }
            else {
                break;
            }
        }
        
        return answer;
    }
}