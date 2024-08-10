import java.util.Arrays;
class Solution {
    public String[] solution(String my_str, int n) {
        int size = 0;
        if (my_str.length()%n == 0) {
            size = my_str.length()/n;
        }
        else {
            size = (my_str.length()/n)+1;
        }
        String[] answer = new String[size];
        int cnt = 0;
        for (int i = 0; i<my_str.length(); i+=n) {
            if (i+n < my_str.length())
                answer[cnt++] = my_str.substring(i, i+n);
            else {
                answer[cnt++] = my_str.substring(i);
            }
        }
        return answer;
    }
}