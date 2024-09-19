class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] oyo = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            String temp = babbling[i];
            String lastWord = "";

            for (int j = 0; j < oyo.length; j++) {
                if (temp.contains(oyo[j] + oyo[j])) {
                    temp = "X";
                    break;
                }
            }

            if (!temp.equals("X")) {
                for (int j = 0; j < oyo.length; j++) {
                    temp = temp.replace(oyo[j], " ");
                }

                if (temp.trim().isEmpty()) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
