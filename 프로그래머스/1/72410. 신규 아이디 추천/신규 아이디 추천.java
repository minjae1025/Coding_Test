import java.util.*;

class Solution {
    public String solution(String new_id) {
        // 1단계: 모든 대문자를 소문자로 치환
        new_id = new_id.toLowerCase();

        // 2단계: 알파벳 소문자, 숫자, '-', '_', '.'을 제외한 모든 문자 제거
        ArrayList<Character> id = new ArrayList<>(16);
        for (int i = 0; i < new_id.length(); i++) {
            char c = new_id.charAt(i);
            if (c == '-' || c == '_' || c == '.' || (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
                id.add(c);
            }
        }

        // 3단계: 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        for (int i = 1; i < id.size(); i++) {
            if (id.get(i) == '.' && id.get(i - 1) == '.') {
                id.remove(i--); // i--로 연속된 마침표 모두 처리
            }
        }

        // 4단계: 마침표가 처음이나 끝에 위치하면 제거
        if (!id.isEmpty() && id.get(0) == '.') {
            id.remove(0);
        }
        if (!id.isEmpty() && id.get(id.size() - 1) == '.') {
            id.remove(id.size() - 1);
        }

        // 5단계: 빈 문자열이면 "a"를 대입
        if (id.isEmpty()) {
            id.add('a');
        }

        // 6단계: 길이가 16자 이상이면 첫 15개의 문자를 제외한 나머지 문자 제거, 끝에 마침표 있으면 제거
        if (id.size() > 15) {
            while (id.size() > 15) {
                id.remove(id.size() - 1);
            }
            if (id.get(id.size() - 1) == '.') {
                id.remove(id.size() - 1);
            }
        }

        // 7단계: 길이가 2자 이하라면, 마지막 문자를 길이가 3이 될 때까지 반복해서 끝에 붙임
        while (id.size() < 3) {
            id.add(id.get(id.size() - 1));
        }

        // 리스트를 문자열로 변환
        StringBuilder answer = new StringBuilder();
        for (char c : id) {
            answer.append(c);
        }

        return answer.toString();
    }
}
