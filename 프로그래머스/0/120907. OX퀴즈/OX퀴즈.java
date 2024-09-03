class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i<quiz.length; i++) {
            String[] cel = quiz[i].split(" ");
            int num1 = Integer.parseInt(cel[0]);
            int num2 = Integer.parseInt(cel[2]);
            char op = cel[1].charAt(0);
            int sum = Integer.parseInt(cel[4]);
            if (op == '+') {
                if (num1 + num2 == sum) {
                    answer[i] = "O";
                }
                else {
                    answer[i] = "X";
                }
             }
            else if (op == '-') {
                if (num1 - num2 == sum) {
                    answer[i] = "O";
                }
                else {
                    answer[i] = "X";
                }
             }
        }
        return answer;
    }
}