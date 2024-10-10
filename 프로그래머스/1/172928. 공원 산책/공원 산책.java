class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[][] map = new int[park.length][park[0].length()];
        int[] answer = {0, 0};
        
        // 'X'와 'S' 처리
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'X') {
                    map[i][j] = 1;
                } else if (park[i].charAt(j) == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        
        for (int i = 0; i < routes.length; i++) {
            if (getMove(map, routes[i], answer)) {
                char direction = routes[i].charAt(0);
                int step = routes[i].charAt(2) - '0';
                
                if (direction == 'E') {
                    answer[1] += step;
                } 
                else if (direction == 'W') {
                    answer[1] -= step;
                } 
                else if (direction == 'N') {
                    answer[0] -= step;
                } 
                else if (direction == 'S') {
                    answer[0] += step;
                }
            }
        }
        
        return answer;
    }
    
    static boolean getMove(int[][] map, String route, int[] position) {
        char op = route.charAt(0);
        int length = route.charAt(2) - '0';
        int x = position[0];
        int y = position[1];
        
        if (op == 'E') {
            for (int i = 1; i <= length; i++) {
                if (y + i >= map[0].length || map[x][y + i] == 1) {
                    return false;
                }
            }
        } 
        else if (op == 'W') {
            for (int i = 1; i <= length; i++) {
                if (y - i < 0 || map[x][y - i] == 1) {
                    return false;
                }
            }
        } 
        else if (op == 'N') {
            for (int i = 1; i <= length; i++) {
                if (x - i < 0 || map[x - i][y] == 1) {
                    return false;
                }
            }
        } 
        else if (op == 'S') {
            for (int i = 1; i <= length; i++) {
                if (x + i >= map.length || map[x + i][y] == 1) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
