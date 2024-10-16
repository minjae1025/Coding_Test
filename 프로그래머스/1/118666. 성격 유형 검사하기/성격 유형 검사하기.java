public class Solution {
    public String solution(String[] survey, int[] choices) {
        int[] scores = new int[8];
        char[] types = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};

        for (int i=0; i<survey.length; i++) {
            String question = survey[i];
            int choice = choices[i];
            int score = Math.abs(choice - 4);
            
            if (choice < 4) {
                addScore(question.charAt(0), score, scores, types);
            } 
            else if (choice > 4) {
                addScore(question.charAt(1), score, scores, types);
            }
        }

        String result = "";
        result += (scores[0] >= scores[1] ? 'R' : 'T');
        result += (scores[2] >= scores[3] ? 'C' : 'F');
        result += (scores[4] >= scores[5] ? 'J' : 'M');
        result += (scores[6] >= scores[7] ? 'A' : 'N');

        return result;
    }

    void addScore(char type, int score, int[] scores, char[] types) {
        for (int i=0; i<types.length; i++) {
            if (type == types[i]) {
                scores[i] += score;
                break;
            }
        }
    }
}
