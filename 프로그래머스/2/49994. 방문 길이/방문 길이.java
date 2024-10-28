import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        Set<String> history = new HashSet<>();
        char[] list = dirs.toCharArray();
        int x = 0;
        int y = 0;

        for (int i = 0; i < list.length; i++) {
            int beX = x;
            int beY = y;
            
            if (list[i] == 'U' && y < 5) y++;
            else if (list[i] == 'D' && y > -5) y--;
            else if (list[i] == 'R' && x < 5) x++;
            else if (list[i] == 'L' && x > -5) x--;

            //현재 위치와 이전 위치가 같지 않을 때만 기록
            if (beX != x || beY != y) {
                String path1 = beX + "," + beY + "->" + x + "," + y;
                String path2 = x + "," + y + "->" + beX + "," + beY;
                history.add(path1);
                history.add(path2);
            }
        }
        
        answer = history.size() / 2; //양방향으로 기록 -> 절반이 실제 경로 수
        return answer;
    }
}
