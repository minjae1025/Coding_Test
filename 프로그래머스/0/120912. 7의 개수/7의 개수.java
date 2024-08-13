class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i<array.length; i++) {
            String length = Integer.toString(array[i]);
            for (int j = 0; j<length.length(); j++) {
                char temp = length.charAt(j);
                if (temp-48 == 7) {
                    answer++;
                }
            }
        }
        return answer;
    }
}