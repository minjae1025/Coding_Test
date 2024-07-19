class Solution {
    public int[] solution(String my_string) {
        int size = 0;
        for (int i = 0; i<my_string.length(); i++) {
            char temp = my_string.charAt(i);
            if (temp > 47 && temp < 58) {
                size++;
            }
        }
        int[] answer = new int[size];
        int idx = 0;
        for (int i = 0; i<my_string.length(); i++) {
            char temp = my_string.charAt(i);
            if (temp > 47 && temp < 58) {
                answer[idx++] = temp-48;
            }
        }
        for (int i = 0; i<size; i++) {
            for (int j = 0; j<size; j++) {
                if (answer[i]<answer[j]) {
                    int trash = answer[i];
                    answer[i] = answer[j];
                    answer[j] = trash;
                }
            }
        }
        return answer;
    }
}