class Solution {
    public String solution(String s) {
        String[] num = s.split(" ");
        int min = Integer.parseInt(num[0]);
        int max = min;
        for (int i = 1; i<num.length; i++) {
            int temp = Integer.parseInt(num[i]);
            if (temp < min) {
                min = temp;
            }
            else if (temp > max) {
                max = temp;
            }
        }
        String answer = min+" "+max;
        return answer;
    }
}