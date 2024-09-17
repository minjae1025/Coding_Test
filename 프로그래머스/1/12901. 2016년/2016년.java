class Solution {
    public String solution(int a, int b) {
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        int total = 0;
        
        for(int i=0; i<a; i++) {
            total += month[i];
        }
        
        String answer = day[(total + b + 4) % 7];

        return answer;
    }
}