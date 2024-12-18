class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {0, sequence.length - 1};
        int left = 0;
        int right = 0;
        int sum = sequence[0];
        int minLength = sequence.length;

        while (right < sequence.length) {
            if (sum < k) {
                right++;
                if (right < sequence.length) { // right가 배열 범위를 벗어나지 않도록 확인
                    sum += sequence[right];
                }
            } else if (sum == k) {
                if (right - left < minLength) {
                    minLength = right - left;
                    answer[0] = left;
                    answer[1] = right;
                }
                sum -= sequence[left]; // left를 옮기기 전에 현재 left 값을 빼줌
                left++;
            } else {
                sum -= sequence[left];
                left++;
                if (left > right && left < sequence.length) { // left가 right를 초과하면 right를 left와 맞춤
                    right = left;
                    sum = sequence[left];
                }
            }
        }
        return answer;
    }
}