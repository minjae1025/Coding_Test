class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) {
            return 0;
        }
        int answer = -1;
        int cnt = 1;
        while (true) {
            if (cnt > B.length()) {
                break;
            }
            String temp = "";
            char last = A.charAt(A.length()-1);
            for (int i = 0; i<A.length()-1; i++) {
                temp += A.charAt(i);
            }
            String compare = last+temp;
            if (compare.equals(B)) {
                answer = cnt;
                break;
            }
            else {
                A = compare;
                cnt++;
            }
        }
        return answer;
    }
}