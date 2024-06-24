class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] total = new double[score.length];
        for (int i = 0; i<total.length; i++) {
            total[i] = ((double)score[i][0] + (double)score[i][1]) / 2;
        }
        for (int i = 0; i<score.length; i++) {
            answer[i]++;
            for (int j = i; j<score.length; j++) {
                if (total[i] < total[j])  {
        				answer[i]++;
        		}
				else if (total[i] > total[j]) {
            			answer[j]++;
        		}
            }
        }
        return answer;
    }
}