import java.lang.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[][] map1 = new String[n][n];
        String[][] map2 = new String[n][n];
        String[][] total_map = new String[n][n];
        
        for (int i = 0; i < n; i++) {
            answer[i] = "";
            for (int j = 0; j < n; j++) {
                map1[i][j] = " ";
                map2[i][j] = " ";
                total_map[i][j] = " ";
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            String Binary = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
            for (int j = 0; j < Binary.length(); j++) {
                if (Binary.charAt(j) == '1') {
                    map1[i][j] = "#";
                }
            }
        }
        
        for (int i = 0; i < arr2.length; i++) {
            String Binary = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');
            for (int j = 0; j < Binary.length(); j++) {
                if (Binary.charAt(j) == '1') {
                    map2[i][j] = "#";
                }
            }
        }
        
        for (int i = 0; i < total_map.length; i++) {
            for (int j = 0; j < total_map[i].length; j++) {
                if (map1[i][j].equals("#") || map2[i][j].equals("#")) {
                    total_map[i][j] = "#";
                }
                answer[i] += total_map[i][j];
            }
        }
        return answer;
    }
}
