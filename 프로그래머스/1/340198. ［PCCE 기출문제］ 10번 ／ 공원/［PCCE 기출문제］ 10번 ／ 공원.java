class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        
        for (int i = 0; i<park.length; i++) {
            for (int j = 0; j<park[i].length; j++) {
                if (park[i][j].equals("-1")) {
                    int tmp = mat_size(park, i, j);
                    if (tmp > answer) {
                        for (int k = 0; k<mats.length; k++) {
                            if (tmp == mats[k]) {
                                answer = tmp;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
    
    int mat_size(String[][] park, int i, int j) {
        int size = 0;
        int cnt = 0;
        boolean flag = true;
        while (true) {
            flag = true;
            if (cnt + i >= park.length || cnt + j >= park[0].length) {
                break;
            }
            for (int di = i; di <= i+cnt; di++) {
                for (int dj = j; dj <= j+cnt; dj++) {
                    if (!park[di][dj].equals("-1")) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    break;
                }
            }            
            cnt++;
            if (flag) {
                size = cnt;
            }
        }
        return size;
    }
}