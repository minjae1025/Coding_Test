class Solution {
    public int solution(String my_string, String is_suffix) {
        String[] suffix = new String[my_string.length()];
        for (int i = my_string.length()-1; i>=0; i--) {
            suffix[i] = my_string.substring(i, my_string.length());
        }
        for (int i = 0; i<suffix.length; i++) {
            if (suffix[i].equals(is_suffix)) {
                return 1;
            }
        }
        return 0;
    }
}