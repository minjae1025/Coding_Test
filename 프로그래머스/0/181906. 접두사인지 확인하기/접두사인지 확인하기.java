class Solution {
    public int solution(String my_string, String is_prefix) {
        String[] prefix = new String[my_string.length()];
        for (int i = 0; i<my_string.length(); i++) {
            prefix[i] = my_string.substring(0, i+1);
        }
        for (int i = 0; i<prefix.length; i++) {
            if (prefix[i].equals(is_prefix)) {
                return 1;
            }
        }
        return 0;
    }
}