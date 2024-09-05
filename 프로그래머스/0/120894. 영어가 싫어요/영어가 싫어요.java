class Solution {
    public long solution(String numbers) {
        String answer = "";
        String temp = "";
        boolean flag = true;
        for (int i = 0; i<numbers.length(); i++) {
            temp += numbers.charAt(i);
            flag = true;
            switch (temp) {
                case "zero" : answer += "0"; break;
                case "one" : answer += "1"; break;
                case "two" : answer += "2"; break;
                case "three" : answer += "3"; break;
                case "four" : answer += "4"; break;
                case "five" : answer += "5"; break;
                case "six" : answer += "6"; break;
                case "seven" : answer += "7"; break;
                case "eight" : answer += "8"; break;
                case "nine" : answer += "9"; break;
                default : flag = false;
            }
            if (flag) {
                temp = "";
            }
        }
        
        return Long.parseLong(answer);
    }
}