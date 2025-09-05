import java.util.*;
class Solution {
    static int min = 10000;
    public int solution(int[][] maps) {
        int n = maps.length; 
        int m = maps[0].length;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
       
        while (!queue.isEmpty()) {
            int[] cur = queue.remove();
            int x = cur[0];
            int y = cur[1];
            
            for (int i = 0; i < 4; i++) {
                int n_x = x + dx[i];
                int n_y = y + dy[i];
                
                if (n_x < 0 || n_y < 0 || n_x >= n || n_y >= m) continue;
                if (maps[n_x][n_y] != 1) continue;
                
                maps[n_x][n_y] = maps[x][y] + 1;
                queue.add(new int[]{n_x, n_y});
            }
        }
        return maps[n-1][m-1] == 1 ? -1 : maps[n-1][m-1];
    }
}