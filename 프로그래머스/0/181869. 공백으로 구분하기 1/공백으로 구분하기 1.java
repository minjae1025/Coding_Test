class Solution {
    public String[] solution(String my_string) {
        // 공백을 기준으로 문자열을 나누어서 배열로 반환
        String[] answer = my_string.trim().split("\\s+");
        return answer;
    }
}
