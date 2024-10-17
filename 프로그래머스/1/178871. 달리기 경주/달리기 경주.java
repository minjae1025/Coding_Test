import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        int n = players.length;
        
        // 선수 이름을 키로, 위치를 값으로 하는 해시맵
        HashMap<String, Integer> playerToPosition = new HashMap<>();
        // 위치를 키로, 선수 이름을 값으로 하는 해시맵
        HashMap<Integer, String> positionToPlayer = new HashMap<>();
        
        // 초기 상태 설정
        for (int i = 0; i < n; i++) {
            playerToPosition.put(players[i], i);
            positionToPlayer.put(i, players[i]);
        }
        
        // 호출 처리
        for (int i = 0; i < callings.length; i++) {
            String calledPlayer = callings[i];
            int currentPosition = playerToPosition.get(calledPlayer);
            int newPosition = currentPosition - 1;
            
            // 앞 선수와 위치 교환
            String overtakenPlayer = positionToPlayer.get(newPosition);
            
            // 해시맵 업데이트
            playerToPosition.put(calledPlayer, newPosition);
            playerToPosition.put(overtakenPlayer, currentPosition);
            positionToPlayer.put(newPosition, calledPlayer);
            positionToPlayer.put(currentPosition, overtakenPlayer);
        }
        
        // 결과 배열 생성
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = positionToPlayer.get(i);
        }
        
        return result;
    }
}