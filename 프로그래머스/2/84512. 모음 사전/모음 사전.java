class Solution {
    static String find_word = "";
    static char[] alp =  {'A', 'E', 'I', 'O', 'U'};
    static String alps = "AEIOU";

    public static int solution(String word) {
        find_word = word;
        return find_count("A", 1);
    }

    public static int find_count(String current, int cnt) {
        if (current.equals(find_word)) {
            return cnt;
        }

        int current_len = current.length();

        if (current_len < 5) {
            current += 'A';
        }
        else if (current.charAt(current_len-1) == 'U') {
            int tmp = 0;
            while (current.charAt(current_len-1) == 'U') {
                current = current.substring(0, current_len-1);
                current_len = current.length();
            }
            if (current_len == 1) {
                tmp = (alps.indexOf(current.charAt(current_len-1))+1)%5;
                current = "";
            }
            else {
                tmp = (alps.indexOf(current.charAt(current_len-1))+1)%5;
                current = current.substring(0, current_len-1);
            }
            current += alp[tmp];
        }
        else {
            int tmp = (alps.indexOf(current.charAt(current_len-1))+1)%5;
            current = current.substring(0, current_len-1) + alp[tmp];
        }

        cnt++;
        return find_count(current, cnt);
    }
}