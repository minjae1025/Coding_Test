class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] paint = new boolean[n];
        int idx = 0;

        for (int i = 0; i < section.length; i++) {
            paint[section[i] - 1] = true;
        }

        for (int i = 0; i < n; i++) {
            if (paint[i]) {
                answer++;
                for (int j = i; j<i+m && j<n; j++) {
                    paint[j] = false;
                }
            }
        }

        return answer;
    }
}
