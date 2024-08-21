class Solution {
    public int solution(String my_string) {
        
        String[] str_arr = my_string.split(" ");
        int answer = Integer.parseInt(str_arr[0]);
        int op = 0;
        for (int i = 0; i<str_arr.length; i++) {
            if (i % 2 == 0) {
                op *= Integer.parseInt(str_arr[i]);
                answer += op;
            }
            else {
                switch (str_arr[i]) {
                    case "+" : op = 1; break;
                    case "-" : op = -1; break;
                }
            }
        }
        
        return answer;
    }
}