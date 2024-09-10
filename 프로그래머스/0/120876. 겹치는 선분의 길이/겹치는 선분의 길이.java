class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] line = new int[201];
        for (int i = 0; i<lines.length; i++) {
            for (int j = lines[i][0]; j<lines[i][1]; j++) {
                line[j+100]++;
            }
        }
        for (int i = 0; i<line.length; i++) {
            if (line[i] >= 2) {
                answer++;
            }
        }
        return answer;
    }
}