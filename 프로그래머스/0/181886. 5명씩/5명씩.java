class Solution {
    public String[] solution(String[] names) {
        int num = 0;
        if (names.length%5 == 0) {
            num = names.length/5;
        }
        else {
            num = names.length/5+1;
        }
        String[] answer = new String[num];
        for (int i = 0; i<names.length; i+=5) {
            answer[i/5] = names[i];
        }
        return answer;
    }
}