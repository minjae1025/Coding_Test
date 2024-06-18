class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int cnt = arr.length;
        for (int i = 0; i<arr.length; i++) {
            for (int j = 0; j<delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    cnt--;
                }
            }
        }
        int[] answer = new int[cnt];
        cnt = 0;
        int k = 0;
        int j;
        for (int i = 0; i<arr.length; i++) {
            for (j = 0; j<delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    cnt = 1;
                }
            }
            if (cnt == 0)
                answer[k++]=arr[i];
            cnt = 0;
        }
        return answer;
    }
}