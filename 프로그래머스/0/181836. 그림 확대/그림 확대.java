class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        for (int i = 0; i<answer.length; i++) {
            answer[i] = "";
        }
        int cnt = 0;
        for (int i = 0; i<answer.length; i+=k) {
            for (int j = 0; j<picture[cnt].length(); j++) {
                char temp = picture[cnt].charAt(j);
                for (int t = 0; t<k; t++) {
                    answer[i] += temp;
                }
            }
            for (int j = i; j<i+k; j++) {
                answer[j] = answer[i];
            }
            cnt++;
            //for (int j = i; i<)
        }
        return answer;
    }
}