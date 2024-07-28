class Solution {
    public int solution(String binomial) {
        // 초기화
        int answer = 0;
        String num1 = "";
        String num2 = "";
        char op = ' ';

        // 문자열을 순회하며 처리
        for (int i = 0; i < binomial.length(); i++) {
            char temp = binomial.charAt(i);
            
            // 공백은 무시
            if (temp == ' ') {
                continue;
            }
            
            // 연산자이면 op에 저장
            if (temp == '+' || temp == '-' || temp == '*') {
                op = temp;
                continue;
            }
            
            // 숫자이면 num1 또는 num2에 저장
            if (op == ' ') {
                num1 += temp;
            } else {
                num2 += temp;
            }
        }

        // 숫자를 정수로 변환
        int one = Integer.parseInt(num1);
        int two = Integer.parseInt(num2);

        // 연산 수행
        switch (op) {
            case '+' : answer = one + two; break;
            case '-' : answer = one - two; break;
            case '*' : answer = one * two; break;
        }

        return answer;
    }
}
