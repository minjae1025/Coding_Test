class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] % divisor == 0) {
                cnt++;
            }
        }
        if (cnt == 0) {
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[cnt];
        int idx = 0;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[idx++] = arr[i];
            }
        }
        for (int i = 0; i<answer.length-1; i++) {
            for (int j = i; j<answer.length; j++) {
                if (answer[i] > answer[j]) {
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        return answer;
    }
}