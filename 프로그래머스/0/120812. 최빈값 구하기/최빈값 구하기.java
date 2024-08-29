class Solution {
    public int solution(int[] array) {
        int[] cnt = new int[1001];
        int maxCount = 0; 
        int answer = -1;

        for (int i = 0; i < array.length; i++) {
            cnt[array[i]]++;
        }

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > maxCount) {
                maxCount = cnt[i];
                answer = i;
            } else if (cnt[i] == maxCount) {
                answer = -1;
            }
        }

        return answer;
    }
}
