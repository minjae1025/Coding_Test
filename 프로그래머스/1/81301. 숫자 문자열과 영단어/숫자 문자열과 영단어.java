class Solution {
    public long solution(String s) {
        String answer = "";
        String temp = "";
        for (int i = 0; i<s.length(); i++) {
            char alp = s.charAt(i);
            temp += alp;
            if (alp >= '0' && alp <= '9') {
                answer += alp;
                temp = "";
            } else if (temp.equals("zero")) {
                answer += "0";
                temp = "";
            } else if (temp.equals("one")) {
                answer += "1";
                temp = "";
            } else if (temp.equals("two")) {
                answer += "2";
                temp = "";
            } else if (temp.equals("three")) {
                answer += "3";
                temp = "";
            } else if (temp.equals("four")) {
                answer += "4";
                temp = "";
            } else if (temp.equals("five")) {
                answer += "5";
                temp = "";
            } else if (temp.equals("six")) {
                answer += "6";
                temp = "";
            } else if (temp.equals("seven")) {
                answer += "7";
                temp = "";
            } else if (temp.equals("eight")) {
                answer += "8";
                temp = "";
            } else if (temp.equals("nine")) {
                answer += "9";
                temp = "";
            }
        }
        return Long.parseLong(answer);
    }
}