class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        int min = Integer.MAX_VALUE;
        int cnt = 0;
        int[] answer = new int[arr.length-1];
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                cnt = i;
            }
        }
        int idx = 0;
        for (int i = 0; i<arr.length; i++) {
            if (i == cnt) {
                continue;
            }
            answer[idx++] = arr[i];
        }
        return answer;
    }
}