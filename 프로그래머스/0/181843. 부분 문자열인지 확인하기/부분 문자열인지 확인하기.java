class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        for (int i = 0; i<my_string.length()-target.length()+1; i++) {
            String compare = "";
            for (int j = i; j<target.length()+i; j++) {
                compare += my_string.charAt(j);
            }
            if (compare.equals(target)) {
                answer = 1;
            }
        }
        return answer;
    }
}