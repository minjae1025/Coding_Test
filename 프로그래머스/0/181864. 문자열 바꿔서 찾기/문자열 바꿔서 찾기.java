class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String reverse = "";
        for (int i = 0; i<myString.length(); i++) {
            char temp = myString.charAt(i);
            if (temp == 'A') {
                reverse += "B";
            }
            else if (temp == 'B') {
                reverse += "A";
            }
        }
        
        for (int i = 0; i<myString.length()-pat.length()+1; i++) {
            String compare = "";
            for (int j = i; j<pat.length()+i; j++) {
                compare += reverse.charAt(j);
            }
            if (compare.equals(pat)) {
                answer = 1;
            }
        }
        
        return answer;
    }
}