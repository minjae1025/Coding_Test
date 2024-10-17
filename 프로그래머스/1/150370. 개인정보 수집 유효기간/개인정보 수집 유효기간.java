import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        // 현재 날짜를 연도, 월, 일로 분리하여 총 일수로 변환
        int now_year = Integer.parseInt(today.substring(0, 4));
        int now_month = Integer.parseInt(today.substring(5, 7));
        int now_day = Integer.parseInt(today.substring(8));
        int now = (now_year * 12 * 28) + (now_month * 28) + now_day;

        ArrayList<Integer> list = new ArrayList<>();
        Map<Character, Integer> termMap = new HashMap<>();

        // 약관 정보를 맵에 저장 (약관 종류 -> 기간(개월))
        for (int i = 0; i < terms.length; i++) {
            char type = terms[i].charAt(0);
            int period = Integer.parseInt(terms[i].substring(2)); // 기간(개월)
            termMap.put(type, period);
        }

        // 개인정보의 만료 확인
        for (int i = 0; i < privacies.length; i++) {
            // 개인정보의 연도, 월, 일 추출
            int year = Integer.parseInt(privacies[i].substring(0, 4));
            int month = Integer.parseInt(privacies[i].substring(5, 7));
            int day = Integer.parseInt(privacies[i].substring(8, 10));
            char termType = privacies[i].charAt(privacies[i].length() - 1);
            
            int period = termMap.get(termType);
            month += period;

            while (month > 12) {
                year += 1;
                month -= 12;
            }

            int expiration = (year * 12 * 28) + (month * 28) + day;

            if (now >= expiration) {
                list.add(i + 1);
            }
        }

        // 결과 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
