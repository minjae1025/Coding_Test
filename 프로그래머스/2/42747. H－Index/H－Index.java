import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int books = citations.length;
        int answer = 0;
        for (int i = books-1; i>=0; i--) {
            if (books - i <= citations[i]) {
                answer = books - i;
            } 
        }
        return answer;
    }
}