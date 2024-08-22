class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toUpperCase(); // 대문자로 변환
        pat = pat.toUpperCase(); // 대문자로 변환

        if (myString.contains(pat)) {
            return 1;
        }
        return 0;
    }
}
