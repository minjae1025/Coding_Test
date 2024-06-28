class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int size = 0;
        for (int i = 0; i<intervals.length; i++) {
            size += intervals[i][1] - intervals[i][0] + 1;
        }
        int[] answer = new int[size];
        int idx = 0;
        for (int i = intervals[0][0]; i<=intervals[0][1]; i++) {
            answer[idx++] = arr[i];
        }
        for (int i = intervals[1][0]; i<=intervals[1][1]; i++) {
            answer[idx++] = arr[i];
        }
        return answer;
    }
}