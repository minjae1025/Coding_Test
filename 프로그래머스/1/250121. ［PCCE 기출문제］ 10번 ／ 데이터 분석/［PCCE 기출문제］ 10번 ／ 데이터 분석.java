import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int cnt = 0;
        int ext_num;
        if (ext.equals("code")) {
            ext_num = 0;
            cnt = getSize(ext_num, data, val_ext);
        }
        else if (ext.equals("date")) {
            ext_num = 1;
            cnt = getSize(ext_num, data, val_ext);
        }
        else if (ext.equals("maximum")) {
            ext_num = 2;
            cnt = getSize(ext_num, data, val_ext);
        }
        else {
            ext_num = 3;
            cnt = getSize(ext_num, data, val_ext);
        }

        int[][] answer = new int[cnt][4];
        int idx = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i][ext_num] < val_ext) {
                answer[idx++] = data[i];
            }
        }

        int sort_col;
        if (sort_by.equals("code")) {
            sort_col = 0;
        } else if (sort_by.equals("date")) {
            sort_col = 1;
        } else if (sort_by.equals("maximum")) {
            sort_col = 2;
        } else {
            sort_col = 3;
        }

        // 람다 표현식을 사용하여 answer 배열 정렬 <- GPT 참고
        Arrays.sort(answer, (a, b) -> Integer.compare(a[sort_col], b[sort_col]));

        return answer;
    }

    static int getSize(int info, int[][] data, int val_ext) {
        int cnt = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i][info] < val_ext) {
                cnt++;
            }
        }
        return cnt;
    }
}
