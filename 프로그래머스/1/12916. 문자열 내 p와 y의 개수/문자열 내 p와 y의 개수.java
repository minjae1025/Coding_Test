class Solution {
    boolean solution(String s) {
        int p_num = 0;
        int y_num = 0;
        for (int i = 0; i<s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == 'p' || temp == 'P') {
                p_num++;
            }
            else if (temp == 'y' || temp == 'Y') {
                y_num++;
            }
        }
        if (p_num == y_num) {
            return true;
        }
        else {
            return false;
        }
    }
}