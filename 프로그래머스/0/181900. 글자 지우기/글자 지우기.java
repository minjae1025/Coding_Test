import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.sort(indices);
        int cnt = 0;
        for (int i = 0; i<my_string.length(); i++) {
            if (cnt < indices.length && i==indices[cnt]) {
                cnt++;
                continue;
            }
            answer += my_string.charAt(i);
        }
        return answer;
    }
}