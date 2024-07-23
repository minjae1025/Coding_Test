class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int cnt = 0;
        for (int i = 0; i<dic.length; i++) {
            for (int j = 0; j<spell.length; j++) {
                for (int k = 0; k<dic[i].length(); k++) {
                    char alp = dic[i].charAt(k);
                    String temp = Character.toString(alp);
                    if (temp.equals(spell[j])) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt == spell.length) {
                answer = 1;
                break;
            }
            else {
                answer = 2;
                cnt = 0;
            }
        }
        return answer;
    }
}