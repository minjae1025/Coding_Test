class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        int[] alp1= new int[26];
        int[] alp2= new int[26];
        for (int i = 0; i<before.length(); i++) {
            char temp = before.charAt(i);
            alp1[temp-97]++;
        }
        for (int i = 0; i<after.length(); i++) {
            char temp = after.charAt(i);
            alp2[temp-97]++;
        }
        for (int i = 0; i<alp1.length; i++) {
            if (alp1[i] == alp2[i]) {
                answer = 1;
            }
            else {
                return 0;
            }
        }
        return answer;
    }
}